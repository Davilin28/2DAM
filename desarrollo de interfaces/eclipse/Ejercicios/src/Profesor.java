
public class Profesor extends Persona {

	protected int numAsig;
	protected boolean tutor;

	public Profesor(String dni, String nombre, String apellidos, double salario, int numAsig, boolean tutor) {
		super(dni, nombre, apellidos, salario);
		this.numAsig = numAsig;
		this.tutor = tutor;
	}

	protected int getNumAsig() {
		return numAsig;
	}

	protected void setNumAsig(int numAsig) {
		this.numAsig = numAsig;
	}

	protected boolean isTutor() {
		return tutor;
	}

	protected void setTutor(boolean tutor) {
		this.tutor = tutor;
	}

	@Override
	public String toString() {
		return "Profesor [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario
				+ ", numAsig=" + numAsig + ", tutor=" + tutor + "]";
	}
	
}
