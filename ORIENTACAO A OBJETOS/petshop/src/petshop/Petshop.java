
package petshop;

public class Petshop {

    public static void main(String[] args) {
        Cachorro dog1 = new Cachorro();
        dog1.setNome("Totó");
        dog1.setIdade(5);
        System.out.println("Nome :" + dog1.getNome() + "\nIdade: " + dog1.getIdade());
    }
    
}
