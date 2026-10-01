package solid;
public class CalculadoraMala {

    public double calcularArea(String figura, double a, double b) {
        if (figura.equals("circulo")) {
            return Math.PI * a * a;
        } else if (figura.equals("rectangulo")) {
            return a * b;
        }
        return 0;
    }
    public void imprimir(String figura, double a, double b) {
        System.out.printf("%s: %.2f%n", figura, calcularArea(figura, a, b));
    }
    public static void main(String[] args) {
        CalculadoraMala c = new CalculadoraMala();
        c.imprimir("circulo", 5, 0);
        c.imprimir("rectangulo", 4, 6);
    }
}