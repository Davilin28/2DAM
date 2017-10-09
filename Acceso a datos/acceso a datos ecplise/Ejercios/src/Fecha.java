
public class Fecha {
	
	private int dia;
	private int mes;
	private int anio;

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String escribeCorto() {
		return dia + "/" + mes + "/" + anio;
	}
	
	public String escribeLargo() {
		return "El" + " " + dia +" " + "del" + " " + mes + " " + "del" + " " + anio;
	}
	
	public boolean comprobar() {
		int dia = 0, mes = 0, anio = 0;
		boolean resultado = false;
		
		resultado = dia<31 && mes<12 && anio<1900;
		
		return resultado;
	}
	
}
