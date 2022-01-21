package ru.itmo.blps.lab3.notificationSender;

import com.rabbitmq.jms.admin.RMQConnectionFactory;
import com.rabbitmq.jms.admin.RMQDestination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.support.destination.DestinationResolver;

import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Session;

@Configuration
public class RabbitMqConfig {

    @Bean
    public ConnectionFactory jmsConnectionFactory() {
        return new RMQConnectionFactory();
    }

    @Bean
    public DefaultJmsListenerContainerFactory jmsListenerContainerFactory(@Autowired ConnectionFactory connectionFactory) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);

        factory.setDestinationResolver(new DestinationResolver() {
            @Override
            public Destination resolveDestinationName(Session session, String destinationName, boolean pubSubDomain)  throws JMSException {
                RMQDestination jmsDestination = new RMQDestination();
                jmsDestination.setDestinationName(destinationName);
                jmsDestination.setAmqpQueueName(destinationName);
                jmsDestination.setAmqp(true);
                return jmsDestination;
            }
        });

        factory.setAutoStartup(true);
        return factory;
    }
}