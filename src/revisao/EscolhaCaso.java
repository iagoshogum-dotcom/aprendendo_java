package revisao;

import java.util.Scanner;

public class EscolhaCaso {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("escolha uma das operaços abaixo");
        System.out.println("""
                [1] somar
                [2] subtrair
                [3] multiplicar
                [4] dividir 
                [5] potência
                [6] raiz quadrada
                [7] resto da divisão
                [0] sair
                \s""");
        String continuar;
        do {
            System.out.println("escolha uma das operaçoes");
        int escolha = leia.nextInt();
        System.out.println("qual o primeiro numero");
        double num1 = leia.nextDouble();
        System.out.println("qual o segundo numero");
        double num2 = leia.nextDouble();
        switch (escolha){
            case 1:
                System.out.printf("%.0f + %.0f = %.0f\n",num1,num2,num1+num2);
                break;
            case 2:
                System.out.printf("%.0f - %.0f = %.0f\n",num1,num2,num1-num2);
                break;
            case 3:
                System.out.printf("%.0f x %.0f = %.0f\n",num1,num2,num1*num2);
                break;
            case 4:
                System.out.printf("%.0f / %.0f = %.0f\n",num1,num2,num1/num2);
                break;
            case 5:
                System.out.printf("%.0f ^ %.0f = %.0f\n",num1,num2,Math.pow(num1,num2));
                break;
            case 6:
                System.out.printf("%.0f |/--- %.0f = %.0f\n",num1,num2,Math.sqrt(num1)+Math.sqrt(num2));
                break;
            case 7:
                System.out.printf("%.0f // %.0f = %.0f\n",num1,num2,num1%num2);
                break;
            case 0:
                break;
            default:
                System.out.println("opção invalida");}
            System.out.println("deseja continuar? s/n");
            continuar = leia.next();
        }while (continuar.equalsIgnoreCase("s"));
    }

}
