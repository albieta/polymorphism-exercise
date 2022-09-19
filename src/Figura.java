public abstract class Figura implements Comparable<Figura> {
    public abstract double area();

    public int compareTo(Figura figura) {
        return Double.compare(this.area(), figura.area());
    }
}
