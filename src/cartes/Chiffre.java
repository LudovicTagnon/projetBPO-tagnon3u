package cartes;

public class Chiffre extends Carte{

    private int valeur;

    //============================================================================================

    public Chiffre(Uno u, int v){
        super(u);
        this.valeur = v;
    }

    public Chiffre(Uno u, Couleur c, int v){
        super(u, c);
        this.valeur = v;

    }

    //============================================================================================

    public int getValeur(){
        return this.valeur;
    }

    //============================================================================================

    public boolean peutEtreRecouvertePar(Carte c){
        if(this.estCouleurCompatible(c) || c.estSansCouleur() || c.getValeur() == this.getValeur()){
            return true;
        }
        else{
            return false;
        }
    }

    //============================================================================================

    public boolean peutEtrePoseeSur(Chiffre c){
        if(this.estCouleurCompatible(c) || this.getValeur() == c.getValeur()){
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
        if(this.estCouleurCompatible(c)){
            return true;
        }
        else{
            return false;
        }
    }

}