package test;
import com.ocr.personnagesMagiWorld.Rodeur;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class RodeurTest{
	Rodeur r1 = new Rodeur(10, 0, 0, 10);
	Rodeur r2 = new Rodeur(100, 25, 25, 50);
	@Test
	void testRodeurAttaqueBasique(){
		r1.attaqueBasique(r2);
		assertEquals(490, r2.getVie());
	}
	@Test
	void testRodeurAttaqueSpeciale(){
		r1.attaqueSpeciale(r1);
		assertEquals(15, r1.getAgilite());
	}
}