import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.print("Digite um numero: ");
    int numero = ler.nextInt();

    for (int a=1; a<=10; a++) {
        int resultado = numero*a;
        System.out.println(numero + "X" + a + "=" + resultado);
    }
    }
}
