package revisao;

import java.util.Scanner;

public class LacoWhile {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String continuar;


        do {
            System.out.println("ola mundo");
            System.out.println("Quer continuar: s/n");
            continuar = leia.nextLine();
        } while (continuar.equalsIgnoreCase("s"));
    }
}
