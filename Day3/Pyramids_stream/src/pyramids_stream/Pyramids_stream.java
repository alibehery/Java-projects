/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids_stream;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import Pyramids_DAO.Pyramid;
import Pyramids_DAO.PyramidCSVDAO;

/**
 *
 * @author amgad
 */
public class Pyramids_stream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String fileName="C:\\Users\\amgad\\Downloads\\pyramids.csv";
        
        PyramidCSVDAO pDAO = new PyramidCSVDAO();
        List<Pyramid> pyramids =  pDAO.readPyramidFromCsv(fileName);
       
        List <Pyramid> pyramids_sorted_heights = pyramids.stream().sorted(Comparator.comparing(Pyramid::getHeight)).collect(Collectors.toList());
       double med;
       int len=pyramids_sorted_heights.size();
       med=get_med_pyrsmids(pyramids_sorted_heights);
        List <Pyramid> lower_half= pyramids_sorted_heights.subList(0, len/2 );
        List <Pyramid>upper_half=pyramids_sorted_heights.subList( len/2 ,len);
        OptionalDouble mean=get_mean_pyrsmids(pyramids);

        double lower_quartile=get_med_pyrsmids(lower_half);
        double upper_quartile=get_med_pyrsmids(upper_half);
        System.out.println("Median " + med +" Mean  "+mean + " lower Quartile : " +lower_quartile+" upper Quartile : " +upper_quartile  );
        
        
    }
    
    
        public static OptionalDouble get_mean_pyrsmids(List<Pyramid> l){
        return l.stream().mapToDouble(Pyramid::getHeight).average();
        
        }

    public static double get_med_pyrsmids(List<Pyramid> l){
    
     int len=l.size();
        
        double med;
        if(len%2==0){
        med= (l.get(len/2).getHeight()+l.get((len/2)+1).getHeight())/2;
        
        }else{
          med= l.get((int)(len/2)).getHeight();
        }
      return med;
    }
}
