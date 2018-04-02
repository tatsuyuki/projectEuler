/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author mike
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 999;
        int b = 999;
        int product = 0;
        String text = "";
        ArrayList<Integer> palindrome = new ArrayList<Integer>();
        
        //multiply the numbers;
        while (true) {
            int larger = 0;
            product = a * b;
            System.out.println(a + "*" + b);
            text = Integer.toString(product);
            System.out.println(text);
            System.out.println(text.length());
            String reverseText = "";
            for(int i = text.length()-1; i >= 0; i--) {
                reverseText = reverseText + text.charAt(i);
            }
            if(text.equals(reverseText)) {
                System.out.println(text + "&" + reverseText);
                palindrome.add(Integer.parseInt(text));               
            }
            if(b > 100) {
                b--;
            } else if(a > 100) {
                a--;
                b = 999;
            } else {
                System.out.println(text);
                System.out.println(reverseText);
                break;
            }
                  
        }
        Collections.sort(palindrome);
        for (Integer i : palindrome) {
            System.out.println(i);
        }
        
    }
    

    
}
