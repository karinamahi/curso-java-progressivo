package br.com.caixasdedialogo;

//import java.util.Scanner;
import javax.swing.JOptionPane;

public class calculaRaiz {
	

	    public static int delta(int a, int b, int c) {
	        int delta;
	        delta = (b * b) - (4 * a * c);
	        return delta;
	    }

	    public static boolean isPositive(int num) {
	        boolean positivo = false;
	        if (num >= 0) {
	            positivo = true;
	        }
	        return positivo;
	    }

	    public static int raizUm(int delta, int a, int b) {
	        return (-b + (int) Math.sqrt(delta)) / 2 * a;
	    }

	    public static int raizDois(int delta, int a, int b) {
	        return (-b - (int) Math.sqrt(delta)) / 2 * a;
	    }

	    public static boolean isZero(int num) {
	        boolean nulo;
	        if (num == 0) {
	            nulo = true;
	        }else{
	        	nulo = false;	
	        }
	        return nulo;
	    }

	    public static void main(String[] args) {
	        int a;
	        int b;
	        int c;
	        String valor;
	        String msgDelta;
	        String msgRaizUm;
	        String msgRaizDois;
	        int delta;
	        int raiz_um;
	        int raiz_dois;
	        boolean nulo;
	        boolean positivo;

	        //Scanner entrada = new Scanner(System.in);

	        valor = JOptionPane.showInputDialog("Digite o valor de a: ");
	        a = Integer.parseInt(valor.trim());

	        valor = JOptionPane.showInputDialog("Digite o valor de b: ");
	        b = Integer.parseInt(valor.trim());

	        valor = JOptionPane.showInputDialog("Digite o valor de c: ");
	        c = Integer.parseInt(valor.trim());

	        delta = delta(a, b, c);
	        msgDelta =  String.format("O valor de delta é %d", delta);
	        
	        JOptionPane.showMessageDialog(null, msgDelta);

	        positivo = isPositive(delta);
	        if(positivo == false){
	            JOptionPane.showMessageDialog(null,"O valor de delta é negativo.Portanto as raízes são complexas."); // falta implementar o cálculo das raízes complexas.
	            return;
	        }
	        nulo = isZero(delta);
	        if (nulo == true) {
	            raiz_um = raizUm(delta, a, b);
	            msgRaizUm = String.format("x' = x'' = %d\n", raiz_um);
	            JOptionPane.showMessageDialog(null, msgRaizUm);
	            
	            
	        } else {
	            raiz_um = raizUm(delta, a, b);
	            msgRaizUm = String.format("x' = %d\n", raiz_um);
	            JOptionPane.showMessageDialog(null, msgRaizUm);
	            
	            raiz_dois = raizDois(delta, a, b);
	            msgRaizDois = String.format("x''= %d\n", raiz_dois);
	            JOptionPane.showMessageDialog(null, msgRaizDois);
	        }
	    }


}
