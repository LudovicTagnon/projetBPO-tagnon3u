package cartes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaquetDeCartesTest {

    PaquetDeCartes Pc;
    FabriqueCartes Fc;

    @BeforeEach
    void setUp() {
        Fc = FabriqueCartes.getInstance();
        Pc = Fc.PaquetVide();
        Pc = Fc.JeuComplet();
    }

    @Test
    void getNombreDeCartes() {
        assertEquals(Pc.getNombreDeCartes(), 108, "Le Nombre de Cartes est different\n");
    }

    @Test
    void estVide() {
        assertFalse(Pc.estVide(), "Le paquet de cartes est vide\n");
    }

    @Test
    void getValeur() {
        assertEquals(Pc.getValeur(), 1240, "Valeur est differente\n");
    }

    @Test
    void testToString() {
        assertEquals(Pc.toString(), "Valeur : 1240", "Erreur dans toString()\n");
    }

    @Test
    void ajouter() {
        Pc.ajouter(new Plus4(new Uno(), Couleur.BLEU));
        assertEquals(Pc.getNombreDeCartes(), 109, "Erreur dans ajouter()\n");
    }

    @Test
    void testAjouter() {
        PaquetDeCartes Pc1 = new PaquetDeCartes();
        Pc1.ajouter(new Chiffre(new Uno(), Couleur.BLEU, 8), new Plus4(new Uno()), new Joker(new Uno()), new Plus2(new Uno(), Couleur.BLEU));
        Pc.ajouter(Pc1);
        assertEquals(Pc.getNombreDeCartes(), 112, "Erreur dans ajouter()\n");
    }

    @Test
    void enlever() {
        Pc.enlever(new Chiffre(new Uno(), Couleur.BLEU, 4));
        assertEquals(Pc.getNombreDeCartes(), 107);
    }
}