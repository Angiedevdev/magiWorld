package com.ocr.personnagesMagiWorld;

public class Personnages {

   int vie, niveau, force, intelligence, agilite;

    /** Constructeur par défaut de l'objet personnage.
     */
    public Personnages() {
        niveau = 0;
        force = 0;
        intelligence = 0;
        agilite = 0;
        this.getVie();
    }
    /** Constructeur avec paramètres de l'objet personnage.
     * @param agilite
     * @param force
     * @param intelligence
     * @param niveau
     */
    public Personnages(int niveau, int force, int intelligence, int agilite) {
        this.vie = niveau*5;
        this.niveau = niveau;
        this.force = force;
        this.intelligence = intelligence;
        this.agilite = agilite;
    }
    //             ACCESSEURS
    /**Accède à la vie du joueur
     * @return vie
     */
    public int getVie() {
        return vie;
    }
    /**Accède au niveau du joueur
     * @return niveau
     */
    protected int getNiveau() {
        return niveau;
    }
    /**Accède à la force du joueur
     * @return force
     */
    public int getForce() {
        return force;
    }
    /**Accède à l'intelligence du joueur
     * @return intelligence
     */
    public int getIntelligence() {
        return intelligence;
    }
    /** Accède à l'agilité du joueur
     * @return agilite */
    public int getAgilite() {
        return agilite;
    }
    //        MUTATEURS :
    /** Modifie vie du joueur
     * @param vie
     */
    public void setVie(int vie) {
        this.vie = this.niveau*5;
    }
    /** Modifie niveau du joueur
     * @param niveau
     */
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
    /** Modifie force du joueur
     * @param force
     */
    public void setForce(int force) {
        this.force = force;
    }
    /** Modifie intelligence du joueur
     * @param intelligence
     */
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    /** Modifie agilité du joueur
     * @param agilite
     */
    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }
    //          FONCTIONS :
    /** Le joueur se décrit avec ses fonctions vitales.
     * @return
     */
    public void description() {
       System.out.println("Je suis un "+ getClass().getSimpleName() + " (" + getVie() + " de vitalité), de niveau " + getNiveau() + ", de force " + getForce() + ", d'intelligence " + getIntelligence() + ", d'agilité " + getAgilite() + ".\n");
    }
    /** Le joueur attaque sa victime avec attaque de base.
     * @param victime
     */
    public void attaqueBasique(Personnages victime) {
        System.out.println("Je viens de lancer l'attaque basique. Regarde le résultat : ");
        System.out.println("Il te reste " + victime.vie + " de vitalité, " + victime.force + " de force, " + victime.intelligence + " d'intelligence, " + victime.agilite + " d'agilité !\n");
    }
    /** Le joueur attaque sa victime avec attaque spécifique.
     * @param victime
     */
    public void attaqueSpeciale(Personnages victime) {
        System.out.println("Je viens de lancer l'attaque spéciale. Regarde le résultat :");
        System.out.println("Il te reste " + victime.vie + " de vitalité, " + victime.force + " de force, " + victime.intelligence + " d'intelligence, " + victime.agilite + " d'agilité!");
        System.out.println("Quant à moi, il me reste " + this.vie + " de vitalité, " + this.force + " de force, " + this.intelligence + " d'intelligence, " + this.agilite + " d'agilité!\n");
    }
}