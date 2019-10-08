/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.Scanner;

/**
 *
 * @author ipampillonvieitez
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        float gC, gFa, gK;
        System.out.println("dame gC");
        gC = sc.nextFloat();
        gFa =  (gC * 1.8f + 32);
        gK = gC + 273;
        System.out.println(" 5 gC = 27 gK y 8 gFa");
        
        
    }
    
}
