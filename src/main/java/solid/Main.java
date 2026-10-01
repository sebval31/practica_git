package solid;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Figura> figuras = List.of(
        new Circulo(5),
        new Rectangulo(4, 6),
        new Triangulo(3, 8)
        );
        new ReporteAreas().mostrar(figuras);
    }
}