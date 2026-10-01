package refactorizacion;
public class FigurasDespues {
    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double areaTriangulo(double base, double altura) {
        return base * altura / 2;
    }

    public static void main(String[] args) {
        System.out.printf("Área del círculo: %.2f%n", areaCirculo(5));
        System.out.printf("Área del rectángulo: %.2f%n", areaRectangulo(4, 6));
        System.out.printf("Área del triángulo: %.2f%n", areaTriangulo(3, 8));
    }
}