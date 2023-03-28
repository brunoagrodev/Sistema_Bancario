import java.util.Scanner;

public class banco {
    public static void main(String[] args){
        String cpf = "12345678999";
        int senha = 123456;
        System.out.print("Digite o seu CPF: ");
        Scanner leitor = new Scanner(System.in);
        cpf = leitor.nextLine();
        System.out.print("Digite a sua senha: ");
        senha = leitor.nextInt();
        
        if (cpf.length() == 11 && cpf.equals("12345678999") && senha == 123456 && String.valueOf(senha).length() == 6) {
            System.out.print("Você está logado no sistema.\n");
            exibirMenu(leitor);
        } else {
            System.out.print("Acesso Negado, tente logar novamente.");
        }
    }

    public static void exibirMenu(Scanner leitor){
        boolean sair = false;
        do {
            System.out.print("Selecione uma opção:\n");
            System.out.println("1 - Consultar saldo.");
            System.out.println("2 - Realizar saque.");
            System.out.println("3 - Realizar transferência.");
            System.out.println("4 - Sair do Sistema.");
            int opcao =  leitor.nextInt();

            switch (opcao) {
                case 1:
                System.out.print("O seu saldo é de R$ 1.000.");
                break;
                case 2:
                System.out.print("Digite o valor a ser sacado: ");
                int valSaque;
                valSaque = leitor.nextInt();
                if (valSaque == 0 ){
                    System.out.printf("Você não pode sacar o valor de R$ ", valSaque, "reais");
                } else if (valSaque >= 1 && valSaque < 1000 ) {
                System.out.printf("Você sacou o valor de ", valSaque);
                } else {
                    System.out.printf("Você não pode sacar o valor de ", valSaque);
                }
                break;
                case 3:
                int agencia;
                do {
                    System.out.print("Digite o número da agência da pessoa: ");
                    agencia = leitor.nextInt();
                    if (String.valueOf(agencia).length() == 4){
                        System.out.printf("Agência encontrada, o número da agência é ", agencia);
                        break;
                    } else {
                        System.out.print("Agência não encontrada, digite a agência novamente.");
                    }
                } while(true);

                int numConta;
                do {
                    System.out.print("Digite o número da conta bancária: ");
                    numConta = leitor.nextInt();
                    System.out.print("Digite o número da conta bancária: ");
                    numConta = leitor.nextInt();
                    if (String.valueOf(numConta).length() == 9){
                        System.out.printf("O número digitado da conta bancária é: ", numConta);
                        break;
                    } else {
                        System.out.print("Número digitado é inválido, digite novamente.");
                    } 
                } while(true);

                int valDeposito;
                String cpf;
                System.out.print("Digite o valor a ser depositado");
                valDeposito = leitor.nextInt();
                cpf = leitor.nextLine();
                if (valDeposito == 0 ){
                    System.out.printf("Você não pode depositar o valor de R$ ", valDeposito, "reais");
                } else if (valDeposito >= 1 && valDeposito < 1000 ) {
                System.out.printf("Você depositou o valor de R$ ", valDeposito, "no cpf de ", cpf, "na agência ", agencia, "na conta bancária ", numConta);
                } else {
                    System.out.print("Transferência não realizada.");
                }
                break;

                case 4:
                sair = true;
                break;

                default:
                System.out.print("Opção invalida, tente novamente.");
                break;
            }    
        } while(!sair);

        leitor.close();
    }
}

