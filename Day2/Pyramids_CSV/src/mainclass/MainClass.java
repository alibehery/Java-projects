/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import java.util.List;

/**
 *
 * @author amgad
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String fileName="C:\\Users\\amgad\\Downloads\\pyramids.csv";
        int i=0;
        
        PyramidCSVDAO pDAO = new PyramidCSVDAO();
        List<Pyramid> pyramids =  pDAO.readPyramidFromCsv(fileName);
        for(Pyramid p  : pyramids ){
        System.out.println("#"+(i++) + " pharous Name : "+p.getPharouh()
        + ", Modern Name : "+p.getModern_name()
        + ", Site : "+p.getSite()
        + ", Height : "+p.getHeight());
        }
        

    }
    
}
