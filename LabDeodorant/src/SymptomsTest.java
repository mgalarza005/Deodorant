import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SymptomsTest {
	Symptoms s= new Symptoms();
	
	@Test
	void testProbabilityCovidFiebre() {
		assertEquals(s.getProbabilityCovid19(0), 90);
	}
	
	@Test
	void testProbabilityCovidTos() {
		assertEquals(s.getProbabilityCovid19(1), 80);
	}

	@Test
	void testProbabilityCovidAstenia() {
		assertEquals(s.getProbabilityCovid19(2), 70);
	}

	@Test
	void testProbabilityCovidExpectoracion() {
		assertEquals(s.getProbabilityCovid19(3), 60);
	}

	@Test
	void testProbabilityCovid() {
		assertNotEquals(s.getProbabilityCovid19(5), 90);
	}

}
