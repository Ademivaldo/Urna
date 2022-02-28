package programa;

public class Candidatos {
     public String nome;    
     public int codigo;



public Candidatos(String nome, int codigo){
    this.nome = nome;
    this.codigo = codigo;
}



@Override
public String toString() {
    return "Candidato [codigo=" + codigo + ", nome=" + nome + "]";
}

}
