/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem3;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author mike
 */
public class Problem3Long {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.print("Input Number: ");
        long pN = reader.nextLong();
        int sN = (int)Math.round(Math.sqrt(pN));
        
        ArrayList<Integer> prime = new ArrayList<Integer>();
        ArrayList<Integer> primeFactor = new ArrayList<Integer>();
        
        for (int i = 2; i < sN; i = i + 2) {
            int count = 0;
            for (int j = 2; j < i; j = j + 2) {
                if(i % j == 0) {
                    count++;
                }
            }
            if(count <= 1) {
                prime.add(i);
                if(pN % i == 0) {
                    primeFactor.add(i);
                }
            }
        }
        
        //for (Integer p : prime) {
        //    if(pN % p == 0) {
        //        primeFactor.add(p);
        //    }
        
        System.out.println("prime numbers: " + prime);
        System.out.println("prime factors: " + primeFactor);
        
        
    }
    
    
            
    
}
