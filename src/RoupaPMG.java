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

        System.out.print("Quantidade vendida: ");
        int quantidadeVendida = scanner.nextInt();

        switch (tamanho) {
            case "P":
                if (quantidadeVendida > quantidadeP) {
                    System.out.println("Estoque insuficiente para o tamanho P.");
                } else {
                    quantidadeP -= quantidadeVendida;
                    System.out.println("Venda concluída! Restam " + quantidadeP + " unidades do tamanho P de " + getDescricao() + ".");
                }
                break;
            case "M":
                if (quantidadeVendida > quantidadeM) {
                    System.out.println("Estoque insuficiente para o tamanho M.");
                } else {
                    quantidadeM -= quantidadeVendida;
                    System.out.println("Venda concluída! Restam " + quantidadeM + " unidades do tamanho M de " + getDescricao() + ".");
                }
                break;
            case "G":
                if (quantidadeVendida > quantidadeG) {
                    System.out.println("Estoque insuficiente para o tamanho G.");
                } else {
                    quantidadeG -= quantidadeVendida;
                    System.out.println("Venda concluída! Restam " + quantidadeG + " unidades do tamanho G de " + getDescricao() + ".");
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
