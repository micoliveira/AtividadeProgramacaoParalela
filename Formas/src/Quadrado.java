public class Quadrado extends Forma {
    private double lado;

    public Quadrado(double lado) {
        validarLado(lado);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        validarLado(lado);
        this.lado = lado;
    }

    private static void validarLado(double lado) {
        if (!Double.isFinite(lado) || lado < 0) {
            throw new IllegalArgumentException("O lado deve ser finito e não negativo.");
        }
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
