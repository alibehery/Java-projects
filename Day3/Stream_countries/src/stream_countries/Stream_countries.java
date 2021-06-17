/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream_countries;

import DAO.CityCSVDAO;
import DAO.Country_CSVDAO;
import country_and_cities.City;
import country_and_cities.Country;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author amgad
 */
public class Stream_countries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        String file_countries="C:\\Users\\amgad\\Desktop\\ITI Mansoura\\Java Development SE\\countries.csv";
        String file_cities="C:\\Users\\amgad\\Desktop\\ITI Mansoura\\Java Development SE\\cities.csv";
        
        CityCSVDAO city_DAO = new CityCSVDAO();
        Country_CSVDAO country_DAO = new Country_CSVDAO();
        List<City> cities =  city_DAO.readCityFromCsv(file_cities);
        List<Country> countries =  country_DAO.readCountryFromCsv(file_countries);
        
        List<City> cits;
        Map<Country , List<City>> city_by_code = new HashMap< >();
        
        for(Country c : countries){
            cits=new ArrayList<> ();
            
            for (City cc : cities){
                if(cc.getCountry_code().equals(c.getCode())){
                    
                    cits.add(cc);   
                    }
                }
             city_by_code.put(c ,cits );
            }
     //Highest population for each country   
     city_by_code.forEach((k,v)-> System.out.println(k + "  "+v.stream().max(Comparator.comparing(City::getPopulation))));
      
      
     
    //Highest Capital (Primay) population for all cities
     Optional <City> highest_capital= cities.stream().filter(c->c.getCapital().equals("primary")).max(Comparator.comparing(City::getPopulation));
      System.out.println(highest_capital);
     
        }
    
}
    

