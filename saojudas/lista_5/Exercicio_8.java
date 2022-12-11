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
public class Exercicio_8 {
    public static void main(String[] args) throws Exception {

        Scanner tc = new Scanner(System.in);
        System.out.print("Favor informar um número: ");
        String numero = tc.nextLine();
        tc.close();

        digitos(numero);

    }

    static void digitos(String numero){
        System.out.println("\nA quantidade de dígitos do número informado é: "+numero.length());
    }
}
