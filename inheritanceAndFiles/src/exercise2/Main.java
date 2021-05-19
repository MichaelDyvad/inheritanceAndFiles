package exercise2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Bilerne bliver instantieret. Superclassen exercise2.Biler er abstract og kan derfor ikke instantieres
        Ford mustang = new Ford("Rød", 4.0, 500000);
        Lamborghini aventador = new Lamborghini("Gul", 6.0, 1000000);

        //Der bliver lavet en ArrayList, som tilføjer mustang og aventador.
        ArrayList<Biler> bilerArrayList = new ArrayList<>();
        bilerArrayList.add(mustang);
        bilerArrayList.add(aventador);

        //Det er her, hvor inheritance er smart, fordi det er muligt at bruge metoden "bilLyd()" -
        //på alle de biler der har extended superklassen "exercise2.Biler".
        for(int i = 0; i < bilerArrayList.size(); i++){
            System.out.println(bilerArrayList.get(i).bilLyd());
        }
    }
}
