package com.gmail.rickypaz.databasereplication;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(
//        basePackages = "com.gmail.rickypaz.databasereplication.repository.replica",
//        entityManagerFactoryRef = "replicaEntityManagerFactory",
//        transactionManagerRef = "replicaTransactionManager"
//)
public class ReplicaDataSourceConfig {

//    @Bean(name = "replicaDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.replica")
//    public DataSource dataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "replicaEntityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
//            EntityManagerFactoryBuilder builder,
//            @Qualifier("replicaDataSource") DataSource dataSource) {
//        return builder
//                .dataSource(dataSource)
//                .packages("com.gmail.rickypaz.databasereplication.domain")
//                .persistenceUnit("replica")
//                .build();
//    }
//
//    @Bean(name = "replicaTransactionManager")
//    public PlatformTransactionManager transactionManager(
//            @Qualifier("replicaEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
//        return new JpaTransactionManager(entityManagerFactory);
//    }

}
