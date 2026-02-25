public class ClientDateCalendrier {
    public static void main(String[] args) {

        DateCalendrier dc4 = new DateCalendrier(31, 1, 2025);
        System.out.println(dc4);

        DateCalendrier dc5 = dc4.dateDuLendemain();
        System.out.println(dc5);

        System.out.println(dc5.dateDeLaVeille());

    }


}
