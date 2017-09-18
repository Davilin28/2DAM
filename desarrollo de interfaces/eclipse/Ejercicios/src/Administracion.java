
public class Administracion extends Persona {

	protected char genero;
	protected int extras;

	public Administracion(String dni, String nombre, String apellidos, double salario, char genero, int extras) {
		super(dni, nombre, apellidos, salario);
		this.genero = genero;
		this.extras = extras;
	}

	protected char getGenero() {
		return genero;
	}

	protected void setGenero(char genero) {
		this.genero = genero;
	}

	protected int getExtras() {
		return extras;
	}

	protected void setExtras(int extras) {
		this.extras = extras;
	}

	@Override
	public String toString() {
		return "Administracion [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario
				+ ", genero=" + genero + ", extras=" + extras + "]";
	}
}
