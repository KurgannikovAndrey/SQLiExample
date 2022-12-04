package com.my.SQLiExample.db.impl;

import com.my.SQLiExample.db.Db;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

public class DbImpl implements Db {
    private static Db instance = null;

    public static Db getInstance(){
        if(instance == null){
            instance = new DbImpl();
        }
        return instance;
    }

    private JdbcTemplate jdbcTemplate;


    private DbImpl(){
        SimpleDriverDataSource ds = new SimpleDriverDataSource();
//        ds.setDriverClass();
    }

    @Override
    public JdbcTemplate getJdbcTemplate() {
        return null;
    }
}
