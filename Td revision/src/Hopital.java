/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 *
 * @author wiemhjiri
 */
public class Hopital {

    public Map<Medecin, ListPatients> medecinPatiens;

    public Hopital() {
        medecinPatiens = new HashMap<>();
       
    }

    public void ajouterMedecin(Medecin m) {
        medecinPatiens.put(m, new ListPatients());
        
    }

    public void ajouterPatient(Medecin m, Patient p) {
        medecinPatiens.get(m).ajouterPatient(p);
       
        
    }
    /*Avec l'api stream */

    public void afficherMap() {
        /*First way*/
        medecinPatiens.entrySet().stream().forEach(System.out::println);
        
        /*Second Way */
        medecinPatiens.forEach((k,v)->System.out.println(k+" "+v));
        
    }

    /* Afficher les patients dont le nom est "mohamed" 
    qui appartiennent au medecin m passé en paramétre */
    public void afficherMedcinPatients(Medecin m) {
        medecinPatiens.get(m).afficherPatients();
    }

    /* Retourner les noms des patients dont le " numSecuriteSociale = 1" */
    public List<String> RetournerNomPatients() {
        return medecinPatiens.values().stream().flatMap(e -> e.getListP().stream()).filter(e -> e.getNumSecuriteSociale() == 1).map(e -> e.getNom()).collect(Collectors.toList());
       
    }

}
