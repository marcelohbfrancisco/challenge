import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner inputScann = new Scanner(System.in); // Criando um scanner para ler a entrada de dados do console.
        System.out.println("Informe o número inteiro desejado:");

        try {
            int number = inputScann.nextInt(); // Checa se a entrada é de um tipo válido.
            if (number <= 0) { // Checa se o número de entrada não é um número negativo.
                System.out.println("Número inválido. Digite um número positivo maior que zero.");
            } else {
                if (isFibonacci(number)) { // Caso o método isFibonacci retorne um valor true, então teremos a seguinte saída de dados.
                    System.out.println(number + " está na sequência de Fibonacci.");
                } else { // Caso o método isFibonacci não retorne um valor true, então teremos a seguinte saída de dados.
                    System.out.println(number + " não está na sequência de Fibonacci.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: entrada de dados inválida, digite um número válido.");
        } finally {
            inputScann.close(); // Fecha o scanner.
        }
    }

    /**
     * Método executa o processamento, calculando todos os números da tabela de Fibonacci até que tenha ultrapassado o número solicitado.
     * @param number
     * @return método retorna um valor booleano.
     */
    public static boolean isFibonacci(int number) {
        if (number == 0 || number == 1) return true;

        int prior = 0;
        int current = 1;

        while (current < number) {
            int temp = current;
            current += prior;
            prior = temp;
        }

        return current == number;
    }
}
