package com.gmail.rickypaz.databasereplication;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(
//        basePackages = "com.gmail.rickypaz.databasereplication.repository.master",
//        entityManagerFactoryRef = "masterEntityManagerFactory",
//        transactionManagerRef = "masterTransactionManager"
//)
public class MasterDataSourceConfig {

//    @Primary
//    @Bean(name = "masterDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.master")
//    public DataSource dataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Primary
//    @Bean(name = "masterEntityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
//            EntityManagerFactoryBuilder builder,
//            @Qualifier("masterDataSource") DataSource dataSource) {
//        return builder
//                .dataSource(dataSource)
//                .packages("com.gmail.rickypaz.databasereplication.domain")
//                .persistenceUnit("master")
//                .build();
//    }
//
//    @Primary
//    @Bean(name = "masterTransactionManager")
//    public PlatformTransactionManager transactionManager(
//            @Qualifier("masterEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
//        return new JpaTransactionManager(entityManagerFactory);
//    }

}
