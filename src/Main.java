// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("" +
                "1 - Cadastrar Colaborador Padrão \n" +
                "2 - Cadastrar Colaborador comissionado\n" +
                "3 - Cadastrar Colaborador Produção\n" +
                "4- Gerar Folha de pagamento\n" +
                "5 - Exibir Resumo da Folha \n" +
                "0 - Sair do Programa");
        int opcao = leitor.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Cadastrar colaborador padrão");
                break;
            case 2:
                System.out.println("Cadastrar colaborador comissionado");
                break;
            case 3:
                System.out.println("colaborador produção ");
                break;
            case 4:
                System.out.println("Gerar folha de pagamento");
                break;
            case 5:
                System.out.println("Exibir folha");
                break;
            case 0:
                System.out.println("Sair do programama");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}