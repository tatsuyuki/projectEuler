/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem10;

import java.util.ArrayList;

/**
 *
 * @author mike
 * 

 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

 * Find the sum of all the primes below two million.

 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 2000000;
        boolean[] primes = new boolean[n + 1];
        long sum = 0L;
        for (int i = 2; i <= n; i++) {
            if(!primes[i]) {
                
                sum += i;
                for (int k = 2 * i; k <= n; k += i) {
                    primes[k] = true;
                }
            }
        }
        System.out.println(sum);        
        
    }
    
}
