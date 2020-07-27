public class Exo1{
    public static void main(String args[]) {
        Chat chat = new Chat("Bruno", "Brun"); //pas visibilité dans fonction
        chat.chasser();
        chat.crier();

        Chien chien = new Chien("Robin", "long");
        chien.abonner();
        chien.crier();

        Poule poule = new Poule("leg", "jaune");
        poule.picorer();
        poule.crier();

        Vache vache = new Vache("Manon", "gras");
        vache.copuler();
        vache.crier();


        Animal[]lpoule= new Animal[5];

        lpoule[0]=poule;
        lpoule[1]=vache;


        System.out.println(lpoule[0]);
        //BasseCour bassecour = new BasseCour([Chien,Chat]);

        poule.etremange(chien);

        BasseCour bassecour= new BasseCour();
        bassecour.add("poule",poule);
        bassecour.add("chat",chat);
        bassecour.add("vache",vache);
        bassecour.add("vache", new Vache("Camille", "Sexuellement dépravé"));

        bassecour.describe();

    }




}
