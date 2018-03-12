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
public  class liste_employe {

            ArrayList <Employe> liste_employe= new ArrayList<>();

    public ArrayList<Employe> getListe_employe() {
        return liste_employe;
    }

    public void setListe_employe(ArrayList<Employe> liste_employe) {
        this.liste_employe = liste_employe;
    }
  
    
    public liste_employe (){

        
    }
public void ajouterEmploye (Employe e){
    
   try{
      
       
       if (repetition(e)){
           liste_employe.add(e);
                   
           
       }else{
           
           throw new Employe_deja_presentException("le nom suivant"+ e.getNom()+"ou le prenom suivant"+e.getPrenom()+"existe deja",e );
           
       }
   }catch (Employe_deja_presentException emp){
      System.out.println(emp.getMessage());
           
   }
    
}
public boolean repetition (Employe e){
boolean x=true;
for (Employe emp: liste_employe){
    if (emp.getNom()==emp.getNom() ||emp.getPrenom()==emp.getPrenom()){
        x=false;
        break;
        
        
    }else{
        x=true;
        
    }
    
}
    return x;
}
//    public void affichage (){
//        for (Employe emp: liste_employe){
//            System.out.println("le nom de l'employe est : "+emp.getNom()+"   ,prenom"+emp.getPrenom()+"age"+emp.getAge());
//        }
   // }
}
