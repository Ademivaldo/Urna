package programa;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacao{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
       
    System.out.println("Projeto de urna roubada: ");

    System.out.println("Quantos candidatos? ");
    Integer totCandidatos = sc.nextInt();
    sc.nextLine();
    Candidatos[][] candidados = new Candidatos[totCandidatos][2];

    for(int i = 0; i<totCandidatos; i++){
        System.out.print("Digite o nome do participante e o codigo: ");
        String nome = sc.nextLine();
        String codigo = sc.nextLine();
     
       
    }
    System.out.println("Qual participante quer que ganhe?");
    for(int i = 0; i < candidatos[][].length; i++){
        System.out.println("candidato " + candidatos[i] + " digite " + i);
        System.out.println("por quantos?: ");
        diferenca1 = sc.nextInt();
        sc.nextLine();
    }
   
    System.out.print(" :: ");
    int campeao = sc.nextInt();
    sc.nextLine();

    System.out.println("votação: ");
    System.out.println("Quantos vão votar?");
    int participantes = sc.nextInt();
    int eleitores[] = new int[participantes];

    switch(campeao){
        case 0:
        for(int i = 0; i<eleitores.length ; i++){
        System.out.println("Digite seu nome e o codigo do candidato: ");
        String nomeELei = sc.nextLine();
        int codigo = sc.nextInt();
        if(codigo == 0){
        candidatos[0] = ;
            
        }
    
        }
    }
    

    sc.close();
    }
}