import java.util.Scanner;

public class DesafioContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("DADOS DO CLIENTE");
        System.out.print("Nome: ");
        String name = sc.next();
        System.out.print("Tipo de conta: ");
        String accountType = sc.next();
        System.out.print("Saldo inicial: ");
        double initialBalance = sc.nextDouble();

        System.out.println();
        System.out.printf("%s INFORME O TIPO DE OPERAÇÃO QUE DESEJA REALIZAR\n",name.toUpperCase());
        System.out.println("1-Consultar saldo \n2-Depósito \n3-Saque \n4-Sair \n");
        int option = sc.nextInt();

        double balance = initialBalance;

        switch (option){
            case 1:
                System.out.println("CONSULTAR SALDO");
                System.out.print("Tipo de conta: " + accountType.toUpperCase());
                System.out.print("\nSaldo: " + initialBalance);
                break;
            case 2:
                System.out.println("DEPOSITO");
                System.out.print("Informe o valor do depósito: ");
                double deposit = sc.nextDouble();
                if(deposit > 0){
                    balance += deposit;
                    System.out.println("Tipo de conta: " + accountType.toUpperCase());
                    System.out.print("Saldo atualizado: " + balance);
                    break;
                }else{
                    System.out.println("Valor do depósito deve ser maior que 0");
                }
            case 3:
                System.out.println("SAQUE");
                System.out.print("Informe o valor do saque: ");
                double withdraw = sc.nextDouble();
                if (withdraw <= balance && withdraw > 0){
                    balance -= withdraw;
                    System.out.println("Tipo de conta: " + accountType.toUpperCase());
                    System.out.print("Saldo atualizado: " + balance);
                }else{
                    System.out.println("Saldo insuficiente");
                }
                break;
            case 4:
                System.out.println("VOCÊ SAIU");
                break;
            default:
                System.out.println("POR FAVOR DIGITE UMA OPÇÃO VALÍDA");
                break;
        }
        sc.close();
    }
}