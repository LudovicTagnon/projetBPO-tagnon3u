package cartes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangementDeSensTest {

    ChangementDeSens j;

    @BeforeEach
    void setUp(){
        j = new ChangementDeSens(new Uno(), Couleur.BLEU);
    }

    @Test
    void getValeur() {
        assertEquals(j.getValeur(), 20, "Valeur est fausse\n");
    }

    @Test
    void peutEtreRecouvertePar() {
        assertTrue(j.peutEtreRecouvertePar(new Chiffre(new Uno(), Couleur.BLEU, 8)));
        assertFalse(j.peutEtreRecouvertePar(new Chiffre(new Uno(), Couleur.ROUGE, 5)));
    }

    @Test
    void peutEtrePoseeSur() {
        assertTrue(j.peutEtrePoseeSur(new Chiffre(new Uno(), Couleur.BLEU, 8)));
        assertFalse(j.peutEtrePoseeSur(new Chiffre(new Uno(), Couleur.JAUNE, 5)));
    }

    @Test
    void testPeutEtrePoseeSur() {
        assertTrue(j.peutEtrePoseeSur(new Plus2(new Uno(), Couleur.BLEU)));
        assertFalse(j.peutEtrePoseeSur(new Plus2(new Uno(), Couleur.JAUNE)));
    }

    @Test
    void testPeutEtrePoseeSur1() {
        assertTrue(j.peutEtrePoseeSur(new Plus4(new Uno(), Couleur.BLEU)));
        assertFalse(j.peutEtrePoseeSur(new Plus4(new Uno(), Couleur.JAUNE)));
    }

    @Test
    void testPeutEtrePoseeSur2() {
        assertTrue(j.peutEtrePoseeSur(new Joker(new Uno(), Couleur.BLEU)));
        assertFalse(j.peutEtrePoseeSur(new Joker(new Uno(), Couleur.JAUNE)));
    }

    @Test
    void testPeutEtrePoseeSur3() {
        assertTrue(j.peutEtrePoseeSur(new PasseTonTour(new Uno(), Couleur.BLEU)));
        assertFalse(j.peutEtrePoseeSur(new PasseTonTour(new Uno(), Couleur.JAUNE)));
    }

    @Test
    void testPeutEtrePoseeSur4() {
        assertTrue(j.peutEtrePoseeSur(new ChangementDeSens(new Uno(), Couleur.BLEU)));
        assertTrue(j.peutEtrePoseeSur(new ChangementDeSens(new Uno(), Couleur.JAUNE)));
    }
}