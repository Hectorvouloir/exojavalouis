public class Exo1{
    public static void main(String args[]){
        Chat chat=new Chat ("Bruno","Brun"); //pas visibilité dans fonction
        chat.chasser();
        chat.crier();

        Chien chien=new Chien ("Robin","long");
        chien.abonner();
        chien.crier();

        Poule poule=new Poule("leg","jaune");
        poule.picorer();
        poule.crier();

        Vache vache=new Vache("Manon","gras");
        vache.copuler();
        vache.crier();
    }}
