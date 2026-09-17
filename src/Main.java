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

        if(opcao == 1){
            System.out.println("foi a opção 1");
        } else if (opcao == 2) {
            System.out.println("foi a opção 2");
        } else if (opcao == 3) {
            System.out.println("foi a opção 3");
        } else if (opcao == 4) {
            System.out.println("foi a opção 4");
        } else if (opcao == 5) {
            System.out.println("foi a opção 5");
        } else if (opcao == 0){
            System.out.println("estou saindo");
        } else {
            System.out.println("opção inválida");
        }
    }
}