public class ClientDate {
    public static void main(String[] args) {

        Date d = new Date(13, 1, 2026);
        System.out.println(d);
        Date d1 = new Date(2027);
        System.out.println(d1);

        Date dateTest = new Date(31,4,1400);

        System.out.println( dateTest.estValide());
    }
}
