import java.util.Scanner;

public class ControleDeEstoque {
    public static void main(String[] args) {
        Peca[] estoque = new Peca[5];
        estoque[0] = new Acessorio("Pulseira", 10, 2, 20);
        estoque[1] = new RoupaTamanhoUnico("Camisa", 5, 1, 10);
        estoque[2] = new RoupaPMG("Calça", 3, 4, 5, 2, 15);
        estoque[3] = new Acessorio("Cinto", 7, 3, 15);
        estoque[4] = new RoupaTamanhoUnico("Vestido", 6, 2, 12);

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("\nMenu de Estoque:");
            for (int i = 0; i < estoque.length; i++) {
                System.out.println(i + " - " + estoque[i].getDescricao());
            }
            System.out.println("5 - Sair do sistema");
            System.out.print("Escolha uma opção: ");


            if (!scanner.hasNextInt()) {
                System.out.println("Opção inválida! Por favor, insira um número.");
                scanner.next();
                continue;
            }

            opcao = scanner.nextInt();

            if (opcao < 0 || opcao > 5) {
                System.out.println("Opção inválida! Escolha um número entre 0 e 5.");
            } else if (opcao != 5) {
                estoque[opcao].venda();
                estoque[opcao].reposicaoEstoque();
            }
        } while (opcao != 5);

        System.out.println("\nEstoque final:");
        for (Peca peca : estoque) {
            System.out.println(peca.getDescricao() + " - Quantidade: " + peca.getQuantidade());
        }
    }
}
