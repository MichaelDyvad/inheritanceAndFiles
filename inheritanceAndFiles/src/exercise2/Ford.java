package exercise2;

import exercise2.Biler;

//Her bliver inheritance brugt vha. extends keyworded
public class Ford extends Biler {

    //Klassen exercise2.Ford nedarver constructoren fra exercise2.Biler og dette kan lade sig gøre gennem super keyworded.
    public Ford(String farve, double motor, int pris){
        super(farve, motor, pris);
    }

    //exercise2.Ford nedarver også metoden "bilLyd".
    @Override
    public String bilLyd() {
        return "Vrooom";
    }
}