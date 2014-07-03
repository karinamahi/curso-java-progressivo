
package thismetodo;

public class ThisMetodo {

    public static void main(String[] args) {
        String nome = "Neil Peart";
        int id = 2112;
        double salario =  1000000;
        
        Funcionario chefe = new Funcionario(nome, id,salario);
        Funcionario novoChefe = new Funcionario();
        
        chefe.exibir();
    }
    
}
