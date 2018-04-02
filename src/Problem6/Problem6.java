/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem6;

/**
 *
 * @author mike
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 100;
        int sumOfSquare = 0;
        int squareOfSum = 0;
        
        for(int i = 1; i <= n; i++ ){
            sumOfSquare = sumOfSquare + (int) Math.pow(i, 2);
            squareOfSum = squareOfSum + i;
        }
        
        squareOfSum = (int) Math.pow(squareOfSum, 2);
        int diff = squareOfSum - sumOfSquare;
        System.out.println(diff);
        
    }
    
}
