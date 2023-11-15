public class Kvadrat extends Shape{
    private  int birjag;
    private  int ekinchijag;
    private  int ychynchyJagu;
    private int tortynchyJag;

    public Kvadrat(int birjag, int ekinchijag, int ychynchyJagu, int tortynchyJag) {
        this.birjag = birjag;
        this.ekinchijag = ekinchijag;
        this.ychynchyJagu = ychynchyJagu;
        this.tortynchyJag = tortynchyJag;
    }

    @Override
    public double getPerimeter() {
        return birjag + ekinchijag + ychynchyJagu + tortynchyJag;
    }
}
