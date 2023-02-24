/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.dao.inter.EmploymentHistoryDaoInter;
import com.mycompany.entity.EmploymentHistory;
import com.mycompany.entity.User;
import com.mycompany.service.inter.AbstractDAO;
import com.mycompany.service.inter.EmploymentHistoryServiceInter;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Umman Hasan
 */
public class EmploymentHistoryServiceImpl  implements EmploymentHistoryServiceInter {
    @Autowired
    private EmploymentHistoryDaoInter employmentHistoryDaoInter;

    private EmploymentHistory getAllEmploymentHistory(ResultSet rs) throws Exception {

        String header = rs.getString("header");
        String jobDescription = rs.getString("job_description");
        Date beginDate = rs.getDate("begin_date");
        Date endDate = rs.getDate("end_date");
        int userId = rs.getInt("user_id");

        EmploymentHistory emp = new EmploymentHistory(null, header, beginDate, endDate, jobDescription, new User(userId));
        return emp;

    }

    @Override
    public List<EmploymentHistory> getAllEmploymentHistoryById(int userId) {
        return employmentHistoryDaoInter.getAllEmploymentHistoryById( userId);
    }

}
