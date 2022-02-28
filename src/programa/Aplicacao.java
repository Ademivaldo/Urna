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
        System.out.print("Digite o nome do participante e o codigo: ");
        String nome = sc.nextLine();
        int codigo = sc.nextInt();
        candidatos[i] = new Candidatos(nome, codigo);
    }

    System.out.print("Digite o codigo do campeão:");
    int campeao = sc.nextInt();
    System.out.println();
    

    // votação

    System.out.println("vamos começar a votação: ");
    System.out.println("candidatos: ");
    for (int i = 0; i < totCandidatos; i++){
        System.out.println(candidatos[i].toString());
    } 

    //do {
        System.out.print("Digite o nome do eleito: ");
        String vazio = sc.nextLine();
        System.out.println("Digite o codigo do candidato: ");
        int voto = sc.nextInt();

    
    }}
    //}while(x == 'n');


  /*  switch(campeao){
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
}*/