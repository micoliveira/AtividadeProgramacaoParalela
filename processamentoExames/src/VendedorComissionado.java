public class VendedorComissionado implements Vendedor, Comissionavel {
    private static final double TAXA_COMISSAO = 0.10;

    private final String nome;

    public VendedorComissionado(String nome) {
        this.nome = nome;
    }

    @Override
    public void processarVenda() {
        System.out.println(nome + " esta processando uma venda.");
    }

    @Override
    public double calcularComissao(double valorVenda) {
        return valorVenda * TAXA_COMISSAO;
    }
}
