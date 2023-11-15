public class Main {
    public static void main(String[] args) {
        Shape tegerek = new tegerek(5);
        Shape ychbyrchtyk = new Ychbyrch(3,3,2);
        Shape tortbyrchtyk = new Tortbyrch(5,5,4,4);
        Shape tikbyrchtyk = new Tikbyrch(3,3,5,5);
        Shape kvadrat = new Kvadrat(7,7,7,7);

        System.out.println("tegerek" + tegerek.getPerimeter());
        System.out.println("ychbyrchtyk" + ychbyrchtyk.getPerimeter());
        System.out.println("tortbyrchtyk" + tortbyrchtyk.getPerimeter());
        System.out.println("tikbyrchtyk" + tikbyrchtyk.getPerimeter());
        System.out.println("kvadrat" + kvadrat.getPerimeter());

    }
}

//public abstract double getPerimeter()
//
//деген абстракт методун  Shape деген класска кошунуз.
//
//Ал методту ишке ашырган 5 мурастоочу класс тузунуз жана методту ишке ашырыныз.

