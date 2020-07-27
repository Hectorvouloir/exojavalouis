
public class Chat extends Animal implements Carnivore{
    private String pelage;

    public Chat (String nom, String pelage)
    {
        super ("Chat",nom, "Miaou");
        this.pelage=pelage;
    }

    public void chasser()
    {
        System.out.println("chasse");
    }

    @Override
    public void manger(Herbivore h) {
        System.out.println(getNom()+" mange "+ h.getNom());
    }

    @Override
    public String getAttribut() {
        return pelage;
    }
}
