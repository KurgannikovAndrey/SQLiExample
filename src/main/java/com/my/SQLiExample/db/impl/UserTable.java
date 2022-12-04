package com.my.SQLiExample.db.impl;

import javax.persistence.*;

@Entity
@Table(name = "users_table")
public class UserTable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String username;
    private String password;

    public UserTable(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserTable() {
        this.username = "";
        this.password = "";
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
