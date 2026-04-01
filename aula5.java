
import java.util.Scanner;

public class aula5 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
         System.out.print("Digite um número: ");
         int numero = leitor.nextInt();
        
         int dobro = numero*2;
         int triplo = numero*3;

         System.out.println("O dobro:" +dobro);
         System.out.println("O triplo:" +triplo);
        }
    }
