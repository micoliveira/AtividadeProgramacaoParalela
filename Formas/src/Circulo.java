public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        validarRaio(raio);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        validarRaio(raio);
        this.raio = raio;
    }

    private static void validarRaio(double raio) {
        if (!Double.isFinite(raio) || raio < 0) {
            throw new IllegalArgumentException("O raio deve ser finito e não negativo.");
        }
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
