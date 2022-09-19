import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Figura[] figures = new Figura[3];
        figures[0] = new Rectangle(2,3);
        figures[1] = new Cercle(4);
        figures[2] = new Quadrat(2);

        Arrays.sort(figures);
    }
}