
public class Parando extends Estado{

	@Override
	public int miEstado() {
		// TODO Auto-generated method stub
		return Metro.PARANDO;
	}

	@Override
	public void siguienteEstado(Metro metro) {
		metro.setEstado(Metro.PARADO);
		
	}

	@Override
	public String cualEsElEstado(Metro metro) {
		// TODO Auto-generated method stub
		return "Parando";
	}

}
