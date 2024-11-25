import java.util.Scanner;

public class Acessorio extends Peca {
    public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
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
    }}
