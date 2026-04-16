import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = ler.nextInt();

        if ((idade) >= 16) {
            System.out.println("Você pode votar.");
        } else 
            System.out.println("Você não pode votar.");
        }  

}
    

