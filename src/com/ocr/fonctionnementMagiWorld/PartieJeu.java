package com.ocr.fonctionnementMagiWorld;

import com.ocr.personnagesMagiWorld.Guerrier;
import com.ocr.personnagesMagiWorld.Mage;
import com.ocr.personnagesMagiWorld.Personnages;
import com.ocr.personnagesMagiWorld.Rodeur;

import java.util.Scanner;

public class PartieJeu {
    private int type, choixNiveau, choixForce, choixAgilite, choixIntelligence, totalFAI;
    private Personnages joueur1, joueur2;
    private int choixAttaque;
    public PartieJeu() {
        notice();
        creationJoueurs();
        bataille();
    }

    public void notice() {
        System.out.println("Bienvenus sur MagiWorld !!!" + "\nJeux de stratégie Old-Old-Old-School" + "\nBatailles épiques en un contre un - Le joueur gagnant est le dernier à conserver ses points." + "\nJeu accessible aux plus jeunes !!!");
        System.out.println("_______________________________________________________________________________________________\n");
        System.out.println("Notice de création d'un personnage :");
        System.out.println("_______________________________________________________________________________________________");
        System.out.println("\nEtape 1: Pour choisir la classe de ton personnage tape 1, 2 ou 3 en fonction de la liste.");
        System.out.println("         Chaque classe à accès à deux attaques spécifiques (Spéciale ou Basique).");
        System.out.println("\nGuerrier : Attaque Basique - Coup d’Épée : Effectue des dommages égaux à la force du joueur sur l’adversaire.\n           Attaque Spéciale - Coup de Rage : Effectue des dommages égaux à la force du joueur fois deux sur l’adversaire. Le joueur lançant l'attaque perd de la vitalité : la valeur de sa force divisée par 2.");
        System.out.println("\nRôdeur : Attaque Basique - Tir à l’Arc : Effectue des dommages égaux à l’agilité du joueur sur l’adversaire.\n         Attaque Spéciale - Concentration : Le joueur gagne son niveau divisé par 2 en agilité.");
        System.out.println("\nMage : Attaque Basique - Boule de Feu : Effectue des dommages égaux à l’intelligence du joueur sur l’adversaire. \n       Attaque Spéciale - Soin : Le joueur soigne sa vie et regagne sa quantité d’intelligence fois 2 en points de vie. Attention, il ne peut pas avoir plus de vie qu’il n’en avait au départ.");
        System.out.println("\nNote : Ta vie est automatiquement determinée en fonction des choix de paramètre que tu feras!!");
        System.out.println("\nEtape 2: Tu dois choisir le niveau de ton personnage. Pour cela tape sur ton clavier numérique un chiffre entre 1 et 100;");
        System.out.println("Etape 3: Tu dois choisir la force de ton personnage. Pour cela tape sur ton clavier numérique un chiffre entre 0 et 100;");
        System.out.println("Etape 4: Tu dois choisir l'intelligence de ton personnage. Pour cela tape sur ton clavier numérique un chiffre entre 0 et 100;");
        System.out.println("Etape 5: Tu dois choisir l'agilité de ton personnage. Pour cela tape sur ton clavier numérique un chiffre entre 0 et 100.");
        System.out.println("\nNote : ATTENTION ==> La somme de la force, l'intelligence, et l'agilité de ton personnage ne peuvent pas être supérieurs à son niveau. \n       Tu peux choisir 0 pour certains paramètres si ce n'est pas utile pour ton personnage. Pour savoir si c'est utile, regarde dans les attaques.");
        System.out.println("\nEx. : Tu as choisis la configuration suivante : Niveau 50, Force 18, Intelligence 40, Agilité 2. Le total étant supérieur à 50 (18+40+2=60), le programme te demandera de recommencer");
        System.out.println("_______________________________________________________________________________________________");
    }
    Scanner sc = new Scanner(System.in);
    public void creationJoueurs() {//Creation joueur 1 et creation joueur 2
        System.out.println("Joueur 1, entre dans l'arène et créer ton personnage ! \nQue souhaites-tu devenir ?(saisis 1,2 ou 3) : \n1- Un guerrier; \n2- Un rôdeur; \n3- Un mage.");
        type = sc.nextInt();
        switch (type) {
            case 1 :
                System.out.println("Vous avez choisi de créer un guerrier !");
                joueur1 = new Guerrier();
                do {
                    do {
                        System.out.println("Attribut un niveau à ton personnage. Attention il doit être en 1 et 100.");
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
                break;
            case 2 :
                System.out.println("Vous avez choisi de créer un rôdeur !");
                joueur1 = new Rodeur();
                do {
                    do {
                        System.out.println("Attribut un niveau à ton personnage. Attention il doit être en 1 et 100.");
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
                break;
            case 3 :
                System.out.println("Vous avez choisi de créer un mage !");
                joueur1 = new Mage();
                do {
                    do {
                        System.out.println("Attribut un niveau à ton personnage. Attention il doit être en 1 et 100.");
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
                        if (choixIntelligence <= 1 || choixIntelligence >=100)
                            System.out.println("Attention, tu dois choisir entre 0 et 100.");
                        else
                            joueur1.setIntelligence(choixIntelligence);
                    } while (choixIntelligence < 0 || choixIntelligence > 100);
                    totalFAI = choixForce + choixAgilite + choixIntelligence;
                } while (choixNiveau != totalFAI);
            default:
                System.out.println("Ouch, le type fée n'existe pas, retente 1,2 ou 3!");
        }
        System.out.println("Joueur 2, entre dans l'arène et créer ton personnage ! \nQue souhaites-tu devenir ?(saisis 1,2 ou 3) : \n1- Un guerrier; \n2- Un rôdeur; \n3- Un mage.");
        type = sc.nextInt();
        switch (type) {
            case 1 :
                System.out.println("Vous avez choisi de créer un guerrier !");
                joueur2 = new Guerrier();
                do {
                    do {
                        System.out.println("Attribut un niveau à ton personnage. Attention il doit être en 1 et 100.");
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
                break;
            case 2 :
                System.out.println("Vous avez choisi de créer un rôdeur !");
                joueur2 = new Rodeur();
                do {
                    do {
                        System.out.println("Attribut un niveau à ton personnage. Attention il doit être en 1 et 100.");
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
                break;
            case 3 :
                System.out.println("Vous avez choisi de créer un mage !");
                joueur2 = new Mage();
                do {
                    do {
                        System.out.println("Attribut un niveau à ton personnage. Attention il doit être en 1 et 100.");
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
            default:
                System.out.println("Ouch, le type fée n'existe pas, retente 1,2 ou 3!");
        }
    } //20-30lignes par fonctions

    public void bataille() {
        do {
            System.out.println("Joueur 1 quelle attaque choisis-tu? (Saisis 1 ou 2) \n1- Attaque basique; \n2- Attaque spéciale.");
            choixAttaque = sc.nextInt();
            switch (choixAttaque){
                case 1 :
                    joueur1.attaqueBasique(joueur2);
                    if (joueur2.getVie() <= 0)
                        System.out.println("Le Joueur 2 est mort. \nLe Joueur 1 à gagné!!");
                    break;
                case 2 :
                    joueur1.attaqueSpeciale(joueur2);
                    if (joueur2.getVie() <= 0)
                        System.out.println("Le Joueur 2 est mort. \nLe Joueur 1 à gagné!!");
                    break;
                default :
                    System.out.println("Tu ne peux pas lancer de paillettes!!");
                    break;
            }
            System.out.println("Joueur 1 quelle attaque choisis-tu? (Saisis 1 ou 2) \n1- Attaque basique; \n2- Attaque spéciale.");
            choixAttaque = sc.nextInt();
            switch (choixAttaque){
                case 1 :
                    joueur2.attaqueBasique(joueur1);
                    if (joueur1.getVie() <= 0)
                        System.out.println("Le Joueur 1 est mort. \nLe Joueur 2 à gagné!!");
                    break;
                case 2 :
                    joueur2.attaqueSpeciale(joueur1);
                    if (joueur1.getVie() <= 0)
                    System.out.println("Le Joueur 1 est mort. \nLe Joueur 2 à gagné!!");
                    break;
                default :
                    System.out.println("Tu ne peux pas lancer de paillettes!!");
            }
        }while (joueur1.getVie() > 0 && joueur2.getVie() > 0);
    }
}
