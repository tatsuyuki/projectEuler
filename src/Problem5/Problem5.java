/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem5;

/**
 *
 * @author mike
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 20;
        int multiple = n;
        int modulo = 0;
        boolean test = false;
        
            while(true) {
                int count = 0;
                for(int i = 1; i <= n; i++) {
                    modulo = multiple % i;
                    if(modulo == 0) {
                        count++;
                    } else {
                        break;                                                
                    }
                }
                if(count == n) {                    
                    System.out.println(multiple);
                    break;
                }
                multiple = multiple + n;                                
            }
            
            
        
    }
    
}
