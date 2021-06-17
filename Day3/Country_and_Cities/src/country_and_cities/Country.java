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
public class Country {
    private String name;
    private String code;
    
    public Country (String name , String code){
    this.code=code;
    this.name=name;
    
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
}
