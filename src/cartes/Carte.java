package cartes;

public abstract class Carte {

    private Uno u;
    private Couleur couleur ;

    //============================================================================================

    public Carte(Uno u){
        this.u = u;
    }

    public Carte(Uno u, Couleur couleur) {
        this.couleur = couleur;
        this.u = u;
    }

    //============================================================================================

    public void setCouleur(Couleur couleur) {
        assert(couleur != null):"Couleur est nulle\n";
        this.couleur = couleur;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    //============================================================================================

    public boolean estSansCouleur(){
        if(this.couleur == null){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean estCouleurCompatible(Carte c){
        if(c.getCouleur() == this.getCouleur()){
            return true;
        }else{
            return false;
        }
    }

    //============================================================================================

    public abstract int getValeur();

    public abstract boolean peutEtreRecouvertePar(Carte c);

    public abstract boolean peutEtrePoseeSur(Chiffre c);

    public abstract boolean peutEtrePoseeSur(Plus2 c);

    public abstract boolean peutEtrePoseeSur(Plus4 c);

    public abstract boolean peutEtrePoseeSur(Joker c);

    public abstract boolean peutEtrePoseeSur(PasseTonTour c);

    public abstract boolean peutEtrePoseeSur(ChangementDeSens c);
}