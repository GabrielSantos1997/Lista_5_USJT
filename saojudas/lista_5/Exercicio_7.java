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
public class Exercicio_7 {
    public static void main(String args[])throws Exception {
		
		Scanner tc = new Scanner(System.in);
		
		int cont;
		int prest = 0;
		double valortotal;
		double parcelacalculada = 0;
		
		System.out.print("\nPressione 1 para inciar ou 2 para sair do programa: ");
		
		cont = tc.nextInt();
		
		while (cont == 1) {
			
			System.out.print("\nFavor informar o valor da prestação:R$ ");
			double prestacao = tc.nextDouble();
			System.out.print("\nFavor informar os dias em atraso: ");
			int dias = tc.nextInt();
			
			valortotal = valorpgto(prestacao, dias);
			
			System.out.print("\n\nO valor a ser pago por esta prestação é:R$ "+valortotal);
			
			parcelacalculada = parcelacalculada+valortotal;
			
			System.out.print("\n\nDeseja informar outra prestação? 1 - Sim 2 - Não: ");
			
			cont = tc.nextInt();
			
			prest++;

            tc.close();
			
		}
		
		
		    System.out.print("\nRelatório dia:\nQuantidade de prestações: "+prest);
            System.out.print("\nValor total a pagar(acrescido de juros caso haja): R$ "+parcelacalculada);
							
	}
	
	public static double valorpgto(double prestacao, int dias) {
		
		if(dias!=0) {
			prestacao = prestacao + (prestacao*0.03) + (dias * (prestacao*0.001));
                    }
		return prestacao;
	}
}
