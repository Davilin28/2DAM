
public class Fecha {

	private int dia;
	private int mes;
	private int anio;

	public Fecha() {
		dia = 1;
		mes = 1;
		anio = 2000;
	}

	public String escribeCorto() {
		return dia + "/" + mes + "/" + anio;
	}

	public void setDia(int d) {
		this.dia = d;
	}

	public void setMes(int m) {
		this.mes = m;
	}

	public void setAnio(int a) {
		this.anio = a;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnio() {
		return anio;
	}
}
