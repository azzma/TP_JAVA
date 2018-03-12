/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import model.Employe;

/**
 *
 * @author asmaa
 */
public class Employe_deja_presentException extends Exception {

    private Employe personne;

    public Employe_deja_presentException() {

    }

    public Employe_deja_presentException(String msg, Employe personne) {
        super(msg);

        this.personne = personne;

    }

    

    public Employe getPersonne() {
        return personne;
    }

    public void setPersonne(Employe personne) {
        this.personne = personne;
    }

}
