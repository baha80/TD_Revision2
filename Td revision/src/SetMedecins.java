/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author wiemhjiri
 */
public class SetMedecins {
    private Set<Medecin> setM;

    public SetMedecins(){
        setM = new HashSet<>();
    }

    public void ajouterMedecin(Medecin m) {
        //hashet n'autorise pas les doublons
        setM.add(m);

    }

    public boolean rechercherMedecin(int cin) {
        //avec l'api sream
        return setM.contains(cin);

    }

    public void afficherMedecins() {
        //avec l'api sream
        setM.stream().forEach(System.out::println);
    }
    
    public long nombreMedecins(){
        return setM.stream().count();
    }
    
    public TreeSet<Medecin> trierMedecins(){
        return setM.stream().collect(Collectors.toCollection(TreeSet::new));
        
    }
    
}
