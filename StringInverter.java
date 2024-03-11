import java.util.Scanner;
public class StringInverter {
    public static void main(String[] args){
        Scanner inputScann = new Scanner(System.in); // Criando um leitor para a entrada de dados do console.
        System.out.println("Informe o texto: ");
        String text = inputScann.nextLine(); // Criando uma variável para armazenar a entrada de dados.
        String inverted = invertText(text); // Criando uma entrada para armazenar a string já processada.
        System.out.println("Texto original: " + text);
        System.out.println("Texto invertido: " + inverted);
    }

    /**
     * Basicamente consiste em um laço for que irá ler o valor do caractere do último índice da string (-1) e este laço irá percorrer a string do final para o começo através do índice (i--).
     * Concatenamos estes valores na variável (inverted), assim gerando uma string com os caracteres invertidos.
     * @param str
     * @return uma string invertida.
     */
    public static String invertText(String str) {
        String inverted = "";
        for (int i = str.length() - 1; i >= 0; i--){
            inverted += str.charAt(i);
        }
        return inverted;
    }
}
