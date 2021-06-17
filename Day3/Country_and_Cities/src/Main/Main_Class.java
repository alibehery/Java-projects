/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import DAO.CityCSVDAO;
import DAO.Country_CSVDAO;
import country_and_cities.City;
import country_and_cities.Country;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author amgad
 */
public class Main_Class {
    
    public static void main(String[] args) {
       
        String file_countries="C:\\Users\\amgad\\Desktop\\ITI Mansoura\\Java Development SE\\countries.csv";
        String file_cities="C:\\Users\\amgad\\Desktop\\ITI Mansoura\\Java Development SE\\cities.csv";
        
        CityCSVDAO city_DAO = new CityCSVDAO();
        Country_CSVDAO country_DAO = new Country_CSVDAO();
        List<City> cities =  city_DAO.readCityFromCsv(file_cities);
        List<Country> countries =  country_DAO.readCountryFromCsv(file_countries);
        Map<Country , List<City>> city_by_code = new HashMap< >();
        Map<Country , List<City>> city_by_code_sorted = new HashMap< >();

        List<City> cits;

       
        for(Country c : countries){
            cits=new ArrayList<> ();
            for (City cc : cities){
                if(cc.getCountry_code().equals(c.getCode())){  
                    cits.add(cc);   
                 }
                }
             city_by_code.put(c ,cits );
            }
        
        System.out.println(city_by_code.size());
        city_by_code.forEach((k,v)-> {
            System.out.println("Country Name :"+k+" Cities : "+v );
            System.out.println("Country Name :"+k +" Cities : "+ v.stream().sorted (Comparator.comparing(City::getPopulation)).toList());
            city_by_code_sorted.put(k, v.stream().sorted(Comparator.comparing(City::getPopulation)).toList());  
                });
        
      
        }
        
      
    }
    

