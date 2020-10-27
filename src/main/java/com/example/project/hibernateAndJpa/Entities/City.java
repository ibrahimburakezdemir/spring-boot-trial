/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.project.hibernateAndJpa.Entities;

/**
 *
 * @author ibrah
 */
public class City {
    private int id;
    private String name;
    private String countryCode;
    private String district;
    private int population;
    public City(int id, String name, String countryCode, String district, int population){
        super();
        this.id=id;
        this.name=name;
        this.countryCode=countryCode;
        this.district=district;
        this.population=population;
    }
}
