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
public class Q2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        final int li=5, col=2;
        int [][]tab=new int [li][col];
        int max,min;
        //remplissage du tableau
        for (int i = 0; i < li; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Saisir un nombre");
                tab[i][j]=reader.nextInt();
                
            }
            
            
        }
        //initialisation max et min
        max=tab[0][0];
        min=tab[0][0];
        
        //comparaison entre le tableau pour max et min
        for (int i = 0; i < li; i++) {
            for (int j = 0; j < col; j++) {
                if(tab[i][j]>max) max=tab[i][j];
                if(tab[i][j]<min) min = tab[i][j];
            }
            
        }
        
        System.out.println("L'amplitude du tableau est "+ (max-min));
    }
    
}
