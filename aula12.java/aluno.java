public class aluno {
    String nome;
    int matricula;
    double nota1;
    double nota2;
    double notaTrabalho;

    public aluno(String nome, int matricula, double nota1, double nota2, double notaTrabalho) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrabalho = notaTrabalho;
    }
    public double calcularMedia(){
        return (nota1 + nota2 + notaTrabalho) / 3;
    }
    public void verificarSituação(){
        double media = calcularMedia();
        if(media >= 7){
            System.out.printf("Aluno aprovado com media %.2f:" , media );
        }else {
            System.out.printf("aluno reprovado com media %.2f:" , media );
        } 

    }
}



