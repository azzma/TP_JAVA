/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author yacyn
 */
public class RegistreClient extends ArrayList<Client> {

    public void ajouterClient(Client obj) {
        this.add(obj);
    }

    public void afficherClient() {

        for (Client clt : this) {
            System.out.println(clt);
        }
    
    }


}
