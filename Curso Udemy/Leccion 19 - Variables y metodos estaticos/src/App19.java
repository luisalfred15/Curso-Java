class Arepa {

	// Una variable estatica es comun a todas las instancias de la clase Arepa. En
	// 	contra a las variables de instancia o no estaticas, que cada objeto tiene una
	// 	diferente
	// Las variables estaticas pertenecen a la clase. Las de instancia pertenecen a
	// 	cada objeto que venga de una clase (de ahi a que se llamen de instancia)
	public int radio;
	public static String descripcion;
	
	// Existen las variables finales, que son constantes
	// Se nombran con mayus. sostenidas
	public final int CANTIDAD_MASA = 100;
	
	
	// Tambien existen metodos estaticos
	// Ojo: estos *no* pueden acceder a informacion no estatica
	public static void imprimirDescripcion() {
		System.out.println(descripcion);
	}
	
	public void imprimirInformacion() {
		System.out.println("Tiene un radio de " + radio + " cm");
		System.out.println(descripcion);
	}
}

public class App19 {

	public static void main(String[] args) {
		
		// Para declarar una variable estatica
		Arepa.descripcion = "Plato tipico venezolano hecho de harina de maiz precocida.";

	}

}
