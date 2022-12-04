package com.my.SQLiExample.db;

import org.springframework.jdbc.core.JdbcTemplate;

public interface Db {
    public JdbcTemplate getJdbcTemplate();
}
