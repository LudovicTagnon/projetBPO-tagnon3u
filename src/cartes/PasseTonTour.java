package cartes;

public class PasseTonTour extends Carte{

    public PasseTonTour(Uno u){
        super(u);
    }

    public PasseTonTour(Uno u, Couleur c){
        super(u, c);
    }

    //============================================================================================

    public int getValeur(){
        return 20;
    }

    public boolean peutEtreRecouvertePar(Carte c){
        if(this.estCouleurCompatible(c) || c.estSansCouleur()){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean peutEtrePoseeSur(Chiffre c){
        if(this.estCouleurCompatible(c)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean peutEtrePoseeSur(Plus2 c){
        if(this.estCouleurCompatible(c)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean peutEtrePoseeSur(Plus4 c){
        if(this.estCouleurCompatible(c)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean peutEtrePoseeSur(Joker c){
        if(this.estCouleurCompatible(c)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean peutEtrePoseeSur(PasseTonTour c){
        return true;
    }

    public boolean peutEtrePoseeSur(ChangementDeSens c){
        if(this.estCouleurCompatible(c)){
            return true;
        }
        else{
            return false;
        }
    }
}