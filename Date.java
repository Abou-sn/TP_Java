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

    public boolean estBisextile() {
        return ((chYear%4 == 0 && chYear%100 != 0) || chYear%400 == 0);
    }

    public boolean estValide(){

        if((chYear<1583) || chMonth<0 || chMonth > 12) {
            return false;
        }

        if(chDay <0 || chDay>31){
            return false;
        }

        if (chMonth == 4 || chMonth == 6 || chMonth == 9 || chMonth == 11) {
            if (chDay > 30) {
                System.out.println("Il n'y a que 30 jours pour le mois entré");
                return false;
            }

        }

        if (chMonth == 2) {

            if (estBisextile()) {
                if (chDay > 29) {
                    System.out.println("Veuillez entrer un jour valide pour le mois de Fevrier");
                    return false;
                }
            }
            else  {
                if (chDay > 28) {
                    System.out.println("Veuillez entrer un jour valide pour le mois de Fevrier");
                    return false;


                }
            }

        }
        System.out.println("La date entré est valide ");
        return true;
    }



    public String toString() {
        return chDay + "/" + chMonth + "/" + chYear;
    }
}