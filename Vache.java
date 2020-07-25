public class Vache extends Animal
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

}
