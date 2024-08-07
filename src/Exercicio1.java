
public class Exercicio1 {

	public static void main(String[] args) {

		int nadador1 = 15;
        int nadador2 = 23;
        int nadador3 = 6;

        System.out.println("Nadador 1: " + classificaNadador(nadador1));
        System.out.println("Nadador 2: " + classificaNadador(nadador2));
        System.out.println("Nadador 3: " + classificaNadador(nadador3));
    }

    public static String classificaNadador(int idade) {
        if (idade >= 5 && idade <= 7) {
            return "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            return "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            return "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            return "Juvenil B";
        } else if (idade >= 18) {
            return "Adulto";
        } else {
            return "Idade fora das categorias";
        }
	}

}
