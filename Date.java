public class Date {
    private int chDay;
    private int chMonth;
    private int chYear;

    public Date(int parDay, int parMonth, int parYear) {
        chDay = parDay;
        chMonth = parMonth;
        chYear = parYear;
    }

    public Date(int parYear){
        chDay = 1;
        chMonth = 1;
        chYear = parYear;

    }

    public boolean estValide(Date d){
        return d.chYear / 4 == 0;
    }

    public String toString() {
        return chDay + "/" + chMonth + "/" + chYear;
    }
}