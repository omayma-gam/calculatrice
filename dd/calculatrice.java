package com.company;

import java.util.Scanner;

   public class calculatrice {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        //aaa
        int choix = 0;

        while (choix != 8) {
            System.out.println("- Menu -");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Puissance");
            System.out.println("6. Racine carrée");
            System.out.println("7. Factorielle");
            System.out.println("8. Quitter");

            System.out.print("Choisir une fonction : ");

            choix = k.nextInt();

            if (choix == 8) {
                System.out.println("Merci d'avoir utilisé la calculatrice.");
                break;
            }

            System.out.print("Donner le nombre A: ");
            int N1 = k.nextInt();
            int N2 = 0;

            if (choix != 6 && choix != 7) {
                System.out.print("Donner le nombre B: ");
                N2 = k.nextInt();
            }

            switch (choix) {
                case 1:
                    addition(N1, N2);
                    break;
                case 2:
                    soustraction(N1, N2);
                    break;
                case 3:
                    multiplication(N1, N2);
                    break;
                case 4:
                    if (N2 != 0) {
                        division(N1, N2);
                    } else {
                        System.out.println("Erreur : Division par zéro !");
                    }
                    break;
                case 5:
                    puissance(N1, N2);
                    break;
                case 6:
                    racineCarree(N1);
                    break;
                case 7:
                    factorielle(N1);
                    break;
                default:
                    System.out.println(" Option non valide.");
            }
        }

        k.close();
    }

    public static void addition(int a, int b) {
        System.out.println("La somme des deux nombres est : " + (a + b));
    }

    public static void soustraction(int a, int b) {
        System.out.println("La soustraction des deux nombres est : " + (a - b));
    }

    public static void multiplication(int a, int b) {
        System.out.println("La multiplication des deux nombres est : " + (a * b));
    }

    public static void division(double a, double b) {
        System.out.println("La division des deux nombres est : " + (a / b));
    }

    public static void puissance(int a, int b) {
        System.out.println("Le nombre " + a + " à la puissance " + b + " est : " + Math.pow(a, b));
    }

    public static void racineCarree(double a) {
        System.out.println("La racine carrée de " + a + " est : " + Math.sqrt(a));
    }

    public static void factorielle(int a) {
        System.out.println("La factorielle de " + a + " est : " + calculerFactorielle(a));
    }

    public static long calculerFactorielle(int n) {
        if (n < 0) {
            System.out.println("Erreur : La factorielle n'est pas définie pour les nombres négatifs.");
            return -1;
        } else if (n == 0) {
            return 1;
        } else {
            long resultat = 1;
            for (int i = 1; i <= n; i++) {
                resultat = resultat * i;
            }
            return resultat;
        }
    }
}
