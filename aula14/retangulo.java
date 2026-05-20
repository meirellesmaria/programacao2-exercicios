

public class retangulo {
    private double altura = 1;
    private double largura = 1;

    public double getAltura(){
        return altura;
    }
    public void setLargura(double altura){
        this.altura=altura;
    }else{
        System.out.println("altura invalida");
    }
}

public double getLargura(){
    return largura;
}
public void setLargura(double largura){
    if(largura > 0 && largura <= 20){
        this.largura=largura;
    }else{
        System.out.println("largura invalida");
    }

    public double calcularArea(){
        return altura*largura;
    }
    public double calcularPerimetro(){
        return 2*(altura+largura);
    }
}
    

