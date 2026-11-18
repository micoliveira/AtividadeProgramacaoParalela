public class Recepcionista implements Atendente {
    private final String nome;

    public Recepcionista(String nome) {
        this.nome = nome;
    }

    @Override
    public void realizarAtendimento() {
        System.out.println(nome + " esta realizando atendimento.");
    }
}
