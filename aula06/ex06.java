import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("me diga um frase: ");
        String frase = nextLine();

        System.out.print(me diga uma palavra:");
         String palavra = ler.nextLine();
        
        if (frase.indexOf(palavra)>0)
        System.out.print("a palavra esta na frase:");
         else
            System.out.print(-1);

    }
}
