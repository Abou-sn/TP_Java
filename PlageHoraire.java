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



    public String toString() {
        return "Debut :"+chDebut + " - " +"Fin :"+ chFin;
    }

}
