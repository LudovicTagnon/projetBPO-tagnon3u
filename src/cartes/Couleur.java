package cartes;

public enum Couleur{
    JAUNE("Jaune"),
    VERT("Vert"),
    BLEU("Bleu"),
    ROUGE("Rouge");

    private String nom;

    //============================================================================================

    private Couleur(String nom){
        assert(nom != null):"Le nom est nul\n";

        this.nom = nom;
    }

    //============================================================================================

    public String getNom(){
        return this.nom;
    }

    public String toString(){
        return this.nom;
    }

}