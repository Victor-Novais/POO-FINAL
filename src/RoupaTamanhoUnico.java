import java.util.Scanner;

public class RoupaTamanhoUnico extends Peca {
    public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantidade vendida de " + getDescricao() + ": ");
        int quantidadeVendida = scanner.nextInt();

        if (quantidadeVendida > getQuantidade()) {
            System.out.println("Estoque insuficiente para atender a venda.");
        } else {
            setQuantidade(getQuantidade() - quantidadeVendida);
            exibirMensagemVenda();
        }
    }
}
