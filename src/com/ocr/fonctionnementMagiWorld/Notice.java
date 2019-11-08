package com.ocr.fonctionnementMagiWorld;

public class Notice {
    public void Notice() {
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

    }
