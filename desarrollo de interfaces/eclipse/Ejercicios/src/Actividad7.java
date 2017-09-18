
public class Actividad7 {

	public static void main(String[] args) {
		Profesor p1 = new Profesor("09070489w", "Jose", "Perez", 1032.25, 2, true);
		Directivo p2 = new Directivo("07040302D", "Luis", "Rodriguez", 530.25, 5, false, true, 'M');
		Administracion p3 = new Administracion("40303021E", "Maria", "Jose Perez", 1033.22, 'F', 30);

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}

}
