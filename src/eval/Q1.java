/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval;

import java.util.Scanner;

/**
 *
 * @author Thierry
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       final int n =3;
       int []tab =new int[n];
       
        for (int i = 0; i < n; i++) {
            System.out.println("Saisir un nombre");
            tab[i]=reader.nextInt();
            
        }
        
        for (int i = 0; i < n; i++) {
           
        
            
            System.out.println(tab[i]);  
        } 
    }
    
}
