public class tegerek extends Shape{
    private int radius;

    public tegerek(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return Math.round(2* Math.PI* radius);
    }
}
