package ru.itmo.blps.lab3.config;

import bitronix.tm.BitronixTransactionManager;
import bitronix.tm.TransactionManagerServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.jta.JtaTransactionManager;

import javax.transaction.TransactionManager;

@Configuration
@EnableTransactionManagement
public class BitronixConfig {
    @Bean
    public BitronixTransactionManager
        bitronixTransactionManager() throws Throwable {

        TransactionManagerServices.getConfiguration().setResourceConfigurationFilename(getClass().getResource("/bitronix.properties").getPath());
        return TransactionManagerServices.getTransactionManager();
    }

    @Bean
    @DependsOn({"bitronixTransactionManager"})
    public PlatformTransactionManager
        transactionManager(TransactionManager bitronixTransactionManager) throws Throwable{
        return new JtaTransactionManager(bitronixTransactionManager);
    }
}


