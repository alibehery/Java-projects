/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package two_strings;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 *
 * @author amgad
 */
public class StringUtils {
    public static String betterString(String string1 , String string2 ,BiPredicate <String , String> b){
        if(b.test(string1, string2)){
        return string1;
        
        }else{
        return string2;
        
        }
          
    }
    
    public static boolean isLetter(String string , Predicate <String >  k ){
       if(k.test(string)){
        return true;
        }else{
        return false;
        }
}
    
}
