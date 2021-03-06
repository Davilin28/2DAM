
public class Directivo extends Profesor {

	protected boolean salesiano;
	protected char Horario;

	public Directivo(String dni, String nombre, String apellidos, double salario, int numAsig, boolean tutor,
			boolean salesiano, char horario) {
		super(dni, nombre, apellidos, salario, numAsig, tutor);
		this.salesiano = salesiano;
		Horario = horario;
	}

	protected boolean isSalesiano() {
		return salesiano;
	}

	protected void setSalesiano(boolean salesiano) {
		this.salesiano = salesiano;
	}

	protected char getHorario() {
		return Horario;
	}

	protected void setHorario(char horario) {
		Horario = horario;
	}

	@Override
	public String toString() {
		return "Directivo [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario
				+ ", tutor=" + tutor + ", numAsig=" + numAsig + ", salesiano=" + salesiano + ", Horario=" + Horario
				+ "]";
	}
}
