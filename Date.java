public class Date {
    private int chDay ;
    private int chMonth ;
    private int chYear ;

    public Date(int parDay, int parMonth, int parYear) {
        chDay = parDay;
        chMonth = parMonth;
        chYear = parYear;
    }

    public String toString () {
        return  chDay + "/" + chMonth + "/" + chYear;
    }
}
