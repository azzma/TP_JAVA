/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Client;
import model.Employe;
import model.RegistreClient;
import model.RegistreEmploye;

/**
 *
 * @author yacyn
 */
public class ManipulationFichierEmployee {
     public static void lireFichier(String nomFichier, RegistreEmploye registre) {
      File file = new File(nomFichier);
        FileReader fr = null;
        BufferedReader br = null;
        String line = "";
        try {
            
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            //Faire la lecture
            String ligne;
            //RegistreArticles registre = new RegistreProduits();
            while ((ligne = br.readLine()) != null) {
              //  System.out.println(ligne);
                //extraire les tokens / description-prix et qte
                Employe obj = parseLigne(ligne);
                //ajouter dans la liste des articles                
                registre.add(obj);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private static Employe parseLigne(String ligne) {
       
String[] tokens = ligne.split(" ");
        String nom = tokens[0];
        String prenom = tokens[1];
        Double salaire= Double.parseDouble(tokens[2]);
        String employe_Id= tokens[3];
        String password= tokens[4];
        String date_embauche=tokens[5];
        String fonction= tokens[6];
        Double commission= Double.parseDouble(tokens[7]);

        return new Employe(nom,prenom,salaire,employe_Id,password,date_embauche,fonction,commission);
    }
    public static RegistreEmploye LireData(String datatxt) {

        RegistreEmploye registre = new RegistreEmploye();

        File file = new File(datatxt);
        FileReader fr = null;
        BufferedReader br = null;
        String line = "";
        try {
            // lecture

            fr = new FileReader(file);
            br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {

                registre.add(parseLigne(line));
            }
        } catch (IOException ex) {
            Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
        }

        return registre;
    }

   
    
}
