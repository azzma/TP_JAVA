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
import model.Contrat;
import model.RegistreClient;
import java.io.InputStreamReader;
/**
 *
 * @author asmaa
 */
public class ManipulationFichier {

    public static void lireFichier(String nomFichier, RegistreClient registre) {
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
                Client obj = parseLigne(ligne);
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

    private static Client parseLigne(String ligne) {
        String[] tokens = ligne.split(" ");
        String nom = tokens[0];
        String prenom = tokens[1];
        Double age= Double.valueOf(tokens[2]);
        String adresse = tokens[3];
        String courriel = tokens[4];
        String numtel = tokens[5];

        return new Client(nom, prenom,age,adresse,courriel,numtel);
    }

    private static String formerLigne(Client clt) {
        String ligne;
        ligne = clt.getNom() + ";" + clt.getPrenom() + ";"
                + clt.getAdresse() + "\n";
        return ligne;
    }
     public static RegistreClient LireData(String datatxt) {

        RegistreClient registre = new RegistreClient();

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

//    public static void lireFichier(String datatxt, RegistreClient registre) {
//        File file = new File(datatxt);
//        FileReader fr = null;
//
//        BufferedReader br = null;
//        String line = "";
//        try {
//            // lecture
//
//            fr = new FileReader(file);
//            br = new BufferedReader(fr);
//            while ((line = br.readLine()) != null) {
//                Client c = trasformerLigne(line);
//                //System.out.println(line);
//                registre.add(c);
//            }
//        } catch (IOException ex) {
//            Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//
//            try {
//                fr.close();
//            } catch (IOException ex) {
//                Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        }
////        FileReader fr = null;
////        try {
////            File file = new File(datatxt);
////            fr = new FileReader(file);
////            BufferedReader br = new BufferedReader(fr);
////            //Faire la lecture
////            String ligne;
////            //RegistreArticles registre = new RegistreProduits();
////            while ((ligne = br.readLine()) != null) {
////                System.out.println(ligne);
////                //extraire les tokens / description-prix et qte
////                Client obj = parseLigne(ligne);
////                //ajouter dans la liste des articles                
////                registre.ajouterClient(obj);
////                
////            }
////
////        } catch (FileNotFoundException ex) {
////            Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
////        } catch (IOException ex) {
////            Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
////        } finally {
////            try {
////                fr.close();
////            } catch (IOException ex) {
////                Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
////            }
////        }
//    }
//
//    private static Client trasformerLigne(String ligne) {
//        String[] tab = ligne.split(" ");
//
//        String nom = tab[0];
//        String prenom = tab[1];
//        Double age = Double.parseDouble(tab[2]);
//        String adresse = tab[3];
//        String courriel = tab[4];
//        String numtel = tab[5];
//
//        //int client_Id=Integer.parseInt(tokens[6]);;
//        //String nCompteBancaire=String.valueOf(tokens[7]);;
//        //,client_Id,nCompteBancaire
//        return new Client(nom, prenom, age, adresse, courriel, numtel);
//
//    }
//
//    public static RegistreClient LireData(String datatxt) {
//
//        RegistreClient registre = new RegistreClient();
//
//        File file = new File(datatxt);
//        FileReader fr = null;
//        BufferedReader br = null;
//        String line = "";
//        try {
//            // lecture
//
//            fr = new FileReader(file);
//            br = new BufferedReader(fr);
//            while ((line = br.readLine()) != null) {
//
//                registre.add(trasformerLigne(line));
//            }
//        } catch (IOException ex) {
//            Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return registre;
//    }
}
