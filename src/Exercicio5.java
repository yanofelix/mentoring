import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        final double VALOR_DIARIA_A = 150.00;
        final double VALOR_DIARIA_B = 100.00;
        final double VALOR_DIARIA_C = 75.00;
        final double VALOR_DIARIA_D = 50.00;

        System.out.print("Digite o nome do hospede: ");
        String hospedeNome = sc.nextLine();
		
        
        System.out.println("Digite o tipo do apartamento utilizado(A, B, C ou D): ");
        char tipoApartamento = sc.nextLine().toUpperCase().charAt(0);
        
        System.out.print("Digite o número de diárias utilizadas: ");
        int numeroDiarias = sc.nextInt();
        
        System.out.println("Digite o valor do consumo interno: ");    
        double valorConsumoInterno = sc.nextDouble();
        
        double valorDiaria;
        
        switch (tipoApartamento) {
            case 'A':
                valorDiaria = VALOR_DIARIA_A;
                break;
            case 'B':
                valorDiaria = VALOR_DIARIA_B;
                break;
            case 'C':
                valorDiaria = VALOR_DIARIA_C;
                break;
            case 'D':
                valorDiaria = VALOR_DIARIA_D;
                break;
            default:
                System.out.println("Tipo de apartamento inválido.");
                sc.close();
                return;
        }

        double valorTotalDiarias = numeroDiarias * valorDiaria;
        double subtotal = valorTotalDiarias + valorConsumoInterno;
        double taxaServico = 0.10 * subtotal;
        double totalGeral = subtotal + taxaServico;
        
        System.out.println("\n--- Conta Final do Hóspede ---");
        System.out.println("Nome do Hóspede: " + hospedeNome);
        System.out.println("Tipo do Apartamento: " + tipoApartamento);
        System.out.println("Número de Diárias Utilizadas: " + numeroDiarias);
        System.out.println("Valor Unitário da Diária: R$ " + String.format("%.2f", valorDiaria));
        System.out.println("Valor Total das Diárias: R$ " + String.format("%.2f", valorTotalDiarias));
        System.out.println("Valor do Consumo Interno: R$ " + String.format("%.2f", valorConsumoInterno));
        System.out.println("Subtotal: R$ " + String.format("%.2f", subtotal));
        System.out.println("Valor da Taxa de Serviço (10%): R$ " + String.format("%.2f", taxaServico));
        System.out.println("Total Geral: R$ " + String.format("%.2f", totalGeral));
        
        sc.close();
	}

}
