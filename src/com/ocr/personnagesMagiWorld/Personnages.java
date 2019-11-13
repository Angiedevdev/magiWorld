package com.ocr.personnagesMagiWorld;

public class Personnages {

   protected int vie, niveau, force, intelligence, agilite;
    //Constructeur par defaut
    protected Personnages() {
        niveau = 0;
        force = 0;
        intelligence = 0;
        agilite = 0;
        this.getVie();
    }
    protected Personnages(int vie, int niveau, int force, int intelligence, int agilite) {
        this.vie = niveau*5;
        this.niveau = niveau;
        this.force = force;
        this.intelligence = intelligence;
        this.agilite = agilite;
    }
    //-----ACCESSEURS-----
    //Permet d'accéder à la vie du personnage :
    public int getVie() {
        return vie;
    }
    //Permet d'accéder au niveau du personnage :
    public int getNiveau() {
        return niveau;
    }
    //Permet d'accéder à la force du personnage :
    public int getForce() {
        return force;
    }
    //Permet d'accéder à l'intelligence du personnage :
    public int getIntelligence() {
        return intelligence;
    }
    //Permet d'accéder à l'agilité du personnage :
    public int getAgilite() {
        return agilite;
    }
    //-------MUTATEURS-----
    //Permet de modifier la vie du personnage : (!!!!!!!Attention peut-être à retirer puisque la vie s'initialise par calcul.
    public void setVie(int vie) {
        this.vie = vie;
    }
    //Permet de modifier le niveau du personnage :
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
    //Permet de modifier la force du personnage :
    public void setForce(int force) {
        this.force = force;
    }
    //Permet de modifier l'intelligence du personnage :
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    //Permet de modifier l'agilité du personnage :
    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }
    //------FONCTIONS-------
    //Permet d'afficher la description complète du personnage :
    public void description() {
        System.out.println("Je suis un nouveau personnage" + "(" + getVie() + " de vitalité), de niveau " + getNiveau() + ", de force " + getForce() + ", d'intelligence " + getIntelligence() + ", d'agilité " + getAgilite() + ".");
    }
    //Permet une attaque basique
    public void attaqueBasique() {
        System.out.println("J'attaque doucement avec mon attaqueBasique");
    }
    public void attaqueSpeciale() {
        System.out.println("J'attaque doucement avec mon attaqueSpeciale");
    }
}