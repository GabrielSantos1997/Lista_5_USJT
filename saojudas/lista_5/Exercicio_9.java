/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package saojudas.lista_5;
import java.util.Scanner;

/**
 *
 * @author Gabri
 */
public class Exercicio_9 {
    public static void main(String[] args) throws Exception {
        Scanner tc = new Scanner(System.in);
        System.out.print("\nFavor informar um número: ");
        int numero = tc.nextInt();
        reverter(numero);

        tc.close();
    }

    public static void reverter(int num1){
        int num2= 0;

		while (num1 > 0) {
		num2 *= 10;
		num2 += (num1 % 10);
		num1 /= 10;

		} 

        System.out.println("O numero invertido é: " + num2);
        
    }
}
