public class gerente extends funcionario {
    private String setor;
    public gerente(String nome, String cpf, double salario, int dataNascimento, String setor){
        super("Maia", "12345678910", 3000.00, 2000 );
        this.setor=setor;
    }

    @Override
    public double getSalario(){
        return super.getSalario()+2000.00;
    }
    
}
