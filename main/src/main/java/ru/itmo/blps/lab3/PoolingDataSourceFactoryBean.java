package ru.itmo.blps.lab3;

import bitronix.tm.resource.common.ResourceBean;
import bitronix.tm.resource.jdbc.PoolingDataSource;
import bitronix.tm.utils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;

public class PoolingDataSourceFactoryBean extends ResourceBean implements FactoryBean<PoolingDataSource>, DisposableBean {
   private static final Logger log = LoggerFactory.getLogger(PoolingDataSourceFactoryBean.class);

   private PoolingDataSource ds;

   public boolean isSingleton(){
      return true;
   }

   @Override
   public void destroy() throws Exception {
      if (ds != null){
         log.debug("Closing PoolingDataSource with id '{}'", ds.getUniqueName());
         ds.close();
         ds = null;
      }
   }

   @Override
   public PoolingDataSource getObject() throws Exception {
       if (ds == null){
          ds = new PoolingDataSource();
          PropertyUtils.setProperties(ds, PropertyUtils.getProperties(this));

          log.debug("Initializing PoolingDataSource with id '{}'", ds.getUniqueName());
          ds.init();
       }
       return ds;
   }

   @Override
   public Class<PoolingDataSource> getObjectType() {
      return PoolingDataSource.class;
   }
}
