import java.util.Scanner;

public class GestionDesNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre etudiants de la classe : ");
        int nombreEtudiants = scanner.nextInt();

        // tableau pour stocker les notes
        double[] notes = new double[nombreEtudiants];

        // Lire les notes
        for (int i = 0; i < nombreEtudiants; i++) {
            System.out.print("Entrez la note de etudiant " + (i + 1) + " : ");
            notes[i] = scanner.nextDouble();
        }
        double premiereNote = notes[0];
        double derniereNote = notes[nombreEtudiants - 1];
        double somme = 0;
        int nbAuMoinsMoyenne = 0;
        int nbAdmis = 0;
        int nbRecales = 0;
        int nbRattrapage = 0;

        // Calculer la somme des notes
        for (double note : notes) {
            somme += note;
        }

        // Calculer la moyenne
        double moyenne = somme / nombreEtudiants;

        // Calculer le nombre d'étudiants
        for (double note : notes) {
            if (note >= moyenne) {
                nbAuMoinsMoyenne++;
            }
            if (note >= 10) {
                nbAdmis++;
            } else if (note < 7) {
                nbRecales++;
            } else {
                nbRattrapage++;
            }
        }

        // Afficher les statistiques
        System.out.println("Statistiques :");
        System.out.println("1--. La note du premier etudiant : " + premiereNote);
        System.out.println("2--. La note du dernier etudiant : " + derniereNote);
        System.out.println("3--. La moyenne de la classe : " + moyenne);
        System.out.println("4--. Nombre etudiants avec une note >= moyenne : " + nbAuMoinsMoyenne);
        System.out.println("5--. Nombre admis (note >= 10) : " + nbAdmis);
        System.out.println("6--. Nombre de recales (note < 7) : " + nbRecales);
        System.out.println("7--. Nombre etudiants en rattrapage (7 <= note < 10) : " + nbRattrapage);

        scanner.close();
    }
}
