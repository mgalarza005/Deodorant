package jdeodorant;

public class MetroAux {
	private int estado;
	protected static final int PARADO = 0;
	protected static final int ARRANCANDO = 1;
	protected static final int EN_MARCHA = 2;
	protected static final int PARANDO = 3;

	public void siguienteEstado(){
		if(estado==PARADO) {
			estado = ARRANCANDO;
		} else if(estado==ARRANCANDO) {
			estado = EN_MARCHA;
		} else if(estado==EN_MARCHA) {
			estado = PARANDO;
		} else if(estado==PARANDO) {
			estado = PARADO;
		} else {
			throw new RuntimeException("Estado desconocido");
		}
	}
	public String visualizarEstado(){
		if(estado==PARADO) {
			return "Parado";
		} else if(estado==ARRANCANDO) {
			return "Arrancando";
		} else if(estado==EN_MARCHA) {
			return "En marcha";
		} else if(estado==PARANDO) {
			return ("Parado");
		} else {
			throw new RuntimeException("Estado desconocido");
		}
	}
	/*
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getEstado(){
		return estado;
	}*/
	public void setEstado(int enMarcha) {
		// TODO Auto-generated method stub

	}
}
