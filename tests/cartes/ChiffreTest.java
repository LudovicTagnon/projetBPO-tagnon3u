package cartes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChiffreTest {

    Chiffre j;

    @BeforeEach
    void setUp(){
        j = new Chiffre(new Uno(), Couleur.BLEU, 8);
    }

    @Test
    void getValeur() {
        assertEquals(j.getValeur(), 8);
    }

    @Test
    void peutEtreRecouvertePar() {
        assertTrue(j.peutEtreRecouvertePar(new Chiffre(new Uno(), Couleur.BLEU, 5)));
        assertTrue(j.peutEtreRecouvertePar(new Chiffre(new Uno(), Couleur.ROUGE, 8)));
        assertTrue(j.peutEtreRecouvertePar(new Plus4(new Uno())));
        assertFalse(j.peutEtreRecouvertePar(new Chiffre(new Uno(), Couleur.ROUGE, 5)));
    }

    @Test
    void peutEtrePoseeSur() {
        assertTrue(j.peutEtrePoseeSur(new Chiffre(new Uno(), Couleur.BLEU, 5)));
        assertTrue(j.peutEtrePoseeSur(new Chiffre(new Uno(), Couleur.ROUGE, 8)));
        assertFalse(j.peutEtrePoseeSur(new Chiffre(new Uno(), Couleur.ROUGE, 5)));
    }

    @Test
    void testPeutEtrePoseeSur() {
        assertTrue(j.peutEtrePoseeSur(new Plus2(new Uno(), Couleur.BLEU)));
        assertFalse(j.peutEtrePoseeSur(new Plus2(new Uno(), Couleur.ROUGE)));
    }

    @Test
    void testPeutEtrePoseeSur1() {
        assertTrue(j.peutEtrePoseeSur(new Plus4(new Uno(), Couleur.BLEU)));
        assertFalse(j.peutEtrePoseeSur(new Plus4(new Uno(), Couleur.ROUGE)));
    }

    @Test
    void testPeutEtrePoseeSur2() {
        assertTrue(j.peutEtrePoseeSur(new Joker(new Uno(), Couleur.BLEU)));
        assertFalse(j.peutEtrePoseeSur(new Joker(new Uno(), Couleur.ROUGE)));
    }

    @Test
    void testPeutEtrePoseeSur3() {
        assertTrue(j.peutEtrePoseeSur(new PasseTonTour(new Uno(), Couleur.BLEU)));
        assertFalse(j.peutEtrePoseeSur(new PasseTonTour(new Uno(), Couleur.ROUGE)));
    }

    @Test
    void testPeutEtrePoseeSur4() {
        assertTrue(j.peutEtrePoseeSur(new ChangementDeSens(new Uno(), Couleur.BLEU)));
        assertFalse(j.peutEtrePoseeSur(new ChangementDeSens(new Uno(), Couleur.ROUGE)));
    }
}