
public class Metro {
	private Estado estado = new Parado();
	protected static final int PARADO = 0;
	protected static final int ARRANCANDO = 1;
	protected static final int EN_MARCHA = 2;
	protected static final int PARANDO = 3;
	protected static final int FINDETRAYECTO = 4;

	public void siguienteEstado() {
		estado.siguienteEstado (this);
	}


	public void setEstado(int estado) {
		switch (estado) {
		case ARRANCANDO:
			this.estado = new Arrancando();
			break;
		case PARANDO:
			this.estado = new Parando();
			break;
		case EN_MARCHA:
			this.estado = new EnMarcha();
			break;
		case PARADO:
			this.estado = new Parado();
			break;
		case FINDETRAYECTO:
			this.estado = new FinDeTrayecto();
			break;
		
		default:
			this.estado = null;
			break;
		}
	}
	public void visualizarEstado(){
		estado.cualEsElEstado(this);
	}

	public int getEstado(){
		return estado.miEstado();
	}
}
