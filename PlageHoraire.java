public class PlageHoraire {
    private final static int DUREE_MIN = 30;
    private Horaire chDebut;
    private Horaire chFin;

    public PlageHoraire(Horaire parDebut, Horaire parFin) {
        chDebut = parDebut;
        chFin = parFin;
    }

    public boolean estValide() {
        int heureDebut = chDebut.toMinutes();
        int heureFin = chFin.toMinutes();

        return heureFin-heureDebut >= DUREE_MIN;
    }



    public int duree() {
        return chFin.toMinutes() - chDebut.toMinutes();
    }

    public int compareTo(PlageHoraire parPlage) {
        if (this.duree() < parPlage.duree()) return -1;
        else if (this.duree() > parPlage.duree()) return 1;
        else return 0;
    }


    public String toString() {
        return chDebut + " - " + chFin + " durée : "+ this.duree()/60+"h" + this.duree()%60 + " minutes";
    }

}
