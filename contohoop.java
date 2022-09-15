public class contohoop {
    public static void main(String[] args) {
        Manusia<Integer> a = new Manusia<>();
        a.nama = "Andi";
        a.usia = 18;
        a.uang = 30000;

        Manusia<Double> b = new Manusia<>();
        b.nama = "James";
        b.usia = 23;
        b.uang = 12.5;

        /*
            int -> Integer
            double -> Double
            long -> Long
         */

        System.out.println(a.uang);
        System.out.println(b.uang);
    }
}

class Manusia<T> {
    String nama;
    int usia;
    T uang;
}
