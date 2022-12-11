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
public class Exercicio_5 {
    public static void main(String[] args) throws Exception {
        Scanner tc = new Scanner(System.in);
        System.out.print("Favor informar o valor do produto: ");
        double produto = tc.nextDouble();
        System.out.print("Favor informar a taxa de imposto: ");
        double taxa = tc.nextDouble();
        
        double totalimp=somaimp(taxa, produto);
        System.out.print("\nValor do produto sem imposto: R$"+produto);
        System.out.print("\nTaxa de imposto aplicada: "+taxa);
        System.out.print("\nValor total de imposto: R$"+(totalimp-produto));
        System.out.print("\nValor com imposto: R$"+totalimp);
        
        tc.close();
    }

    static double somaimp(double taxaimp, double custo){
        double total=custo+((custo*taxaimp)/100);
        return total;
    } 
}
