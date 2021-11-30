package cartes;

import java.lang.management.ThreadInfo;
import java.util.ArrayList;
import java.util.Random;

import cartes.Carte;

public class PaquetDeCartes{

    private ArrayList<Carte> cartes;

    //============================================================================================

    public PaquetDeCartes(){
        this.cartes = new ArrayList<>();
    }

    //============================================================================================

    public int getNombreDeCartes(){
        return this.cartes.size();
    }

    public boolean estVide(){
        return this.getNombreDeCartes() == 0;
    }

    public int getValeur(){
        int res = 0;
        for (int i = 0; i < cartes.size(); i++){
            res += cartes.get(i).getValeur();
        }
        return res;
    }

    public String toString(){
        return "Valeur de carte : " + this.getValeur() + "\n";
    }

    public Carte getSommet(){
            return this.cartes.get(this.cartes.size()-1);
    }

    public Carte piocher(){
        Carte carte = this.getSommet();
        this.enlever(carte);
        return carte;
    }

    //============================================================================================

    public void ajouter(Carte...cartes){
        for (int i = 0; i < cartes.length; i++) {
            this.cartes.add(cartes[i]);
        }
    }

    public void ajouter(PaquetDeCartes pdc){
        while(pdc.getNombreDeCartes() > 0){
            this.cartes.add(pdc.getSommet());
            pdc.enlever(pdc.getSommet());
        }
    }

    public void enlever(Carte carte){
        for (int i = 0; i < this.cartes.size(); i++) {
            if((this.cartes.get(i).getValeur() == carte.getValeur()) && (this.cartes.get(i).getCouleur() == carte.getCouleur())){
                this.cartes.remove(i);
                break;
            }
        }
    }

    public void melanger(){
        Random g = new Random();
        ArrayList<Carte> res = new ArrayList<>();
        int pos;

        while(this.cartes.size() > 0){
            pos = g.nextInt(this.cartes.size());
            res.add(this.cartes.get(pos));
            this.cartes.remove(pos);
        }
        this.cartes = res;
    }

    public void retourner(){
        ArrayList<Carte> res = new ArrayList<>();

        while(this.getNombreDeCartes() > 0){
            res.add(this.getSommet());
            this.piocher();
        }
        this.cartes = res;
    }


}