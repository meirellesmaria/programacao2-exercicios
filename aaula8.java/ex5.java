import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        int[] notas = {7, 8, 6, 10, 9};

        int soma = 0;
        for (int a = 0; a < notas.length; a++) {
            soma += notas[a];

        }

        double media = (double) soma / notas.length;
        System.out.println("Média: " + media);

        int acimaMedia = 0;
        for (int a = 0; a < notas.length; a++) {
            if (notas[a] > media) {
                acimaMedia++;
            }
        }

        System.out.println("notas acima da media: " + acimaMedia);

    }
    
}
