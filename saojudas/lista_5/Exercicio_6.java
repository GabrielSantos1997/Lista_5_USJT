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
public class Exercicio_6 {
    public static void main(String[] args) throws Exception {
        Scanner tc = new Scanner(System.in);
        
        int loop = 1;

        while(loop==1){
        
        System.out.print("Favor informar a ser convertida: ");
        int hora = tc.nextInt();
        System.out.print("Favor informar os minutos: ");
        int minuto = tc.nextInt();

        int converthora=conversor(hora);
        amPm(converthora, minuto, hora);
        System.out.println("Deseja converter novamente? (1 - Sim) / (2 - Não)");
        loop = tc.nextInt();
        }
        System.out.print("\nAté a próxima!");
        tc.close();
    }

    static int conversor(int hora){
        if(hora==0){
            hora = 12;
        }else if(hora>=13){
            hora = hora - 12;
        }
        return hora;
    }

    static void amPm(int converthora, int minuto, int hora){
        if(hora>=0&&hora<12){
            System.out.println("\nHora convertida: "+converthora+":"+minuto+" A.M.");
        }else{
            System.out.println("\nHora convertida: "+converthora+":"+minuto+" P.M.");
        }
    }
}
