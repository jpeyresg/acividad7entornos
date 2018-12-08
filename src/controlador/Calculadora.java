package controlador;

import vista.VentanaAviso;
import vista.VentanaPassword;
import vista.VentanaPpalCalculadora;

public class Calculadora {

	public static void main(String[] args) {
		VentanaPpalCalculadora miCalculadora = new VentanaPpalCalculadora();
		VentanaAviso aviso = new VentanaAviso();
		VentanaPassword password = new VentanaPassword();
		ManejadorEventos manejador = new ManejadorEventos(miCalculadora, aviso, password);
		miCalculadora.linkadorEventos(manejador);		
		aviso.linkadorEventos(manejador);
		password.linkadorEventos(manejador);

	}

}
