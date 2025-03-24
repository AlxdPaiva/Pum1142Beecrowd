/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pum1142beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class Pum1142Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int N = teclado.nextInt();
        int num = 1;
        
        for (int i = 0; i < N; i++) {
            System.out.println(num + " " + (num + 1) + " " +(num + 2) + " " + "PUM");
            num += 4;
        }
    }
    
}
