import java.util.ArrayList;
import java.util.Scanner;

public class testefuncionario {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        ArrayList<funcionario> funcionario= new ArrayList<>();

        int opcao;
        do{
            System.out.println("MENU");
            System.out.println("1 - Adicionar gerente");
            System.out.println("2- Adicionar atendente");
            System.out.println("3 - Listar Funcionários");
            System.out.println("4 - Mostrar Salário por CPF");
            System.out.println("5 - Sair");
            System.out.println("Digite a opçao desejada:");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("Digite o nome do gerente:");
                    String nomeGerente = sc.nextLine();
                    System.out.println("Digite o CPF do Gerente:");
                    String cpfGerente = sc.nextLine();
                    System.out.println("Digite o salário do Gerente:");
                    double salarioGerente = sc.nextDouble();
                    System.out.println(" Digite a data de nascimento do gerente:");
                    int dataNascimentoGerente = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o setor do gerente:");
                    String setorGerente= sc.nextLine();

                    funcionario.add(new gerente(nomeGerente, cpfGerente, salarioGerente, dataNascimentoGerente, setorGerente));
                    System.out.println("Gerente adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("Digite o nome do Atendente:");
                    String nomeA = sc.nextLine();
                    System.out.println("Digite o CPF do Atendente:");
                    String cpfA = sc.nextLine();
                    System.out.println("Digite o salário do Atendente:");
                    double salarioA = sc.nextDouble();
                    System.out.println(" Digite a data de nascimento do Atendente:");
                    int dataNascimentoA = sc.nextInt();
                    sc.nextLine();
                    System.out.println("digite a comissao:");
                    double comissao = sc.nextDouble();
                    

                    funcionario.add(new atendente(nomeA, cpfA, salarioA, dataNascimentoA, comissao));
                    System.out.println("Atendente adicionado com sucesso!");
                    break;

                case 3:

                    if (funcionario.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {

                        for (funcionario f : funcionario) {

                            System.out.println("\n----------------");
                            System.out.println(f);

                            if (f instanceof gerente) {
                                System.out.println("Cargo: Gerente");
                            } else {
                                System.out.println("Cargo: Atendente");
                            }
                        }
                    }

                    break;

                case 4:

                    System.out.print("Informe o CPF: ");
                    String cpfBusca = sc.nextLine();

                    boolean encontrado = false;

                    for (funcionario f : funcionario) {

                        if (f.getCpf().equals(cpfBusca)) {
                            System.out.println("Salário de " + f.getNome() + ": R$ " + f.getSalario());
                        }
                        encontrado = true;
                        break;
                    }
                
                if(!encontrado){
                    System.out.println("Funcionário não encontrado!");
                }

                case 5:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 5);

        sc.close();
    }
    
}
