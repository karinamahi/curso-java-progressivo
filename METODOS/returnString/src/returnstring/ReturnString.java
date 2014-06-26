
package returnstring;

public class ReturnString {
    
    public static String mensagem(){
        return "Curso Java Progressivo!";
    }
    
    public static void main(String[] args) {
        System.out.println("Exibindo a mensagem uma vez: " + mensagem());
        
        System.out.println("Exibindo a mensagem três vezes: ");
            for (int count=1; count<=3; count ++){
                System.out.println(mensagem());                
            }
    }
    
}
