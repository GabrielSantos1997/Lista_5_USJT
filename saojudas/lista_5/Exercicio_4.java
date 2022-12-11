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
public class Exercicio_4 {
    public static void main(String[] args) throws Exception {
        Scanner tc = new Scanner (System.in);
        System.out.print("Por favor informe um número: ");
        int num = tc.nextInt();
        tc.close();
        confere(num);
    }
    
    public static void confere(int num){
        if(num<=0){
            System.out.println("N");
        }else{
            System.out.println("P");
        }
    }
}
