import java.util.Arrays;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     double[] notas = new double[4];
	     
	     for (int i = 0; i < 4; i++) {
	    	 System.out.print("Digite a nota " + (i + 1) + ": ");
	         notas[i] = sc.nextDouble();
	     }
	     
	     Arrays.sort(notas);
	     double soma = 0;
	     for (int i = 1; i < notas.length; i++) {
	         soma += notas[i];
	     }
	     
	     double media = soma / 3;
	     System.out.printf("A média das três maiores notas é: %.2f\n", media);
	     sc.close();
	    }
}
