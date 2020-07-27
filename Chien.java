
public class Chien extends Animal implements Carnivore{
    private String museau;

    public Chien (String nom, String museau)
    {
        super ("Chien",nom, "Wouf");
        this.museau=museau;
    }
    //s/recherche/remplacer/g
    //s/pelage/museau/g

    public void abonner()
    {
        System.out.println("s'abonner à only fan");
    }

    @Override
    public void manger(Herbivore h) {
        System.out.println(getNom()+" mange "+ h.getNom());
    }

    @Override
    public String getAttribut() {
        return museau;
    }
}


