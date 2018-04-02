/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem9;

/**
 *
 * @author mike
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // a + b + c = 1000
        // a^2 + b^2 = c^2
        // a < b < c
        // find product of abc
        // a + b = 1000 - c
        int sum = 1000;
        int a;
        int b;
        int c;
        int product = 0;
        for(a = 1; a < sum/3; a++) {
            for(b = a + 1; b < sum/2; b++) {
                c = sum - a - b;
                if(c > 0 && ((int)Math.pow(a, 2) + (int)Math.pow(b, 2)) == (int)Math.pow(c,2)){
                    product = a * b * c;
                    System.out.print(a + " * " + b +" * " + c + ": ");
                    System.out.println(product);
            }
            }
        }
        
    }
    
}
