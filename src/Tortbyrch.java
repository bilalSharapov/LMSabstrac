public class Tortbyrch extends Shape{
    private  int ysty;
    private int astu;
    private int kaptalu;
    private int tyyrasu;

    public Tortbyrch(int ysty, int astu, int kaptalu, int tyyrasu) {
        this.ysty = ysty;
        this.astu = astu;
        this.kaptalu = kaptalu;
        this.tyyrasu = tyyrasu;
    }

    @Override
    public double getPerimeter() {
        return ysty + astu + kaptalu + tyyrasu;
    }
}
