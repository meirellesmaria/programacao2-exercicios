import java.util.Scanner;

public class exercicio4 {
    
    public static void main (String[] args){

    Scanner  leitor = new Scanner (System.in);

    System.out.println("Quanto custa o litro da gasolina:");
    double gasolina = leitor.nextInt();

    System.out.print("quanto você vai abastecer:");
    int valor = leitor.nextInt();

    double total = valor/gasolina;
    System.out.println("você por comprar: " +total);

    }
}
