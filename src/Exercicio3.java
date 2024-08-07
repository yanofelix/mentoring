import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);

	        System.out.print("Digite um caractere: ");
	        char caractere = sc.next().charAt(0);

	        if (Character.isDigit(caractere)) {
	            System.out.println("Número");
	        } else if (Character.isLetter(caractere)) {
	            switch (Character.toLowerCase(caractere)) {
	                case 'a':
	                case 'e':
	                case 'i':
	                case 'o':
	                case 'u':
	                    System.out.println("Vogal");
	                    break;
	                default:
	                    System.out.println("Consoante");
	                    break;
	            }
	        } else {
	            System.out.println("Caractere especial");
	        }

	        sc.close();
	}
}
