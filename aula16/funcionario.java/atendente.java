public class atendente extends funcionario{
    private double comissao;
    public atendente(String nome, String cpf, double salario, int dataNascimento, double comissao){
        super("Miguel", "32165498789", 2000.00, 1998);
        this.comissao = comissao;
    }

    @Override
    public double getSalario(){
        return super.getSalario()+comissao;
    }

        public double getComissao(){
            return comissao;
    }

    public void setComissao(double comissao){
        this.comissao=comissao;
    }

}


    
    

