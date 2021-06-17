/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pyramids_DAO;

/**
 *
 * @author amgad
 */
public class Pyramid {
    private String  pharouh ;
    private String modern_name;
    private String site ;
    private double height ;

    
            

    public Pyramid( String pharouh,String  modern_name , String site, double height ) {
        this.pharouh= pharouh;
        this.modern_name=modern_name;
        this.site=site;
        this.height=height;
        
    }
  

 
    public void setPharouh(String pharouh) {
        this.pharouh = pharouh;
    }

    public void setModern_name(String modern_name) {
        this.modern_name = modern_name;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getPharouh() {
        return pharouh;
    }

    public String getModern_name() {
        return modern_name;
    }

    public String getSite() {
        return site;
    }

    public double getHeight() {
        return height;
    }
    
    
}

