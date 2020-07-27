

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.*;


public class BasseCour {
    private Map<String,List <Animal>> animals = new HashMap<>();

    public Map<String, List <Animal>> getDic()
    {
        return(this.animals);
    }
    /*
    methode add: prend aussi le type en parametre
    chercher dans le dictionnaire le type de l'animal
    si il n'y en a pas creer une liste de ce type dans le dictoonnaire
    sinon ajouter a la liste deja presente
     */
    public void add(String type,Animal animal)
    {
        List <Animal> tri= animals.get(type);
        if (tri==null)
        {
            tri=new ArrayList<Animal>();
            tri.add(animal);
            animals.put(type,tri);
        }
        else
        {
            tri.add(animal);
            animals.put(type,tri);
        }
    }
    public void describe()
    {
        for (Map.Entry<String,List <Animal>> entry: animals.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue().size());
            for (Animal a : entry.getValue())
                System.out.println(a.getNom() +" : "+a.getAttribut());
        }
    }




}
