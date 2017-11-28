package vehiculos;

public class Vehiculos {

	private String nombreModelo;
	private double precio;

	public Vehiculos(String nombreModelo, double precio) {
		super();
		this.nombreModelo = nombreModelo;
		this.precio = precio;
	}

	public String getNombreModelo() {
		return nombreModelo;
	}

	public void setNombreModelo(String nombreModelo) {
		this.nombreModelo = nombreModelo;
	}

	public void concatenar(String nombreModelo) {
		this.nombreModelo += nombreModelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void sumarPrecio(double p) {
		this.precio += p;
	}

	public void ampliar(String n) {
		this.nombreModelo += n;
	}
}
