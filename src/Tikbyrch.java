public class Tikbyrch extends Shape{
    private  int ysty ;
    private  int astu;
    private  int yzyndygy;
    private int kaptalu;

    public Tikbyrch(int ysty, int astu, int yzyndygy, int kaptalu) {
        this.ysty = ysty;
        this.astu = astu;
        this.yzyndygy = yzyndygy;
        this.kaptalu = kaptalu;
    }

    @Override
    public double getPerimeter() {
        return ysty + astu + kaptalu + yzyndygy;
    }
}
