import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

      System.out.print(" Digite o tipo de combustível: (G-gasolina e A-álcool) ");
      String tipo = ler.nextLine();

      System.out.print("quantos litros foram vendidos: ");
      double litros = ler.nextDouble();
    
    double litrog = 6.00;
    double litroa = 4.50;
    double valortotal = 0;

    if (tipo.equalsIgnoreCase("G")){
        if (litros <=20){
            valortotal=litros*litrog*0.96;
        } else {
            valortotal = litros*litrog*0.94;
        }

    } else if (tipo.equalsIgnoreCase("A")){
        if (litros<=20){
            valortotal= litros*litroa*0.94;
        } else {
            valortotal= litros*litroa*0.95;
        }
    } else {
        System.out.print("Tipo de combustível inválido!");
     }
    System.out.printf("valor a ser pago: R$ %.2f", valortotal);
    }
    
}
