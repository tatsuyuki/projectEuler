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
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 2000000;
        int sqrtN = (int) Math.sqrt(n);
        int sum = 2;
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        
        for(int i = 3; i <= sqrtN; i++) {
            int count = 0;
            for(int j = 3; j < i; j = j + 2){
                if(i % j == 0) {
                    count++;
                }
            }
            if(count <= 1) {
                primes.add(i);
                sum = sum + i;
            }
        }
        System.out.println(primes);
        System.out.println(sum);
        
        
    }
    
}
