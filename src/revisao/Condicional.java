package revisao;

import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {

        Scanner escreva = new Scanner(System.in);
        /*escreva.useLocale(Locale.CHINA);*/

        System.out.println("Digite uma altura em metros:");
        double altura = escreva.nextDouble();

        System.out.println("Digite um peso");
        double peso = escreva.nextDouble();

        System.out.printf("O peso é = %.2f e a altura é = %.2f\n",altura,peso);

        double imc = peso / Math.pow(altura,2);

        System.out.printf("o imc é de : %f\n",imc);

        if (imc < 18.5){
            System.out.println("Abaixo do peso");}
        else if (imc >= 18.5 & imc < 25){
            System.out.println("Peso ideal *(parabéns)*");}
        else if (imc >= 25 & imc < 30){
            System.out.println("Levemente acima do peso");}
        else if (imc >= 30 & imc < 35){
            System.out.println("Obesidade Grau I");}
        else {
            System.out.println("Obesidade severa/mórbida");{

        }
        {

        }
    }

        }
    }











