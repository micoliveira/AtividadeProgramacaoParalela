public class RaioX implements Aprovavel {
    private final String paciente;

    public RaioX(String paciente) {
        this.paciente = paciente;
    }

    @Override
    public void aprovar() {
        System.out.println("Raio-X de " + paciente + " aprovado.");
    }
}
