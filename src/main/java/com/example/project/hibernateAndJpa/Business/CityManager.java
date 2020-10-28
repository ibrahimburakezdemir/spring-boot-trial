/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.project.hibernateAndJpa.Business;

import com.example.project.hibernateAndJpa.DataAccess.ICityDal;
import com.example.project.hibernateAndJpa.Entities.City;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ibrah
 */
@Service
public class CityManager implements ICityService{

    private ICityDal cityDal;

    @Autowired
    public CityManager(ICityDal cityDal) {
        this.cityDal = cityDal;
    }
    
    
    @Override
    @Transactional
    public List<City> getAll() {
        
        return this.cityDal.getAll();
    }

    @Override
    @Transactional
    public void add(City city) {
        this.cityDal.add(city);
    }

    @Override
    @Transactional
    public void update(City city) {
        this.cityDal.update(city);
    }

    @Override
    @Transactional
    public void delete(City city) {
        this.cityDal.delete(city);
    }

    @Override
    @Transactional
    public City getById(int id) {
        return this.cityDal.getById(id);
    }
    
}
