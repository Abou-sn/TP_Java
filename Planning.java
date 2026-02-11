public class Planning {
    private Reservation [] tabReservations;
    private final int TAILLE_TAB;

    public Planning(int parTailleTab) {
        TAILLE_TAB = parTailleTab;
        tabReservations = new Reservation[TAILLE_TAB];
    }

    /**
     * Vérifie si un tableau de reservations est plein ou non
     * @return Un booleen qui indique si le tableau est plein ou non
     */
    private boolean estPlein(){
        Reservation [] tab = this.tabReservations;

        for (Reservation reservation : tab) {
            if (reservation == null) return false;
        }
        return true ;
    }

    public boolean ajout(Reservation reservation) {
        if (reservation.estValide() && !estPlein()) {

            for (Reservation autreReservation  : tabReservations) { // Vérifie que la reservation est compatible avec les autres existante
                if (autreReservation != null) {
                    if (reservation.compareTo(autreReservation) == 0) return false;
                }
            }

            for(int i = 0 ; i< tabReservations.length; i++){
                if (tabReservations[i] == null){
                    tabReservations[i] = reservation;
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        return "Planning : " + tabReservations ;
    }
}

