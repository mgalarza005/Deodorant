
public class Arrancando extends Estado {

	@Override
	public int miEstado() {
		// TODO Auto-generated method stub
		return Metro.ARRANCANDO;
	}

	public void siguienteEstado(Metro metro) {
		metro.setEstado(Metro.EN_MARCHA);
	}

	@Override
	public String cualEsElEstado(Metro metro) {
		// TODO Auto-generated method stub
		return "Arrancando";
	}
		
}
