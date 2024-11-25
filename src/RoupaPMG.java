import java.util.Scanner;

public class RoupaPMG extends Peca {
    private int quantidadeP;
    private int quantidadeM;
    private int quantidadeG;

    public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, 0, estoqueMinimo, estoqueMaximo);
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
    }


    @Override
    public void venda() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tamanho vendido (P/M/G): ");
        String tamanho = scanner.nextLine().toUpperCase();

        switch (tamanho) {
            case "P":
                if (quantidadeP > 0) {
                    quantidadeP--;
                    System.out.println("Venda concluída! Restam " + quantidadeP + " unidades do tamanho P de " + getDescricao() + ".");
                } else {
                    System.out.println("Estoque insuficiente para tamanho P.");
                }
                break;
            case "M":
                if (quantidadeM > 0) {
                    quantidadeM--;
                    System.out.println("Venda concluída! Restam " + quantidadeM + " unidades do tamanho M de " + getDescricao() + ".");
                } else {
                    System.out.println("Estoque insuficiente para tamanho M.");
                }
                break;
            case "G":
                if (quantidadeG > 0) {
                    quantidadeG--;
                    System.out.println("Venda concluída! Restam " + quantidadeG + " unidades do tamanho G de " + getDescricao() + ".");
                } else {
                    System.out.println("Estoque insuficiente para tamanho G.");
                }
                break;
            default:
                System.out.println("Tamanho inválido!");
        }
    }


    @Override
    public void reposicaoEstoque() {
        if (quantidadeP < getEstoqueMinimo()) quantidadeP = getEstoqueMaximo();
        if (quantidadeM < getEstoqueMinimo()) quantidadeM = getEstoqueMaximo();
        if (quantidadeG < getEstoqueMinimo()) quantidadeG = getEstoqueMaximo();
    }
}
