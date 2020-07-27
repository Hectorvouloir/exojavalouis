public abstract class Animal{
    private String type;
    private String nom;
    private String cri;

    public void crier(){System.out.println(cri);}

    public Animal (String type,String nom,String cri)
    {
        this.type=type;
        this.nom=nom;
        this.cri=cri;
    }

    public String getNom(){
        return(this.nom);
    }

    public abstract String getAttribut();
}

