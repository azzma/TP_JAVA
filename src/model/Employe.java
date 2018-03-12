/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author asmaa
 */
public class Employe {

    private String nom;
    private String prenom;
    private double salaire;
    private String employe_Id;
    private String password;
    private String date_embauche;
    private String fonction;
    private double commission;

    public Employe(String nom, String prenom, double salaire, String employe_Id, String password, String date_embauche, String fonction, double commission) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        this.employe_Id = employe_Id;
        this.password = password;
        this.date_embauche = date_embauche;
        this.fonction = fonction;
        this.commission = commission;
    }

    
     public Employe() {
    }

    

    public String getDate_embauche() {
        return date_embauche;
    }

    public void setDate_embauche(String date_embauche) {
        this.date_embauche = date_embauche;
    }

   

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getEmploye_Id() {
        return employe_Id;
    }

    public void setEmploye_Id(String employe_Id) {
        this.employe_Id = employe_Id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return "Employe{" + "nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + ", employe_Id=" + employe_Id + ", password=" + password + ", date_embauche=" + date_embauche + ", fonction=" + fonction + ", commission=" + commission + '}';
    }

    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.nom);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employe other = (Employe) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (this.employe_Id != other.employe_Id) {
            return false;
        }
        if (!Objects.equals(this.fonction, other.fonction)) {
            return false;
        }
        return true;
    }

    
    
    
}
