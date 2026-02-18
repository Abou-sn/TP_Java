import java.util.Calendar;
public class DateCalendrier extends Date{
    private int jourSemaine;

    public DateCalendrier()  {
        super();
        Calendar today = Calendar.getInstance();
        annee = today.get(Calendar.YEAR);
        mois = today.get(Calendar.MONTH)+1;
        jour = today.get(Calendar.DAY_OF_MONTH);

        if (today.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
            jourSemaine = 7; // Considérer dimanche comme le 7ème jour
        else jourSemaine = today.get(Calendar.DAY_OF_WEEK)-1;
    }

    public DateCalendrier(int day, int month, int year){

        super(day,month,year);

        Calendar today = Calendar.getInstance();
        today.set(year,month,day);

        annee = today.get(Calendar.YEAR);
        mois = today.get(Calendar.MONTH);
        jour = today.get(Calendar.DAY_OF_MONTH);

        if (today.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
            jourSemaine = 7; // Considérer dimanche comme le 7ème jour
        else jourSemaine = today.get(Calendar.DAY_OF_WEEK)-1;

    }

    @Override
    public String toString() {
        return  jour + "/" + mois + "/" + annee + " --- Jour de la semaine : " + jourSemaine;
    }



}
