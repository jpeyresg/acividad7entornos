package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VentanaAviso;
import vista.VentanaPassword;
import vista.VentanaPpalCalculadora;

public class ManejadorEventos implements ActionListener{
	
	private VentanaPpalCalculadora calcu;
	private VentanaAviso aviso;
	private VentanaPassword password;
	
	public ManejadorEventos(VentanaPpalCalculadora calcu, VentanaAviso aviso, VentanaPassword password) {
		this.calcu = calcu;
		this.aviso = aviso;
		this.password = password;
	}
	
	
	
	private boolean CheckCaja() {
	
		if (calcu.getCajaTexto1().getText().isEmpty() == true) { //comprobamos que la caja 1 no este vacia
			calcu.imprimirError("Falta el numero 1");	
			calcu.getCajaTexto1().requestFocus(); //ponemos el foco en la caja 1
			return false;
		}
		else {
			
			if (calcu.getCajaTexto1().getText().matches("-?\\d+(\\.\\d+)?") == false) { //comprobamos que dentro de la caja 1 haya un numero
				calcu.imprimirError("En la caja 1 no hay un numero");
				calcu.getCajaTexto1().requestFocus(); //ponemos el foco en la caja 1
				return false;
			}
			else {
				
				if (calcu.getCajaTexto2().getText().isEmpty() == true) { //comprobamos que la caja 2 no este vacia
					calcu.imprimirError("Falta el numero 2");
					calcu.getCajaTexto2().requestFocus(); //ponemos el foco en la caja 2 ya que hay un error
					return false;
				}
				else {
					if (calcu.getCajaTexto2().getText().matches("-?\\d+(\\.\\d+)?") == false) { //comprobamos que dentro de la caja 2 haya un numero
						calcu.imprimirError("En la caja 2 no hay un numero");
						calcu.getCajaTexto2().requestFocus(); //ponemos el foco en la caja 2 ya que hay un error
						return false;
					}
					else {
						if (Float.parseFloat(calcu.getCajaTexto2().getText()) == 0) { //comprobamos que dentro de la caja 2 el numero no sea cero
							calcu.imprimirError("En la caja 2 no puede haber un cero");
							calcu.getCajaTexto2().requestFocus(); //ponemos el foco en la caja 2 ya que hay un error
							return false;
						}
						return true;
					}
					
				}
			} 
		} 
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource() == calcu.getBotonSumar()) {
			
			float resultado, num1, num2;
			calcu.imprimirResultado2("");
			if (CheckCaja() == true) {
				num1 = Float.parseFloat(calcu.getCajaTexto1().getText());
				num2 = Float.parseFloat(calcu.getCajaTexto2().getText());
				resultado = num1 + num2;
				calcu.imprimirResultado(Float.toString(resultado));
				calcu.getCajaTexto1().requestFocus(); //ponemos el foco en la caja 1
			}
		}
		
		if (e.getSource() == calcu.getBotonRestar()) {
			
			float resultado, num1, num2;
			calcu.imprimirResultado2("");
			if (CheckCaja() == true) {
				num1 = Float.parseFloat(calcu.getCajaTexto1().getText());
				num2 = Float.parseFloat(calcu.getCajaTexto2().getText());
				resultado = num1 - num2;
				calcu.imprimirResultado(Float.toString(resultado));
				calcu.getCajaTexto1().requestFocus(); //ponemos el foco en la caja 1
			}		
						
		}
		
		if (e.getSource() == calcu.getBotonMultiplicar()) {
			
			float resultado, num1, num2;
			calcu.imprimirResultado2("");
			if (CheckCaja() == true) {
				num1 = Float.parseFloat(calcu.getCajaTexto1().getText());
				num2 = Float.parseFloat(calcu.getCajaTexto2().getText());
				resultado = num1 * num2;
				calcu.imprimirResultado(Float.toString(resultado));
				calcu.getCajaTexto1().requestFocus(); //ponemos el foco en la caja 1
			}
						
		}
		
		if (e.getSource() == calcu.getBotonDividir()) {
			
			float resultado, num1, num2;
			calcu.imprimirResultado2("");
			if (CheckCaja() == true) {
				num1 = Float.parseFloat(calcu.getCajaTexto1().getText());
				num2 = Float.parseFloat(calcu.getCajaTexto2().getText());
				resultado = num1 / num2;
				calcu.imprimirResultado(Float.toString(resultado));
				calcu.getCajaTexto1().requestFocus(); //ponemos el foco en la caja 1
			}
								
		}
		
		if (e.getSource() == calcu.getBotonRaiz2()) {
			aviso.setVisible(true);
		}
		
		if (e.getSource() == calcu.getBotonRaiz3()) {
			if (CheckCaja() == true) {
				password.setVisible(true);
				password.getCajaPassword().requestFocus();
				
			}
			
		}
		
		if (e.getSource() == aviso.getBotonAceptar()) {
			aviso.dispose();
		}
		
		if (e.getSource() == password.getBotonAceptar()) {
			
			if (password.getCajaPassword().getText().equals("telefonica")) {
				password.dispose();

				float res1, res2, num1, num2;
				num1 = Float.parseFloat(calcu.getCajaTexto1().getText());
				num2 = Float.parseFloat(calcu.getCajaTexto2().getText());
				res1 = (float) Math.cbrt((double)num1);
				res2 = (float) Math.cbrt((double)num2);
				calcu.imprimirResultado(Float.toString(res1));
				calcu.imprimirResultado2(Float.toString(res2));
				calcu.getCajaTexto1().requestFocus();
				
			}
			else {
				password.dispose();
				calcu.imprimirResultado("PASSWORD INCORRECTA");
			}
		}
		
		if (e.getSource() == password.getBotonCancelar()) {
			password.dispose();
		}
		
	}
	

}
