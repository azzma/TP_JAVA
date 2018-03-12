/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import java.io.InputStreamReader;
import Utils.*;
import Vue.interface2;

import model.RegistreClient;

/**
 *
 * @author asmaa
 */
public class AppCtr {

    public static void main(String args[]) {
//         RegistreClient registre= new RegistreClient();
//       
//        try{
//           ManipulationFichier.lireFichier("client.txt", registre); 
//       throw new  NumberFormatException ("erreur de saiaie");
//       // registre.afficherClient();  
//      }catch(NumberFormatException e){
//            System.out.println("erreur");
//      }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface2().setVisible(true);
            }
        });
         
       
       
    
    }

}
