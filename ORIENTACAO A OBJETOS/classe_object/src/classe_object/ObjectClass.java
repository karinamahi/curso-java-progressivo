package classe_object;

public class ObjectClass {
	
	public static void main(String[] args){
		
		ClasseTeste classe1 = new ClasseTeste();
		ClasseTeste classe2 = new ClasseTeste();
		
		System.out.println("\nget Class() da classeTeste: " + classe1.getClass());
		System.out.println("get Class() da classeTeste2: " + classe2.getClass());
		
		Object classe3 = classe2.clone();
		//classeTeste2 classe3 = (classeTeste2) classe2.clone();
		System.out.println("\nO objeto classe3 é clone ao classe2 ? " + classe3.equals(classe2));
		
		System.out.println("\ntoString da classe1: " + classe1.toString());
		System.out.println("\ntoString da classe2: " + classe2.toString());
		
		System.out.println("\nObjeto classe1 é igual classe2? " + classe2.equals(classe1));
		System.out.println("\nObjeto classe1 é igual classe1? " + classe1.equals(classe1));
		System.out.println("\nObjeto classe2 é igual classe3? " + classe2.equals(classe3));
		
		System.out.println("\nHash code da classe1: " + classe1.hashCode());
		System.out.println("Hash code da classe2: " + classe2.hashCode());
		System.out.println("Hash code da classe3: " + classe3.hashCode());
		
	}
}
