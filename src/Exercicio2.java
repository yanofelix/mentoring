import java.util.Scanner;

public class Exercicio2 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Digite o primeiro operando:");
	        double operando1 = sc.nextDouble();

	        System.out.println("Digite o segundo operando:");
	        double operando2 = sc.nextDouble();

	        System.out.println("Digite o operador (+, -, *, /, %):");
	        char operador = sc.next().charAt(0);

	        double resultado = 0;
	        boolean operadorValido = true;

	        switch (operador) {
	            case '+':
	                resultado = operando1 + operando2;
	                break;
	            case '-':
	                resultado = operando1 - operando2;
	                break;
	            case '*':
	                resultado = operando1 * operando2;
	                break;
	            case '/':
	                if (operando2 != 0) {
	                    resultado = operando1 / operando2;
	                } else {
	                    System.out.println("Erro: Divisão por zero.");
	                    operadorValido = false;
	                }
	                break;
	            case '%':
	                if (operando2 != 0) {
	                    resultado = operando1 % operando2;
	                } else {
	                    System.out.println("Erro: Divisão por zero.");
	                    operadorValido = false;
	                }
	                break;
	            default:
	                System.out.println("Operador desconhecido.");
	                operadorValido = false;
	                break;
	        }

	        if (operadorValido) {
	            System.out.println("Resultado: " + resultado);
	        }

	        sc.close();
	    }

}
