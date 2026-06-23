package revisao;

public class LacoFor {
    public static void main(String[] args) {
        /*-Scanner leia = new Scanner(System.in);

        System.out.print("digite um numero para aplicar na tabuada");
        int num = leia.nextInt();

        for (int i =0; i <= 10; i++){
            System.out.printf("%d x %d = %d\n",num,i,num*i);*/

        for (int i =1; i <= 10; i++){
            for (int j=1; j <= 10; j++){
            System.out.printf("%d x %d = %d\n",i,j,j*i);}
        }
    }
}
