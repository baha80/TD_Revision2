/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author wiemhjiri
 */
public class ListPatients implements InterfacePatient{
    private List<Patient> listP;

    public ListPatients(){
        listP = new ArrayList<>();
        
        
    }

    public List<Patient> getListP() {
        return listP;
        
    }

    @Override
    public void ajouterPatient(Patient p) {
        listP.add(p);
       
    }

    @Override
    public void supprimerPatient(Patient p) {
        listP.remove(p);
       
    }

/* Avec l'api stream */
    @Override
    public boolean rechercherPatient(Patient p) {
        return listP.contains(p);

     
    }
    
/* Avec l'api stream */
    @Override
    public boolean rechercherPatient(int cin) {
        //avec l'api sream
        return listP.contains(cin);

                
    }

    @Override
    public void afficherPatients() {
        listP.forEach(e->System.out.println(e));
    }
    
/* Avec lambda expression */
    @Override
    public void trierPatientsParNom() {
        Collections.sort(listP,(p1,p2)->p1.getNom().compareTo(p2.getNom()));
    }
    
/* Avec l'api stream */
    public void PatientSansRedondance(){
        listP.stream().distinct().forEach(e->System.out.println(e));
               
    }
    
    /*Méthode toString */

    @Override
    public String toString() {
        return "ListPatients{" + "listP=" + listP + '}';
    }
    
    
}
