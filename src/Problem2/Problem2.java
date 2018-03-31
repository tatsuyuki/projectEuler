/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem2;
import java.util.ArrayList;

/**
 *
 * @author mike
 */
public class Problem2 {
    
    public static void main(String[] args) {
        int maxValue = 4000000;
        int sum = 0;
        int fiboNum = 0;
        int fiboCondi = 0;
        ArrayList<Integer> fiboSeq = new ArrayList<Integer>();
        
        for(int i = 0; fiboNum < maxValue; i++) {
            if(i == 0) {
                fiboNum = 0;
            } else if(i == 1) {
                fiboNum = 1;
            } else {
                fiboNum = fiboSeq.get(i-1) + fiboSeq.get(i-2);
            }
            if(fiboNum > maxValue) {
                break;
            }
            fiboSeq.add(fiboNum);            
        }
        
        for(Integer j : fiboSeq) {
            if(j % 2 == 0) {
                sum = sum + j;
            }
        }
        
        System.out.println(sum);
    }
    
    
}
