import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("qual a sua idade? ");
        int idade = ler.nextInt();

        if (idade>=5 && idade<=7){
            System.out.print("Infantil A");
        } else if (idade>=8 && idade<=10) {
            System.out.print("Infantil B");
        } else if (idade>=11 && idade<=13) {
            System.out.print("JUVENIL A");
        } else if (idade>=14 && idade<=17) {
            System.out.print("JUVENIL B");
        } else{
            System.out.print("Adulto");
        }
    }
    
}
