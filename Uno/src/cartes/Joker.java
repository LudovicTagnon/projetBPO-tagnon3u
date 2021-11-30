package cartes;

public class Joker extends Carte{

    public Joker(Uno u){
        super(u);
    }

    public Joker(Uno u, Couleur c){
        super(u, c);
    }

    //============================================================================================

    public int getValeur(){
        return 50;
    }

    public boolean peutEtreRecouvertePar(Carte c){
        if(this.estCouleurCompatible(c)) {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean peutEtrePoseeSur(Chiffre c){
        return true;
    }

    public boolean peutEtrePoseeSur(Plus2 c){
        return true;
    }

    public boolean peutEtrePoseeSur(Plus4 c){
        return true;
    }

    public boolean peutEtrePoseeSur(Joker c){
        return true;
    }

    public boolean peutEtrePoseeSur(PasseTonTour c){
        return true;
    }

    public boolean peutEtrePoseeSur(ChangementDeSens c){
        return true;
    }
}