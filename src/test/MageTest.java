package test;
import com.ocr.personnagesMagiWorld.Mage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MageTest{
	Mage m1 = new Mage(10, 0, 10, 0);
	Mage m2 = new Mage(100, 25, 50, 25);
	@Test
	void testMageAttaqueBasique(){
		m1.attaqueBasique(m2);
		assertEquals(490, m2.getVie());
	}
	@Test
	void testMageAttaqueSpeciale(){
		m1.attaqueSpeciale(m1);
		assertEquals(70, m1.getVie());
	}
}