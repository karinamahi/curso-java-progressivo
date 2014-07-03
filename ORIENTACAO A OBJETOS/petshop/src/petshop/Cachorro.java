package petshop;

public class Cachorro {

    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome.toLowerCase();
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    } 
    
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }

   
}
