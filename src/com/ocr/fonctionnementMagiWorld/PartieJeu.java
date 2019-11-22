package com.ocr.fonctionnementMagiWorld;

import com.ocr.personnagesMagiWorld.Guerrier;
import com.ocr.personnagesMagiWorld.Mage;
import com.ocr.personnagesMagiWorld.Personnages;
import com.ocr.personnagesMagiWorld.Rodeur;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PartieJeu {
    private Personnages joueur1, joueur2;
    private int choixNiveau, totalFAI, type, choixForce, choixAgilite, choixIntelligence;
    private int vie = 0;
    public PartieJeu() {
            notice();
            creationJoueurs();
            bataille();
    }

    /* Lance une explication du jeu à chaque fois qu'il est lancé */
    public void notice() {
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
    Scanner sc = new Scanner(System.in);
    public void creationJoueurs() {//Creation joueur 1 et creation joueur 2
        System.out.println("          Veuillez configurez vos joueurs :          ");
        do {
            System.out.println("              Joueur 1, entre dans l'arène et crée ton personnage ! \nQue souhaites-tu devenir ? (Saisis 1,2 ou 3) : \n1- Un guerrier; \n2- Un rôdeur; \n3- Un mage.");
            try {
                type = sc.nextInt();
            } catch (InputMismatchException e ) {
                sc.nextLine();
                System.out.println("Vous avez saisie un caractère. Merci de saisir un chiffre !");
            }
            switch (type) {
                case 1:
                    System.out.println("\nVous avez choisi de créer un guerrier !\n");
                    joueur1 = new Guerrier();
                    break;
                case 2:
                    System.out.println("\nVous avez choisi de créer un rôdeur !\n");
                    joueur1 = new Rodeur();
                    break;
                case 3:
                    System.out.println("\nVous avez choisi de créer un mage !\n");
                    joueur1 = new Mage();
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
                    joueur1.setNiveau(choixNiveau);
            } while (choixNiveau < 1 || choixNiveau > 100);
            do {
                System.out.println("Attribut la force à ton personnage. Attention il doit être en 0 et 100.");
                choixForce = sc.nextInt();
                if (choixForce < 0 || choixForce > 100)
                    System.out.println("Attention, tu dois choisir entre 0 et 100.");
                else
                    joueur1.setForce(choixForce);
            } while (choixForce < 0 || choixForce > 100);
            do {
                System.out.println("Attribut l'agilité à ton personnage. Attention il doit être en 0 et 100.");
                choixAgilite = sc.nextInt();
                if (choixAgilite < 0 || choixAgilite > 100)
                    System.out.println("Attention, tu dois choisir entre 0 et 100.");
                else
                    joueur1.setAgilite(choixAgilite);
            } while (choixAgilite < 0 || choixAgilite > 100);
            do {
                System.out.println("Attribut l'intelligence à ton personnage. Attention il doit être en 0 et 100.");
                choixIntelligence = sc.nextInt();
                if (choixIntelligence < 0 || choixIntelligence > 100)
                    System.out.println("Attention, tu dois choisir entre 0 et 100.");
                else
                    joueur1.setIntelligence(choixIntelligence);
            } while (choixIntelligence < 0 || choixIntelligence > 100);
            totalFAI = choixForce + choixAgilite + choixIntelligence;
        } while (choixNiveau != totalFAI);
        joueur1.setVie(vie);
        joueur1.description();
        System.out.println("\n");

        do {
        System.out.println("              Joueur 2, entre dans l'arène et crée ton personnage ! \nQue souhaites-tu devenir ?(saisis 1,2 ou 3) : \n1- Un guerrier; \n2- Un rôdeur; \n3- Un mage.");
        type = sc.nextInt();
            switch (type) {
                case 1:
                    System.out.println("\nVous avez choisi de créer un guerrier !\n");
                    joueur2 = new Guerrier();
                    do {
                        do {
                            System.out.println("Attribut un niveau à ton personnage. \nAttention : Il doit être en 1 et 100 et le total de : FORCE + AGILITE + INTELLIGENCE doit être égal au niveau !\n ");
                            choixNiveau = sc.nextInt();
                            if (choixNiveau < 1 || choixNiveau > 100)
                                System.out.println("Attention, tu dois choisir entre 1 et 100.");
                            else
                                joueur2.setNiveau(choixNiveau);
                        } while (choixNiveau < 1 || choixNiveau > 100);
                        do {
                            System.out.println("Attribut la force à ton personnage. Attention il doit être en 0 et 100.");
                            choixForce = sc.nextInt();
                            if (choixForce < 0 || choixForce > 100)
                                System.out.println("Attention, tu dois choisir entre 0 et 100.");
                            else
                                joueur2.setForce(choixForce);
                        } while (choixForce < 0 || choixForce > 100);
                        do {
                            System.out.println("Attribut l'agilité à ton personnage. Attention il doit être en 0 et 100.");
                            choixAgilite = sc.nextInt();
                            if (choixAgilite < 0 || choixAgilite > 100)
                                System.out.println("Attention, tu dois choisir entre 0 et 100.");
                            else
                                joueur2.setAgilite(choixAgilite);
                        } while (choixAgilite < 0 || choixAgilite > 100);
                        do {
                            System.out.println("Attribut l'intelligence à ton personnage. Attention il doit être en 0 et 100.");
                            choixIntelligence = sc.nextInt();
                            if (choixIntelligence < 0 || choixIntelligence > 100)
                                System.out.println("Attention, tu dois choisir entre 0 et 100.");
                            else
                                joueur2.setIntelligence(choixIntelligence);
                        } while (choixIntelligence < 0 || choixIntelligence > 100);
                        totalFAI = choixForce + choixAgilite + choixIntelligence;
                    } while (choixNiveau != totalFAI);
                    joueur2.setVie(vie);
                    joueur2.description();
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("\nVous avez choisi de créer un Rôdeur !\n");
                    joueur2 = new Rodeur();
                    do {
                        do {
                            System.out.println("Attribut un niveau à ton personnage. \nAttention : Il doit être en 1 et 100 et le total de : FORCE + AGILITE + INTELLIGENCE doit être égal au niveau !\n ");
                            choixNiveau = sc.nextInt();
                            if (choixNiveau < 1 || choixNiveau > 100)
                                System.out.println("Attention, tu dois choisir entre 1 et 100.");
                            else
                                joueur2.setNiveau(choixNiveau);
                        } while (choixNiveau < 1 || choixNiveau > 100);
                        do {
                            System.out.println("Attribut la force à ton personnage. Attention il doit être en 0 et 100.");
                            choixForce = sc.nextInt();
                            if (choixForce < 0 || choixForce > 100)
                                System.out.println("Attention, tu dois choisir entre 0 et 100.");
                            else
                                joueur2.setForce(choixForce);
                        } while (choixForce < 0 || choixForce > 100);
                        do {
                            System.out.println("Attribut l'agilité à ton personnage. Attention il doit être en 0 et 100.");
                            choixAgilite = sc.nextInt();
                            if (choixAgilite < 0 || choixAgilite > 100)
                                System.out.println("Attention, tu dois choisir entre 0 et 100.");
                            else
                                joueur2.setAgilite(choixAgilite);
                        } while (choixAgilite < 0 || choixAgilite > 100);
                        do {
                            System.out.println("Attribut l'intelligence à ton personnage. Attention il doit être en 0 et 100.");
                            choixIntelligence = sc.nextInt();
                            if (choixIntelligence < 0 || choixIntelligence > 100)
                                System.out.println("Attention, tu dois choisir entre 0 et 100.");
                            else
                                joueur2.setIntelligence(choixIntelligence);
                        } while (choixIntelligence < 0 || choixIntelligence > 100);
                        totalFAI = choixForce + choixAgilite + choixIntelligence;
                    } while (choixNiveau != totalFAI);
                    joueur2.setVie(vie);
                    joueur2.description();
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("\nVous avez choisi de créer un Mage !\n");
                    joueur2 = new Mage();
                    do {
                        do {
                            System.out.println("Attribut un niveau à ton personnage. \nAttention : Il doit être en 1 et 100 et le total de : FORCE + AGILITE + INTELLIGENCE doit être égal au niveau !\n ");
                            choixNiveau = sc.nextInt();
                            if (choixNiveau < 1 || choixNiveau > 100)
                                System.out.println("Attention, tu dois choisir entre 1 et 100.");
                            else
                                joueur2.setNiveau(choixNiveau);
                        } while (choixNiveau < 1 || choixNiveau > 100);
                        do {
                            System.out.println("Attribut la force à ton personnage. Attention il doit être en 0 et 100.");
                            choixForce = sc.nextInt();
                            if (choixForce < 0 || choixForce > 100)
                                System.out.println("Attention, tu dois choisir entre 0 et 100.");
                            else
                                joueur2.setForce(choixForce);
                        } while (choixForce < 0 || choixForce > 100);
                        do {
                            System.out.println("Attribut l'agilité à ton personnage. Attention il doit être en 0 et 100.");
                            choixAgilite = sc.nextInt();
                            if (choixAgilite < 0 || choixAgilite > 100)
                                System.out.println("Attention, tu dois choisir entre 0 et 100.");
                            else
                                joueur2.setAgilite(choixAgilite);
                        } while (choixAgilite < 0 || choixAgilite > 100);
                        do {
                            System.out.println("Attribut l'intelligence à ton personnage. Attention il doit être en 0 et 100.");
                            choixIntelligence = sc.nextInt();
                            if (choixIntelligence < 0 || choixIntelligence > 100)
                                System.out.println("Attention, tu dois choisir entre 0 et 100.");
                            else
                                joueur2.setIntelligence(choixIntelligence);
                        } while (choixIntelligence < 0 || choixIntelligence > 100);
                        totalFAI = choixForce + choixAgilite + choixIntelligence;
                    } while (choixNiveau != totalFAI);
                    joueur2.setVie(vie);
                    joueur2.description();
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("\n-----------------OUCH LE TYPE FEE N'EXISTE PAS ENCORE, RETENTE 1,2 OU 3!-------------------\n");
            }
        } while (type < 1 || type > 3);
    } // Est bonne factoriser : 20-30lignes par fonctions + JAVADOC A FAIRE
    public void bataille() { // Factorisation + JAVADOC A FAIRE
        do {
            System.out.println("\n                              Une nouvelle bataille pour la gloire commence!!!\n");
            int choixAttaque;
            if (joueur1.getVie() > 0) {
                System.out.println("\nJoueur 1 quelle attaque choisis-tu? (Saisis 1 ou 2): \n1- Attaque basique; \n2- Attaque spéciale\n");
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
                System.out.println("\nJoueur 2 quelle attaque choisis-tu? (Saisis 1 ou 2): \n1- Attaque basique; \n2- Attaque spéciale.");
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
            System.out.println("Le Joueur 1 est le super " + joueur1.getClass().getSimpleName() + ". Il a gagné ! \nLe Joueur 2, en mourrant tu fais honte à toute ta classe de " + joueur2.getClass().getSimpleName() + "!!!");
        }else {
            System.out.println("Le Joueur 2 est le super " + joueur2.getClass().getSimpleName() + ". Il a gagné ! \nLe Joueur 1, en mourrant tu fais honte à toute ta classe de " + joueur1.getClass().getSimpleName() + "!!!");
        }
    }
}
