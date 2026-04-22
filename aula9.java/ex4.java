public class ex4 {
    public static int ParesImpares(int[] array) {
        if (array ==  null) {
            throw new IllegalArgumentException("O array não pode ser nulo.");

        }

        int pares = 0;
        int impares = 0;

        for (int numero : array){
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        return new int[] {pares, impares};

    }
     
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6};

        int[] resultado = contarParesImpares(numeros);

        System.out.println("pares:" + resultado[0]);
        System.out.println("impares:" + resultados[1]);
    }
    }

    
