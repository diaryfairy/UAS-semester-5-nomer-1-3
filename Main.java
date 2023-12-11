public class Main {
    public static void main(String[] args) {
        Matematika[] geometri = new Matematika[3];
        geometri[0] = new Segitiga(3, 4);
        geometri[1] = new PersegiPanjang(3, 4);
        geometri[2] = new PersegiPanjang(7, 2);

        for (Matematika geometri1 : geometri) {
            System.out.println("Luas dari " + geometri1.getClass().getSimpleName() + " adalah " + geometri1.luas());
        }
    }
}