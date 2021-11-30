package cartes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CouleurTest {

    Couleur couleur;

    @BeforeEach
    void setUp(){
        couleur = Couleur.BLEU;
    }

    @Test
    void getNom() {
        assertEquals(couleur.getNom(), "Bleu\n");
    }

    @Test
    void testToString() {
        assertEquals(couleur.toString(), "Bleu\n");
    }
}