public class Poule extends Animal implements Herbivore{
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

    @Override
    public void etremange(Carnivore c) {
        System.out.println(getNom()+" est mangé par "+ c.getNom());
    }

    @Override
    public String getAttribut() {
        return bec;
    }
}
