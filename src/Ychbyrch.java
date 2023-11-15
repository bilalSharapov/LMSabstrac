public class Ychbyrch extends Shape{
    private int tyyrasu;
    private  int kaptalu;
    private int astu;

    public Ychbyrch(int tyyrasu, int kaptalu, int astu) {
        this.tyyrasu = tyyrasu;
        this.kaptalu = kaptalu;
        this.astu = astu;
    }

    @Override
    public double getPerimeter() {
        return tyyrasu + kaptalu + astu;
    }

}
