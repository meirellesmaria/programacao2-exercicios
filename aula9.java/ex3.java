public class ex3 {
    public static  boolean elementosExiste(String[] array, String busca) {
        if (array == null || busca == null)  {
            return false;
        }

        for (String elemento : array) {
            if (busca.equals(elemento)) {
            return true;
        }
    }

    return false;
}
    public static void main(String[] args) {
    String[] nomes = {"Alice", "Ana", "liam", "Sam"};
    
    System.out.println(elementosExiste(nomes, "Liam"));
    System.out.println(elementosExiste(nomes, "Alice"));

    }
}
