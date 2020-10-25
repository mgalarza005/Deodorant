
public class Parado extends Estado{
	
	@Override
	public int miEstado() {
		// TODO Auto-generated method stub
		return Metro.PARADO;
	}
	public void siguienteEstado(Metro metro) {
		metro.setEstado(Metro.ARRANCANDO);
		}
	@Override
	public String cualEsElEstado(Metro metro) {
		// TODO Auto-generated method stub
		return "Parado";
	}

}
