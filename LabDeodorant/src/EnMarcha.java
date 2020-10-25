
public class EnMarcha extends Estado {

	@Override
	public int miEstado() {
		// TODO Auto-generated method stub
		return Metro.EN_MARCHA;
	}

	@Override
	public void siguienteEstado(Metro metro) {
		metro.setEstado(Metro.PARANDO);
		
	}

	@Override
	public String cualEsElEstado(Metro metro) {
		// TODO Auto-generated method stub
		return "En marcha";
	}

}
