import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Aprovavel> exames = List.of(
                new ExameDeSangue("Maria"),
                new RaioX("Joao"));

        System.out.println("=== Processamento de exames ===");
        new ProcessadorDeExames().processar(exames);

        System.out.println("\n=== Interfaces ===");
        Atendente recepcionista = new Recepcionista("Ana");
        recepcionista.realizarAtendimento();

        VendedorComissionado vendedor = new VendedorComissionado("Carlos");
        vendedor.processarVenda();
        System.out.println("Comissao: R$ " + vendedor.calcularComissao(250.00));
    }
}
