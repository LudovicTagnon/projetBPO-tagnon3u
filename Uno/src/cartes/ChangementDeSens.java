package cartes;

public class ChangementDeSens extends Carte{

    public ChangementDeSens(Uno u){
        super(u);
    }

    public ChangementDeSens(Uno u, Couleur c){
        super(u, c);
    }

    //============================================================================================

    public int getValeur(){
        return 20;
    }

    public boolean peutEtreRecouvertePar(Carte c){
        if(this.estCouleurCompatible(c) || c.estSansCouleur()){
            return true;
        }else{
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
        if(this.estCouleurCompatible(c)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean peutEtrePoseeSur(ChangementDeSens c){
        return true;
    }
}