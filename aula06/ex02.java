
import java.util.Scanner;


public class ex02 {

    public static void main(String[] args) {
        Scanner ler  = new Scanner(System.in);

        System.out.print("Digite uma palavra:");
        String palavra1 = ler.nextLine();

        System.out.print("Digite outra palavra:");
        String palavra2 = ler.nextLine();

        if(palavra1.equalsIgnoreCase(palavra2)){
            System.out.print("Elas são igueis");
        } else {
            System.out.print("Elas são diferentes");
        }    



        
    }
}
