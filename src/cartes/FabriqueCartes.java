package cartes;

import cartes.Carte;

public class FabriqueCartes{

    private PaquetDeCartes Pc;

    private static FabriqueCartes instance = new FabriqueCartes();

    //============================================================================================

    public static FabriqueCartes getInstance(){
        return instance;
    }

    //============================================================================================

    private FabriqueCartes(){
        this.Pc = new PaquetDeCartes();
    }

    public PaquetDeCartes PaquetVide(){
        return this.Pc = new PaquetDeCartes();
    }

    public PaquetDeCartes UneCartesParCouleur() {
        this.Pc.ajouter(new Chiffre(new Uno(), Couleur.JAUNE, 1), new Chiffre(new Uno(), Couleur.VERT, 1),new Chiffre(new Uno(), Couleur.BLEU, 1), new Chiffre(new Uno(), Couleur.ROUGE, 1));
        return Pc;
    }

    public PaquetDeCartes ToutesCartesBleu() {
        this.Pc.ajouter(new ChangementDeSens(new Uno(), Couleur.BLEU), new ChangementDeSens(new Uno(), Couleur.BLEU));
        this.Pc.ajouter(new Plus2(new Uno(), Couleur.BLEU), new Plus2(new Uno(), Couleur.BLEU));
        this.Pc.ajouter(new PasseTonTour(new Uno(), Couleur.BLEU), new PasseTonTour(new Uno(), Couleur.BLEU));

        this.Pc.ajouter(new Chiffre(new Uno(), Couleur.BLEU, 0));

        for(int k = 0; k < 2; k++){
            for (int j = 1; j < 10; j ++){
                this.Pc.ajouter(new Chiffre(new Uno(), Couleur.BLEU, j));
            }
        }

        return Pc;
    }

    public PaquetDeCartes JeuComplet(){
        this.Pc.ajouter(new Joker(new Uno()), new Joker(new Uno()), new Joker(new Uno()), new Joker(new Uno()));

        this.Pc.ajouter(new Plus4(new Uno()), new Plus4(new Uno()), new Plus4(new Uno()), new Plus4(new Uno()));

        this.Pc.ajouter(new ChangementDeSens(new Uno(), Couleur.BLEU), new ChangementDeSens(new Uno(), Couleur.BLEU));
        this.Pc.ajouter(new ChangementDeSens(new Uno(), Couleur.JAUNE), new ChangementDeSens(new Uno(), Couleur.JAUNE));
        this.Pc.ajouter(new ChangementDeSens(new Uno(), Couleur.ROUGE), new ChangementDeSens(new Uno(), Couleur.ROUGE));
        this.Pc.ajouter(new ChangementDeSens(new Uno(), Couleur.VERT), new ChangementDeSens(new Uno(), Couleur.VERT));

        this.Pc.ajouter(new Plus2(new Uno(), Couleur.BLEU), new Plus2(new Uno(), Couleur.BLEU));
        this.Pc.ajouter(new Plus2(new Uno(), Couleur.JAUNE), new Plus2(new Uno(), Couleur.JAUNE));
        this.Pc.ajouter(new Plus2(new Uno(), Couleur.ROUGE), new Plus2(new Uno(), Couleur.ROUGE));
        this.Pc.ajouter(new Plus2(new Uno(), Couleur.VERT), new Plus2(new Uno(), Couleur.VERT));

        this.Pc.ajouter(new PasseTonTour(new Uno(), Couleur.BLEU), new PasseTonTour(new Uno(), Couleur.BLEU));
        this.Pc.ajouter(new PasseTonTour(new Uno(), Couleur.JAUNE), new PasseTonTour(new Uno(), Couleur.JAUNE));
        this.Pc.ajouter(new PasseTonTour(new Uno(), Couleur.ROUGE), new PasseTonTour(new Uno(), Couleur.ROUGE));
        this.Pc.ajouter(new PasseTonTour(new Uno(), Couleur.VERT), new PasseTonTour(new Uno(), Couleur.VERT));

        this.Pc.ajouter(new Chiffre(new Uno(), Couleur.BLEU, 0), new Chiffre(new Uno(), Couleur.JAUNE, 0), new Chiffre(new Uno(), Couleur.VERT, 0), new Chiffre(new Uno(), Couleur.ROUGE, 0));

        for (int i = 0; i < 4; i++){
            Couleur couleur;
            if(i == 0){
                couleur = Couleur.BLEU;
            } else if(i == 1){
                couleur = Couleur.JAUNE;
            }else if(i == 2){
                couleur = Couleur.ROUGE;
            }else{
                couleur = Couleur.VERT;
            }
            for(int k = 0; k < 2; k++){
                for (int j = 1; j < 10; j ++){
                    this.Pc.ajouter(new Chiffre(new Uno(), couleur, j));
                }
            }
        }

        return Pc;
    }
}