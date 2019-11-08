package com.ocr.personnagesMagiWorld;

public class Personnages {

    private int niveau;
    private int force;
    private int intelligence;
    private int agilite;
    private int vie;


    //Constructeur par defaut
    public Personnages() {
        niveau = 0;
        force = 0;
        intelligence = 0;
        agilite = 0;
        this.getVie();
    }

    public Personnages(int jNiveau, int jForce, int jIntelligence, int jAgilite) {
        niveau = jNiveau;
        force = jForce;
        intelligence = jIntelligence;
        agilite = jAgilite;
        vie = niveau * 5;
    }

    //-----ACCESSEURS----- attention voir si toujours utiles après.
    public int getNiveau() {
        return niveau;
    }

    public int getForce() {
        return force;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getAgilite() {
        return agilite;
    }

    public int getVie() { // !!!!!!!!! *5 !!!!!
        return vie;
    }

    //-------MUTATEURS----- attention voir si toujours utiles après.
    public void setNiveau(int jNiveau) {
        niveau = jNiveau;
    }

    public void setForce(int jForce) {
        force = jForce;
    }

    public void setIntelligence(int jIntelligence) {
        intelligence = jIntelligence;
    }

    public void setAgilite(int jAgilite) {
        agilite = jAgilite;
    }

    public void setVie(int jVie) {
        vie = jVie;
    }

    public void getClass(String perso) {// pour le getclass qui suit

    }

    public String description() { //Ici le 1 2 et 3 servent uniquement à savoir ce qui est imprimé // Revoir cette méthode.... PAs bonne

        //else // getclass
        return "Je suis un */mettre getclass/* (" + getVie() + " de vitalité), de niveau " + getNiveau() + ", de force " + getForce() + ", d'intelligence " + getIntelligence() + ", d'agilité " + getAgilite() + ".";
    }
    //------AUTRES-------

    public String AttaqueBasique() {
        return "Invocation attaque basique classe Mère";
    }

    public String AttaqueSpeciale() {
        return "Invocation attaque spéciale classe Mère";
    }
}