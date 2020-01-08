package com.sunxupeng.service;

import com.sunxupeng.dao.UserDao;
import com.sunxupeng.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userdao;
    @Override
    public void add(User user) {
        userdao.save(user);

    }

    @Override
    public void update(User user) {
        userdao.saveAndFlush(user);
    }

    @Override
    public void delete(Long id) {
        userdao.deleteById(id);
    }

    @Override
    public User findOne(Long id) {
        Optional<User> optional = userdao.findById(id);
        if(optional.isPresent()){
            return optional.get();

        }
        return null;
    }

    @Override
    public List<User> findAll() {

        return userdao.findAll();
    }
}
