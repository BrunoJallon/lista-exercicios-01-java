import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numeroInformado = scanner.nextInt();

        System.out.println("Números primos entre 2 e " + numeroInformado + ":");

        for (int numero = 2; numero <= numeroInformado; numero++) {
            boolean primo = true;

            for (int f = 2; f < numero; f++) {
                if (numero % f == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.print(numero + " ");
            }
        }
        scanner.close();
    }
}