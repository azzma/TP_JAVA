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
public class Client {
private String nom;  
private String prenom;
private Double age;
private String adresse;
private String courriel;
private String numtel;

private int client_Id=1;
private String nCompteBancaire;

    public Client(String nom, String prenom, Double age, String adresse, String courriel, String numtel) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.adresse = adresse;
        this.courriel = courriel;
        this.numtel = numtel;
    }

    public int getClient_Id() {
        return client_Id;
    }

    public void setClient_Id(int client_Id) {
        this.client_Id ++;
    }

   
    public Client() {
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

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

   

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public String getNumtel() {
        return numtel;
    }

    public void setNumtel(String numtel) {
        this.numtel = numtel;
    }

    @Override
    public String toString() {
        return "Client{" + "nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", adresse=" + adresse + ", courriel=" + courriel + ", numtel=" + numtel + ", client_Id=" + client_Id + ", nCompteBancaire=" + nCompteBancaire + '}';
    }

 
   
   

   
 
   

  
    
    

}