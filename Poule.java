public class Poule extends Animal{
    private String bec;

    public Poule (String nom, String bec)
    {
        super ("Poule",nom,"Cocot");
        this.bec=bec;
    }

    public void picorer()
    {
        System.out.println("Pic Pic");
    }

}
