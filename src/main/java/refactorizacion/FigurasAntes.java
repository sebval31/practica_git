package refactorizacion;
public class FigurasAntes {
    static double f(String t, double a, double b) {
        if (t.equals("c")) {
            return 3.14159 * a * a;
        }
        if (t.equals("r")) {
            return a * b;
        }
        if (t.equals("t")) {
            return a * b / 2;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(f("c", 5, 0));
        System.out.println(f("r", 4, 6));
        System.out.println(f("t", 3, 8));
    }
}