
public class Chat extends Animal{
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

}
