/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country_and_cities;

/**
 *
 * @author amgad
 */
public class City {
    
    private String id;
    private String name;
    private String country_code;
    private String capital;
    private double population;

    public City (String id , String name , String country_code, String capital , double population ){
    this.id=id;
    this.name=name;
    this.country_code=country_code;
    this.capital=capital;
    this.population=population;
    
    
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry_code() {
        return country_code;
    }

    public String getCapital() {
        return capital;
    }

    public double getPopulation() {
        return population;
    }
    @Override
    public String toString() {
        return this.name;
    }
    
}
