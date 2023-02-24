/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.dao.inter.CountryDaoInter;
import com.mycompany.entity.Country;
import com.mycompany.service.inter.AbstractDAO;
import com.mycompany.service.inter.CountryServiceInter;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.ResultSet;
import java.util.List;

/**
 * @author Umman Hasan
 */
public class CountryServiceImpl extends AbstractDAO implements CountryServiceInter {
    @Autowired
    private CountryDaoInter countryDao;
    private Integer countryId;
    private String nationality;
    private String countryName;

    private Country getAllCountry(ResultSet rs) throws Exception {
        return (new Country(countryId, nationality, countryName));
    }

    @Override
    public List<Country> getAllCountry() {
        return countryDao.getAllCountry();
    }

}
