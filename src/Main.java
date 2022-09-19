import java.util.Arrays;

public class Main {
    public static double suma(Figura[] figures) {
        double suma = 0;

        for(Figura figura : figures) {
            suma = suma + figura.area();
        }

        return suma;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Figura[] figures = new Figura[3];
        figures[0] = new Rectangle(2,3);
        figures[1] = new Cercle(4);
        figures[2] = new Quadrat(2);

        Arrays.sort(figures);

        for(Figura figura : figures) {
            System.out.println("La figura: " + figura.name() + " te una area de: " + figura.area());
        }

        System.out.println("La suma de les arees és de: " + suma(figures));
    }
}