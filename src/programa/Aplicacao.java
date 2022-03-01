package programa;
import programa.Candidatos;
import java.util.Scanner;

public class Aplicacao{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
       
    System.out.println("Projeto de urna roubada: ");

    System.out.println("Quantos candidatos? ");
    int totCandidatos = sc.nextInt();
    sc.nextLine();
    Candidatos[] candidatos = new Candidatos[totCandidatos];

    for(int i = 0; i<totCandidatos; i++){
        System.out.print("Digite o nome do participante: ");
        String nome = sc.nextLine();
        candidatos[i] = new Candidatos(nome, i);
    }

    System.out.print("Digite o codigo do campeão:");
    int campeao = sc.nextInt();
    sc.nextLine();
    System.out.println();

    // votação

    System.out.println("vamos começar a votação: ");
    System.out.println("candidatos: ");
    for (int i = 0; i < totCandidatos; i++){
        System.out.println(candidatos[i].toString());
    } 

    //variavel local
    char x;
    do {
        System.out.print("Digite o nome do eleito: ");
        String vazio = sc.nextLine();
        System.out.println("Digite o codigo do candidato: ");
        int voto = sc.nextInt();

        switch(voto){
            case 0:
            if (campeao == 0){

            }

        }
        
        
        
        
        
        
        System.out.println("Tem mais eleior? [s/n] ");
         x = sc.nextLine().charAt(0);
        
    }while(x != 'n');


 

    sc.close();
    }
 }