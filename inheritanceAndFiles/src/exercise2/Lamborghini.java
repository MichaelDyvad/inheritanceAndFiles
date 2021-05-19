package exercise2;

import exercise2.Biler;

public class Lamborghini extends Biler {

    public Lamborghini(String farve, double motor, int pris){
        super(farve, motor, pris);
    }

    @Override
    public String bilLyd() {
        return "Meget hurtig bilLyd!!!";
    }
}
