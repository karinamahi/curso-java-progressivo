
package metodosgetset;

public class MetodosGetSet {

    public static void main(String[] args) {
        String nome = "Neil Peart";
        int ID = 2112;
        double salario = 100000;
        
        Funcionario chefe = new Funcionario();
        
        chefe.setNome(nome);
        chefe.setID(ID);
        chefe.setSalario(salario);
        
        chefe.exibir();
    }
    
}
