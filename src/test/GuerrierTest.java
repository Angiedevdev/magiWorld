package test;
import com.ocr.personnagesMagiWorld.Guerrier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class GuerrierTest{

	Guerrier g1 = new Guerrier(10, 10, 0, 0);
	Guerrier g2 = new Guerrier(100, 50, 25, 25);
	@Test
	void testGuerrierAttaqueBasiqueDescriptionEstEgaleCalcul(){
		g1.attaqueBasique(g2);
		assertEquals(490, g2.getVie()); //
	}
	@Test
	void testGuerrierAttaqueSpeciale(){
		g1.attaqueSpeciale(g2);
		assertEquals(400, g2.getVie());
		assertEquals(25, g1.getForce());
	}
}