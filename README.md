# lista-exercicios-01-java
Lista de exercícios 01 - Programação Orientada a Objetos

lista-exercicios-01-java
Lista de exercícios 01 - Programação Orientada a Objetos
QUESTÃO 05 —
No que diz respeito ao Scanner, trata-se de uma classe da linguagem Java utilizada para realizar a entrada de dados, permitindo que informações fornecidas pelo usuário por meio do teclado sejam lidas pelo programa. Além disso, para utilizá-lo, faz-se necessário importar a classe por meio do código "import java.util.Scanner;" e, posteriormente, criar um objeto da classe, conforme apresentado no Código 1. Dessa forma, após a criação do objeto Scanner, diferentes métodos podem ser utilizados de acordo com o tipo de dado que será recebido. Por exemplo, para a leitura de valores do tipo double, utiliza-se o método nextDouble(), responsável por realizar a leitura de um número decimal (ponto flutuante) que fora informado. Por outro lado, o System.out.printf, por sua vez, é utilizado para realizar a saída de dados de forma formatada. Diferentemente do System.out.println, o printf permite definir a forma como os valores serão apresentados. No caso de números do tipo double, o especificador %.2f permite determinar que o valor seja exibido com duas casas decimais, conforme demonstrado no Código 1. Portanto, o Scanner é utilizado para realizar a entrada de dados, enquanto o System.out.printf possibilita uma apresentação mais controlada e formatada das informações na saída do programa.

Código 1 — leitura de um double e exibição com 2 casas decimais.
import java.util.Scanner;
public class Questao5 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in); System.out.print("Informe um decimal: ");
double numero = scanner.nextDouble(); System.out.printf("O numero informado foi: %.2f%n", numero);
scanner.close();
}
}
 
Questão 6

import java.util.Scanner;

// Erro 1: A declaração do método main estava incorreta.
// Foi utilizado "String args", mas o método main deve receber
// um vetor de String. Por isso, a correção é "String[] args".
public class Contador {
    public static void main(String[] args) {

        // O nome "sc" utilizado no código original não é um erro.
        // Porém, foi alterado para "scanner" para deixar mais claro
        // que a variável representa um objeto da classe Scanner.
        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        // A condição do while está correta: o laço será executado
        // enquanto o valor de contador for menor ou igual a 5.
        while (contador <= 5) {

            // Erro 2: Faltava o ponto e vírgula (;) no final
            // da instrução System.out.println().
            // A correção foi adicionar ";" ao final do comando.
            System.out.println("Contador: " + contador);

            // Erro 3: Faltava alterar o valor da variável contador
            // dentro do while. Sem o incremento, contador permaneceria
            // sempre igual a 0 e o programa entraria em um loop infinito.
            // A correção foi adicionar "contador++" para incrementar
            // o valor da variável a cada repetição.
            contador++;
        }

        // Fecha o objeto Scanner após sua utilização.
        scanner.close();
    }
}
