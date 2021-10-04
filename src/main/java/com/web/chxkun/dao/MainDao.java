package com.web.chxkun.dao;

import com.web.chxkun.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainDao extends JpaRepository<User, Long> {
}
