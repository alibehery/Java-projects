/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import country_and_cities.Country;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amgad
 */
public class Country_CSVDAO {
    
     public Country_CSVDAO() {
    }
    public List<Country> readCountryFromCsv(String fileName){
        List<Country>  Country_list= new ArrayList<Country>() ;
        File Countries = new File(fileName);
        List <String> records;
        records = new ArrayList<String>() ;
        try {
            records = (List<String>) Files.readAllLines(Countries.toPath());
            
            
        }
        catch(Exception e){
        System.out.println("An Issue Has been Occured " + e);
        
        }
        for(int index=1 ; index< records.size() ; index++){
           String record = records.get(index);
           String[] fields = record.split(",");
           
           Country new_Country = createCountry(fields);
           Country_list.add(new_Country);
        }
        return Country_list;
        
}
    public Country createCountry(String[] fields ){
        String name = fields[0].trim();
        String code= fields[1].trim();
 
        Country new_Country = new Country(name , code );
        return new_Country;
        
        
        
        

    
    }
    
}
