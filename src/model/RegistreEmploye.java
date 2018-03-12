/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import utils.Employe_deja_presentException;

/**
 *
 * @author asmaa
 */
public class RegistreEmploye extends ArrayList<Employe> {

//            ArrayList <Employe> liste_employe= new ArrayList<>();
    public RegistreEmploye() {

    }

    public void ajouterEmploye(Employe e) {

        try {

            if (repetition(e)) {
                this.add(e);

            } else {

                throw new Employe_deja_presentException("le nom suivant" + e.getNom() + "ou le prenom suivant" + e.getPrenom() + "existe deja", e);

            }
        } catch (Employe_deja_presentException emp) {
            System.out.println(emp.getMessage());

        }

    }

    public boolean repetition(Employe e) {
        boolean x = true;
        for (Employe emp : this) {
            if (emp.getNom() == emp.getNom() || emp.getPrenom() == emp.getPrenom()) {
                x = false;
                break;

            } else {
                x = true;

            }

        }
        return x;
    }
//    public void affichage (){
//        for (Employe emp: liste_employe){
//            System.out.println("le nom de l'employe est : "+emp.getNom()+"   ,prenom"+emp.getPrenom()+"age"+emp.getAge());
//        }
//    }

//    public Employe chercherEmpolye(Employe emp) {
//        Employe x=  ;
//        for (Employe emp : this) {
//            if (emp.equals(emp)) {
//                x = emp;
//                break;
//
//            } 
////            else {
////                x = true;
////
////            }
//
//        }
//        return x;
//    }
}
