/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pyramids_DAO;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amgad
 */
public class PyramidCSVDAO {

    public PyramidCSVDAO() {
    }
    public List<Pyramid> readPyramidFromCsv(String fileName){
        List<Pyramid>  pyramid_list= new ArrayList<Pyramid>() ;
        File pyramid = new File(fileName);
        List <String> records;
        records = new ArrayList<String>() ;
        try {
            records = (List<String>) Files.readAllLines(pyramid.toPath());
            
            
        }
        catch(Exception e){
        System.out.println("An Issue Has been Occured " + e);
        
        }
        for(int index=1 ; index< records.size() ; index++){
           String record = records.get(index);
           String[] fields = record.split(",");
           
           Pyramid new_pyramid = createPyramid(fields);
           if(new_pyramid.getHeight()==-1){continue;}
           pyramid_list.add(new_pyramid);
        }
        return pyramid_list;
        
}
    public Pyramid createPyramid(String[] fields ){
        double height;
        String pharouh = fields[0].trim();
        String modern_name = fields[2].trim();
        String site = fields[4].trim();
        try{
        height = Double.parseDouble(fields[7].trim()); 
        }catch (Exception e ){
         height = -1;
        }
        Pyramid new_pyramid = new Pyramid(pharouh,modern_name,site,height );
        return new_pyramid;
        
        
        
        

    
    }
}
