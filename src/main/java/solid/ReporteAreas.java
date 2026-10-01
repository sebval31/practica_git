package solid;

import java.util.List;

public class ReporteAreas {

    public void mostrar(List<Figura> figuras) {
        for (Figura figura : figuras) {
            System.out.printf("%s: %.2f%n",
                    figura.getClass().getSimpleName(), figura.area());
        }
    }
}