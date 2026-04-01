import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        
    Scanner leitor = new Scanner (System.in);

    System.out.println("Qual foi o valor do seu produto:");
    double produto = leitor.nextDouble();

    System.out.println("Qual foi a quantidade que vocêcomprou desse produto:");
    int quantidade = leitor.nextInt();

    double valor = produto*quantidade;
    if(valor > 100);{
        valor = valor - valor*0.08;
    System.out.print("vocêteve um desconto de 8%");
    }
    }
}
