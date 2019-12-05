package com.ocr.fonctionnementMagiWorld;

import com.ocr.personnagesMagiWorld.Guerrier;
import com.ocr.personnagesMagiWorld.Mage;
import com.ocr.personnagesMagiWorld.Personnages;
import com.ocr.personnagesMagiWorld.Rodeur;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Cette classe déroule le fonctionnement du jeu.
 */
public class PartieJeu {
    private Personnages joueur1, joueur2;
    private int choixNiveau = 0, type = 0, choixForce = 0, choixAgilite = 0, choixIntelligence = 0 ;
    private int vie = 0;
    /**Méthode du déroulement du jeu comprenant la notice, l'instanciation de deux joueurs et la bataille.
     * Recommence le programme complet selon choix de l'utilisateur.
     */
    public PartieJeu() {
        int recommencer = 0;
        Scanner sc = new Scanner(System.in);
        do {
            notice();
            joueur1 = creationJoueurs(1);
            joueur2 = creationJoueurs(2);
            tour();
            System.out.println("\nSouhaitez-vous recommencer la partie ? Saisissez 1 ou 2: \n1 - Oui OU 2 - Non");
            try {
                recommencer = sc.nextInt();
            } catch(InputMismatchException e){
                System.out.println("1 ou Oui ou 2 pour Non");
                sc.nextLine();
            }
        } while(recommencer == 1);
        System.out.println("Ca tombe bien, j'en avais marre de vous voir jouer comme des carpettes !");
        sc.nextInt();
    }
    /**
     * Génère une explication détaillée au début de chaque partie. System.out. uniquement.
     * A voir si dans prochaine version la notice ne se lance qu'à la demande.
     * Aucune action de la part de l'utilisateur attendue sur cette version.
     */
    private void notice() {
        System.out.println("\t\t\t\t\tBienvenus sur MagiWorld !!!" + "\nBatailles épiques en un contre un \nJeu accessible aux plus jeunes.");
        System.out.println("_______________________________________________________________________________________________");
        System.out.println("Notice de création d'un personnage :");
        System.out.println("\nEtape 1: Pour choisir la classe de ton personnage tape 1, 2 ou 3 en fonction de la liste.");
        System.out.println("\nChaque classe ton personnage a accès à deux attaques - Basique ou Spéciale :");
        System.out.println("Guerrier : Attaque Basique - Coup d’Épée : Effectue des dommages égaux à la force du joueur sur l’adversaire.\nAttaque Spéciale - Coup de Rage : Effectue des dommages égaux à la force du joueur fois deux sur l’adversaire. Le joueur lançant l'attaque perd de la vitalité : la valeur de sa force divisée par 2.");
        System.out.println("\nRôdeur : Attaque Basique - Tir à l’Arc : Effectue des dommages égaux à l’agilité du joueur sur l’adversaire.\nAttaque Spéciale - Concentration : Le joueur gagne son niveau divisé par 2 en agilité.");
        System.out.println("\nMage : Attaque Basique - Boule de Feu : Effectue des dommages égaux à l’intelligence du joueur sur l’adversaire. \nAttaque Spéciale - Soin : Le joueur soigne sa vie en regagnant sa quantité d’intelligence fois 2 en points de vie. Attention, il ne peut pas avoir plus de vie qu’il n’en avait au départ.");
        System.out.println("\nNote : La vie de ton personnage est automatiquement calculée : Elle est égale à ton niveau x 5.");
        System.out.println("\nEtape 2: Tu choisis le niveau, la force, l'intelligence et l'agilité de ton personnage;");
        System.out.println("\nNote : ATTENTION ==> La somme de la force, l'intelligence, et l'agilité de ton personnage ne peuvent pas être supérieurs à son niveau.");
        System.out.println("_______________________________________________________________________________________________");
    }
    Scanner sc = new Scanner(System.in);
    /**Création de joueurs paramétrables par l'utilisateur qui sont instanciés dans :
     * @see PartieJeu
     * @param ordreJoueur
     * @return joueur
     * @throws InputMismatchException en cas de mauvaise saisie de l'utilisateur.
     */
    public Personnages creationJoueurs(int ordreJoueur) {
        System.out.println("Veuillez configurez vos personnages :");
        Personnages joueur = null;
        int r;
        do {
            System.out.println("Joueur " + ordreJoueur +", entre dans l'arène et crée ton personnage ! \nQue souhaites-tu devenir ? (Saisis 1,2 ou 3) : \n1- Un guerrier; \t2- Un rôdeur; \t3- Un mage.");
            try {
                type = sc.nextInt();
            } catch (InputMismatchException e ) {
                sc.nextLine();
                System.out.println("Saisis un chiffre entre 1 et 3 !");
            }
        } while (type < 1 || type > 3);
        do {
            System.out.println("Attribues un niveau à ton personnage. \nNOTE : Il doit être entre 1 et 100. Note : Le total de : FORCE + AGILITE + INTELLIGENCE doit être égal au niveau !");
            try {
                choixNiveau = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Saisis un chiffre entre 1 et 100 !");
            }
        } while (choixNiveau < 1 || choixNiveau > 100);
        do {
            System.out.println("Attribues la force à ton personnage: Attention il doit être entre 0 et " + choixNiveau + "!");
            try {
                choixForce = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Saisis un chiffre entre 0 et " + choixNiveau + "!!!");
            }
        } while (choixForce < 0 || choixForce > choixNiveau);
        if(choixForce != choixNiveau) {
            do {
                r = choixNiveau - choixForce;
                System.out.println("Attribues l'intelligence à ton personnage. Attention il doit être en 0 et " + r + ".");
                try {
                    choixIntelligence = sc.nextInt();
                } catch (InputMismatchException e) {
                    sc.nextLine();
                    System.out.println("Saisies un chiffre entre 0 et " + r + ".");
                }
            } while (choixIntelligence < 0 || choixIntelligence > r);
        } else {
            choixIntelligence = 0;
        }
        choixAgilite = choixNiveau - (choixForce + choixIntelligence);
        switch (type) {
            case 1:
                joueur = new Guerrier(choixNiveau, choixForce, choixIntelligence, choixAgilite);
                break;
            case 2:
                joueur = new Rodeur(choixNiveau, choixForce, choixIntelligence, choixAgilite);
                break;
            case 3:
                joueur = new Mage(choixNiveau, choixForce, choixIntelligence, choixAgilite);
                break;
            default:
                System.out.println("\nLe mode fée n'existe pas encore !");
        }
        joueur.description();
        return joueur;
    }
    /** Génère les tours de la bataille pour qu'ils s'enchainent.
     */
    public void tour(){
        System.out.println("Une nouvelle bataille pour la gloire commence!!!\n");
        do {
            if (joueur1.getVie() > 0) {
                System.out.println("Joueur 1, quelle attaque choisis-tu? (Saisis 1 ou 2): \n1 - Attaque basique; 2 - Attaque spéciale\n");
                bataille(joueur1, joueur2);
            }
            if (joueur2.getVie() > 0) {
                System.out.println("Joueur 2, quelle attaque choisis-tu? (Saisis 1 ou 2): \n1 - Attaque basique; 2 - Attaque spéciale\n");
                bataille(joueur2, joueur1);
            }
        }while (joueur1.getVie() > 0 && joueur2.getVie() > 0);
        if (joueur1.getVie() > joueur2.getVie()) {
            System.out.println("\nLe Joueur 1 est le super " + joueur1.getClass().getSimpleName() + ". Il a gagné ! \nLe Joueur 2, en mourrant tu fais honte à toute ta classe de " + joueur2.getClass().getSimpleName() + "!!!");
        } else {
            System.out.println("\nLe Joueur 2 est le super " + joueur2.getClass().getSimpleName() + ". Il a gagné ! \nLe Joueur 1, en mourrant tu fais honte à toute ta classe de " + joueur1.getClass().getSimpleName() + "!!!");
        }
    }
    /**Création des batailles.
     * @param attaquant
     * @param victime
     */
    public void bataille(Personnages attaquant, Personnages victime) {
            int choixAttaque;
            choixAttaque = sc.nextInt();
            switch (choixAttaque) {
                case 1:
                    attaquant.attaqueBasique(victime);
                    break;
                case 2:
                    attaquant.attaqueSpeciale(victime);
                    break;
                default:
                    System.out.println("!!!!!!!!!! Tu ne peux pas lancer de paillettes!!");
                    break;
            }
    }
}
