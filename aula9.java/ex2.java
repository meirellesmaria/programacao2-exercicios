public class ex2 {
    public static int encontrarMaior(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("O array não pode ser nulo ou vazio.");
        }

        int maior = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[1] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }
    
    public static void main(String[] args) {
        int[] numeros = {5, 3, 8 , 1, 4};

        int maior = encontrarMaior(numeros);
        System.out.println("O maior numero é:" + maior);
    }
}
