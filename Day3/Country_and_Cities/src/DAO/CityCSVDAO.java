/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import country_and_cities.City;
import country_and_cities.Country;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amgad
 */
public class CityCSVDAO {
    
     public CityCSVDAO() {
    }
    public List<City> readCityFromCsv(String fileName){
        List<City>  City_list= new ArrayList<City>() ;
        File Cities = new File(fileName);
        List <String> records;
        records = new ArrayList<String>() ;
        try {
            records = (List<String>) Files.readAllLines(Cities.toPath());
            
            
        }
        catch(Exception e){
        System.out.println("An Issue Has been Occured " + e);
        
        }
        for(int index=1 ; index< records.size() ; index++){
           String record = records.get(index);
 

           String[] fields = record.split(",");
           
           City new_City = createCity(fields);
           City_list.add(new_City);}
 
        return City_list;
        
}
    public City createCity(String[] fields ){
        String id=fields[0].trim();
        String name=fields[1].trim();
        String country_code=fields[2].trim();
        String capital=fields[3].trim();
        String population;
        if (fields.length < 5){
        population="0";
        }else{
        population=fields[4].trim();
        }
 
        City new_City = new City(id,name,country_code,capital,population );
        return new_City;
        
        
        
        

    
    }
    
    
}
