package com.my.SQLiExample.repository;

import com.my.SQLiExample.db.impl.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserTableRepository extends JpaRepository<UserTable, Long> {}
