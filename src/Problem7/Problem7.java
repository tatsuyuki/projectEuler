/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem7;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author mike
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.print("Input nth prime: ");
        ArrayList<Integer> prime = new ArrayList<Integer>();
        int n = Integer.parseInt(reader.nextLine());
        
        int primeCount = 0;
        prime.add(2);
        int i = 3;
        while(prime.size() <= n) {
            
            int count = 0;
            for(int j = 3; j <= i; j = j + 2) {
                if(i % j == 0) {
                    count++;
                }
            }
            if(count <= 1) {
                primeCount++;
                prime.add(i);
            }
            i = i + 2;
        }
        
        System.out.println(prime.get(n-1));
    //    for (Integer l : prime) {
    //        System.out.println(l);
    //    }
        
    }
    
}
