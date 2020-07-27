public class Vache extends Animal implements Herbivore
{
    private String sabot;

    public Vache (String nom, String sabot)
    {
        super ("Vache",nom,"Meuh");
        this.sabot=sabot;
    }

    public void copuler()
    {
        System.out.println("Copuler avec Merlin");
    }

    @Override
    public void etremange(Carnivore c) {
        System.out.println(getNom()+" est mangé par"+ c.getNom());
    }

    @Override
    public String getAttribut() {
        return sabot;
    }
}
