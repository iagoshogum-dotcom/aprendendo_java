import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 /*       System.out.println("Ola Mundo!");       Terminado com ln voce pula uma linha
        System.out.print("Bem vindo a POO");      O normal vai acabar por juntar com o da proxima linha
        System.out.printf("Print Formatado");     Para usar funçoes
*/
        Scanner leia = new Scanner(System.in);     // voce tras a funçao de scaner e da um nome a ela "leia"

        String nome; int idade;

        System.out.print("Digite seu nome");
        nome = leia.nextLine();

        System.out.println("Digite sua idade");
        idade = Integer.parseInt(leia.nextLine());

        System.out.println("Esse é o " + nome + " e ele tem " + idade + " anos ");
        System.out.printf("Esse é o " + nome + " e ele tem " + idade + " anos \n");
        System.out.printf("Esse é o %s e ele tem %d anos", nome,idade);
    }
}