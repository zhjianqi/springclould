package com.example.service.config;


import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.util.Properties;


//@Configuration
//@MapperScan("com.*.dao")
public class MybatisConfig {

//    @Autowired
//    private Environment env;
//
//    @Bean
//    public DataSource getDataSource(){
//        Properties props = new Properties();
//        props.put("driverClass", env.getProperty("jdbc.driverClassName"));
//        props.put("url", env.getProperty("jdbc.url"));
//        props.put("username", env.getProperty("jdbc.username"));
//        props.put("password", env.getProperty("jdbc.password"));
//        try {
//            return DruidDataSourceFactory.createDataSource(props);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//    @Bean
//    public SqlSessionFactory sqlSessionFactory(DataSource ds) throws Exception{
//        SqlSessionFactoryBean sfb = new SqlSessionFactoryBean();
//        sfb.setDataSource(ds);
//        //下边两句仅仅用于*.xml文件，如果整个持久层操作不需要使用到xml文件的话（只用注解就可以搞定），则不加
//        sfb.setTypeAliasesPackage(env.getProperty("mybatis.typeAliasesPackage"));
//        sfb.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(env.getProperty("mybatis.mapperLocations")));
//        return sfb.getObject();
//    }
}
