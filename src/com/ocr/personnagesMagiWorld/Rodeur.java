package com.ocr.personnagesMagiWorld;

public class Rodeur extends Personnages {
    /** Constructeur par défaut de l'objet rôdeur
     */
    public Rodeur() {
        super();
    }
    /** Constructeur avec paramètres de l'objet rôdeur.
     * @param agilite
     * @param force
     * @param intelligence
     * @param niveau
     * @param vie
     */
    public Rodeur(int vie, int niveau, int force, int intelligence, int agilite) {
        super(vie, niveau, force, intelligence, agilite);
    }
    /** Le joueur attaque sa victime avec attaque de base.
     * @param victime
     */
    @Override
    public void attaqueBasique(Personnages victime) {
        victime.vie = victime.vie - this.agilite;
        super.attaqueBasique(victime);
    }
    /** Le joueur attaque sa victime avec attaque spécifique.
     * @param victime
     */
    @Override
    public void attaqueSpeciale(Personnages victime) {
        this.agilite = this.agilite + (this.niveau / 2);
        super.attaqueSpeciale(victime);
    }
}
