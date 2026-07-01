import java.util.ArrayList;
import java.util.List;

public class Vetor {
    public static void main(String[] args) {
            int [] numeros = { 1,2,3,4,5};
            numeros [4] = 6;

            double[] notas = new double[4];
            notas[0] = 8.8;
            notas[1] = 7.8;
            notas[2] = 9.8;
            notas[3] = 9.7;

            String[] nomes = new String[8];
            Integer[] contas = new Integer[8];
            double[] nts = new double[6];
            boolean[] maiores = new boolean[9];

         //   Integer.parseInt("1");
         //   Double.parseDouble("23");
         //   Boolean.toString();

            List<String> listaAlunos = new ArrayList<>();
            listaAlunos.add("Arthur");
            listaAlunos.add("Jaqueline");
            listaAlunos.add("Amanda");
            listaAlunos.add("Luan");

            listaAlunos.forEach(i -> System.out.println(i));
            listaAlunos.forEach(System.out::println);

            List<Double> listaNotas = new ArrayList<>();
            listaNotas.add(9.8);
            listaNotas.add(9.0);
            listaNotas.add(8.5);
            double soma = 0;
            System.out.println(listaNotas.contains(9.0));

            }

}
