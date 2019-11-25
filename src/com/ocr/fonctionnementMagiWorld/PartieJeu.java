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
    private int choixNiveau, totalFAI, type, choixForce, choixAgilite, choixIntelligence;
    private int vie = 0;
    /**
     * Méthode du déroulement du jeu comprenant la notice, l'instanciation de deux joueurs et la bataille.
     * Recommence le programme complet selon choix de l'utilisateur.
     */
    public PartieJeu() {
        int recommencer;
        Scanner sc = new Scanner(System.in);
        do {
            notice();
            joueur1 = creationJoueurs(1);
            joueur2 = creationJoueurs(2);
            bataille();
            System.out.println("\nSouhaitez-vous recommencer la partie ? Saisissez 1 ou 2: \n1 - Oui OU 2 - Non");
            recommencer = sc.nextInt();
        } while(recommencer == 1);
        if(recommencer == 2)
            System.out.println("Ca tombe bien, j'en avais marre de vous voir jouer comme des carpettes !");
            sc.nextInt();
    }
    /**
     * Génère une explication détaillée au début de chaque partie. System.out. uniquement.
     * A voir si dans prochaine version la notice ne se lance qu'à la demande.
     * Aucune action de la part de l'utilisateur attendue sur cette version.
     */
    private void notice() {
        System.out.println("                                              Bienvenus sur MagiWorld !!!" + "\nJeux de stratégie Old-Old-Old-School" + "\nBatailles épiques en un contre un - Le joueur gagnant est le dernier à conserver ses points." + "\nJeu accessible aux plus jeunes.");
        System.out.println("_______________________________________________________________________________________________\n");
        System.out.println("Notice de création d'un personnage :");
        System.out.println("\nEtape 1: Pour choisir la classe de ton personnage tape 1, 2 ou 3 en fonction de la liste.");
        System.out.println("         \nChaque classe à accès à deux attaques spécifiques (Basique ou Spéciale):");
        System.out.println("Guerrier : Attaque Basique - Coup d’Épée : Effectue des dommages égaux à la force du joueur sur l’adversaire.\n           Attaque Spéciale - Coup de Rage : Effectue des dommages égaux à la force du joueur fois deux sur l’adversaire. Le joueur lançant l'attaque perd de la vitalité : la valeur de sa force divisée par 2.");
        System.out.println("\nRôdeur : Attaque Basique - Tir à l’Arc : Effectue des dommages égaux à l’agilité du joueur sur l’adversaire.\n         Attaque Spéciale - Concentration : Le joueur gagne son niveau divisé par 2 en agilité.");
        System.out.println("\nMage : Attaque Basique - Boule de Feu : Effectue des dommages égaux à l’intelligence du joueur sur l’adversaire. \n       Attaque Spéciale - Soin : Le joueur soigne sa vie et regagne sa quantité d’intelligence fois 2 en points de vie. Attention, il ne peut pas avoir plus de vie qu’il n’en avait au départ.");
        System.out.println("\nNote : Ta vie est automatiquement calculée : Elle est égale à ton niveau x 5.");
        System.out.println("\nEtape 2: Tu dois choisir le niveau de ton personnage. Pour cela tape sur ton clavier numérique un chiffre entre 1 et 100;");
        System.out.println("Etape 3: Tu dois choisir la force de ton personnage. Pour cela tape sur ton clavier numérique un chiffre entre 0 et 100;");
        System.out.println("Etape 4: Tu dois choisir l'intelligence de ton personnage. Pour cela tape sur ton clavier numérique un chiffre entre 0 et 100;");
        System.out.println("Etape 5: Tu dois choisir l'agilité de ton personnage. Pour cela tape sur ton clavier numérique un chiffre entre 0 et 100.");
        System.out.println("\nNote : ATTENTION ==> La somme de la force, l'intelligence, et l'agilité de ton personnage ne peuvent pas être supérieurs à son niveau. \n       Tu peux choisir 0 pour certains paramètres si ce n'est pas utile pour ton personnage. Regarde plus haut dans cette notice.");
        System.out.println("\nEx. : Tu as choisis la configuration suivante : Niveau 50, Force 18, Intelligence 40, Agilité 2. \n          Le total étant supérieur à 50 (18 + 40 + 2 = 60), le programme te demandera de recommencer.");
        System.out.println("_______________________________________________________________________________________________");
    }
    /**
     * Création de joueurs paramétrables par l'utilisateur qui sont instanciés dans :
     * @see PartieJeu
     * @param ordreJoueur
     * @return joueur
     * @throws InputMismatchException en cas de mauvaise saisie de l'utilisateur.
     */
    Scanner sc = new Scanner(System.in);
    private Personnages creationJoueurs(int ordreJoueur) {
        System.out.println("          Veuillez configurez vos joueurs :          ");
        Personnages joueur = null;
        do {
            System.out.println("              Joueur " + ordreJoueur +", entre dans l'arène et crée ton personnage ! \nQue souhaites-tu devenir ? (Saisis 1,2 ou 3) : \n1- Un guerrier; \n2- Un rôdeur; \n3- Un mage.");
            try {
                type = sc.nextInt();
            } catch (InputMismatchException e ) {
                sc.nextLine();
                System.out.println("Vous avez saisie un caractère. Merci de saisir un chiffre !");
            }
            switch (type) {
                case 1:
                    System.out.println("\nVous avez choisi de créer un guerrier !\n");
                    joueur = new Guerrier();
                    break;
                case 2:
                    System.out.println("\nVous avez choisi de créer un rôdeur !\n");
                    joueur = new Rodeur();
                    break;
                case 3:
                    System.out.println("\nVous avez choisi de créer un mage !\n");
                    joueur = new Mage();
                    break;
            }
        } while (type < 1 || type > 3);
        do {
            do {
                System.out.println("Attribut un niveau à ton personnage. \nAttention : Il doit être en 1 et 100 et le total de : FORCE + AGILITE + INTELLIGENCE doit être égal au niveau !\n ");
                choixNiveau = sc.nextInt();
                if (choixNiveau < 1 || choixNiveau > 100)
                    System.out.println("Attention, tu dois choisir entre 1 et 100.");
                else
                    joueur.setNiveau(choixNiveau);
            } while (choixNiveau < 1 || choixNiveau > 100);
            do {
                System.out.println("Attribut la force à ton personnage. Attention il doit être en 0 et 100.");
                choixForce = sc.nextInt();
                if (choixForce < 0 || choixForce > 100)
                    System.out.println("Attention, tu dois choisir entre 0 et 100.");
                else
                    joueur.setForce(choixForce);
            } while (choixForce < 0 || choixForce > 100);
            do {
                System.out.println("Attribut l'agilité à ton personnage. Attention il doit être en 0 et 100.");
                choixAgilite = sc.nextInt();
                if (choixAgilite < 0 || choixAgilite > 100)
                    System.out.println("Attention, tu dois choisir entre 0 et 100.");
                else
                    joueur.setAgilite(choixAgilite);
            } while (choixAgilite < 0 || choixAgilite > 100);
            do {
                System.out.println("Attribut l'intelligence à ton personnage. Attention il doit être en 0 et 100.");
                choixIntelligence = sc.nextInt();
                if (choixIntelligence < 0 || choixIntelligence > 100)
                    System.out.println("Attention, tu dois choisir entre 0 et 100.");
                else
                    joueur.setIntelligence(choixIntelligence);
            } while (choixIntelligence < 0 || choixIntelligence > 100);
            totalFAI = choixForce + choixAgilite + choixIntelligence;
        } while (choixNiveau != totalFAI);
        joueur.setVie(vie);
        joueur.description();
        System.out.println("\n");
        return joueur;
    }
    /**
     * Génère un combat à mort au tour par tour. Boucle qui recommence jusqu'à pouvoir determiner un gagnant.
     */
    private void bataille() {
        do {
            System.out.println("\n                              Une nouvelle bataille pour la gloire commence!!!\n");
            int choixAttaque;
            if (joueur1.getVie() > 0) {
                System.out.println("Joueur 1 quelle attaque choisis-tu? (Saisis 1 ou 2): \n1- Attaque basique; \n2- Attaque spéciale\n");
                choixAttaque = sc.nextInt();
                switch (choixAttaque) {
                    case 1:
                        joueur1.attaqueBasique(joueur2);
                        break;
                    case 2:
                        joueur1.attaqueSpeciale(joueur2);
                        break;
                    default:
                        System.out.println("!!!!!!!!!! Tu ne peux pas lancer de paillettes!!");
                        break;
                }
            }
            if (joueur2.getVie() > 0) {
                System.out.println("Joueur 2 quelle attaque choisis-tu? (Saisis 1 ou 2): \n1- Attaque basique; \n2- Attaque spéciale.");
                choixAttaque = sc.nextInt();
                switch (choixAttaque) {
                    case 1:
                        joueur2.attaqueBasique(joueur1);
                        break;
                    case 2:
                        joueur2.attaqueSpeciale(joueur1);
                        break;
                    default:
                        System.out.println("\nTu ne peux pas lancer de paillettes!!");
                        break;
                }
            }
        }while (joueur1.getVie() > 0 && joueur2.getVie() > 0);
        if (joueur1.getVie() > joueur2.getVie()) {
            System.out.println("\nLe Joueur 1 est le super " + joueur1.getClass().getSimpleName() + ". Il a gagné ! \nLe Joueur 2, en mourrant tu fais honte à toute ta classe de " + joueur2.getClass().getSimpleName() + "!!!");
        } else {
            System.out.println("\nLe Joueur 2 est le super " + joueur2.getClass().getSimpleName() + ". Il a gagné ! \nLe Joueur 1, en mourrant tu fais honte à toute ta classe de " + joueur1.getClass().getSimpleName() + "!!!");
        }
    }
}
