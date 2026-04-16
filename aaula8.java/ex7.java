import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("digite uma palavra: ");
        String palavra = ler.nextLine();

        for (int a = palavra.length() -1; a>=0; a--){
            System.out.print(palavra.charAt(a));
        }
    }
}
