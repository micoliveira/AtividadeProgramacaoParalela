public class App {
    public static void main(String[] args) {
        Forma[] formas = {
            new Circulo(3),
            new Quadrado(4)
        };

        for (Forma forma : formas) {
            System.out.printf("%s: área = %.2f%n",
                    forma.getClass().getSimpleName(), forma.calcularArea());
        }
    }
}
