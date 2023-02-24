/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.dao.impl.UserRepositoryCustom;
import com.mycompany.entity.User;
import com.mycompany.service.inter.UserServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Umman Hasan Data Access Object
 */
@Service
@Transactional
public class UserServiceImpl implements UserServiceInter {
    @Qualifier("userDao")
    @Autowired
    private UserRepositoryCustom userDao;
    @Override
    public List<User> getAll(String name, String surname, Integer nationalityId) {
        return userDao.getAll(name, surname, nationalityId);
    }
    @Override
    public User findByUserEmailAndPassword(String email, String password) {
        return userDao.findByUserEmailAndPassword(email, password);
    }
    @Override
    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }
    @Override
    public boolean updateUser(User u) {
        return userDao.updateUser(u);
    }
    @Override
    public boolean removeUser(int id) {
        return userDao.removeUser(id);
    }
    @Override
    public User getById(int userId) {
        return userDao.getById(userId);
    }
    @Override
    public boolean addUser(User u) {
        return userDao.addUser(u);
    }
}
