public class RoupaTamanhoUnico extends Peca {
    public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda() {
        if (getQuantidade() > 0) {
            setQuantidade(getQuantidade() - 1);
            exibirMensagemVenda();
        } else {
            System.out.println("Estoque insuficiente para " + getDescricao() + ".");
        }
    }
}
