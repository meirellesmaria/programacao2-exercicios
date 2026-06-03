public class funcionario {
    
    private String nome;
    private String cpf;
    private double salario;
    private int dataNascimento;
    public funcionario(String nome, String cpf, double salario, int dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.dataNascimento = dataNascimento;

    }
    public String getNome(){
        return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf (String cpf){
        this.cpf = cpf;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario (double salario){
        this.salario = salario;
    }

    public int getdataNascimento(){
        return dataNascimento;
    }

    public void setdataNascimento(int dataNascimento){
        this.dataNascimento = dataNascimento;
    } 

}


