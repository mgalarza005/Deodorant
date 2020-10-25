


import junit.framework.TestCase;

public class MetroTest extends TestCase {
	Metro m;
	public void setUp(){
		m=new Metro();
	}
	public void testEstadoParado() {
		int esperado=0;
		assertTrue(m.getEstado()==esperado);
	}
	public void testEstadoArrancando() {
		int esperado=1;
		m.siguienteEstado();
		assertTrue(m.getEstado()==esperado);
	}
	public void testEstadoEnMarcha() {
		int esperado=2;
		m.siguienteEstado();
		m.siguienteEstado();
		assertTrue(m.getEstado()==esperado);
	}
	public void testEstadoParando() {
		int esperado=3;
		m.siguienteEstado();
		m.siguienteEstado();
		m.siguienteEstado();
		System.out.println(m.getEstado());
		assertTrue(m.getEstado()==esperado);
	}
	public void testEstadoParadoFinal() {
		int esperado=3;
		m.siguienteEstado();
		m.siguienteEstado();
		m.siguienteEstado();
		
		assertTrue(m.getEstado()==esperado);
	}
	public void testEstadoFindDeTrayecto() {
		int esperado=0;
		m.siguienteEstado();
		m.siguienteEstado();
		m.siguienteEstado();
		m.siguienteEstado();
		System.out.println(m.getEstado());
		assertTrue(m.getEstado()==esperado);
	}
}