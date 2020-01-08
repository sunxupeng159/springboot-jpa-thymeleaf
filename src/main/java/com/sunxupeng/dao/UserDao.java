package com.sunxupeng.dao;

import com.sunxupeng.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {

}
