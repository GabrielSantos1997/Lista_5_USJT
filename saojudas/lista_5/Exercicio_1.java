/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package saojudas.lista_5;

import java.util.Scanner;

/**
 *
 * @author Gabri
 */
public class Exercicio_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int linha = sc.nextInt();

         for (int i = 1; i<=linha; i++) {
             for (int j = 1; j <= i; j++) {
                 System.out.print(i);
                 System.out.print(" ");
             }
             System.out.println(" ");
         }
    }
}
