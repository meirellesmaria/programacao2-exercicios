public class ex1 {
public static double valorcat (double cat1, double cat2) {
    return Math.sqrt(cat1*cat1+cat2*cat2);
}

public static void main(String[] args) {
    double cat1=3;
    double cat2=3;
    
    double hipotenusa = valorcat(cat1, cat2);
    System.out.println("Valor da hipotenusa é:" + hipotenusa);;
}
}
