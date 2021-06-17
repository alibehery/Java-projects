/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package two_strings;

/**
 *
 * @author amgad
 */
public class Two_Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String string1="aknscianiccssc";
        String string2="cscs5cscnnnnnnnnnnnnnnnnnnnnnnnnnns";

        String string_longer;
        String string_first;
        boolean has_digits;

        
        string_longer= StringUtils.betterString(string1,string2,(s1,s2)-> s1.length()>s2.length());
        System.out.println(string_longer);
        
        
        string_first= StringUtils.betterString(string2,string1,(s1,s2)-> true);
        System.out.println(string_first);
        
    
        has_digits= StringUtils.isLetter(string1, (s2)-> {
            boolean x=false;
            for(char s:s2.toCharArray()){
            if( Character.isDigit(s)) {
            x=true;
            }
            }
            return x;
        
        });
        System.out.println(has_digits);

    }
    
    
        }
    
