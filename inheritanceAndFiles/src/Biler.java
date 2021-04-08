//Exercise 2: Write a program that exemplifies the concept of inheritance.
// Comment the pro-gram accordingly to describe your example.
// You should use real-life concepts as classes in the program

//Der bliver lavet en abstract class "Biler", som gør andre class kan arve attributter, constructor og metoder.
public abstract class Biler {
    //Attributes
    public String farve;
    public double motor;
    public int pris;

    //Constructor
    public Biler(String farve, double motor, int pris){
        this.farve = farve;
        this.motor = motor;
        this.pris = pris;
    }
    //En abstract metode har kun header og ingen metode.
    public abstract String bilLyd();
}
