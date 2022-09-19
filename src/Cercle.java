public class Cercle extends Figura {
    double d;

    public Cercle(double d) {
        this.d = d;
    }

    public String name() {
        return "Cercle";
    }

    @Override
    public double area() {
        return (Math.PI*Math.pow(d/2, 2));
    }
}
