//Her bliver inheritance brugt vha. extends keyworded
public class Ford extends Biler{

    //Klassen Ford nedarver constructoren fra Biler og dette kan lade sig gøre gennem super keyworded.
    public Ford(String farve, double motor, int pris){
        super(farve, motor, pris);
    }

    //Ford nedarver også metoden "bilLyd".
    @Override
    public String bilLyd() {
        return "Vrooom";
    }
}
