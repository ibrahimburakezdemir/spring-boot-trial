/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.project.hibernateAndJpa.DataAccess;
import com.example.project.hibernateAndJpa.Entities.City;
import java.util.List;
/**
 *
 * @author ibrah
 */
public interface ICityDal {
    List<City> GetAll();
    void add(City city);
    void update(City city);
    void delete(City city);
}