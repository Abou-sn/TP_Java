public class Reservation {
    private String chTitre;
    private Date chDate ;
    private PlageHoraire chPlageHoraire;

    /**
     * Constructeur de la classe Reservation
     *
     * @param parTitre Intitulé de la réservation
     * @param parDate Date de la Réservation
     * @param parPlageHoraire Créneau de la réservation
     */
    public Reservation(String parTitre,Date parDate, PlageHoraire parPlageHoraire ) {
        chTitre = parTitre;
        chDate = parDate;
        chPlageHoraire = parPlageHoraire;

    }
}
