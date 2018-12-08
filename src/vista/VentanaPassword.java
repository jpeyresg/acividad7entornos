package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import controlador.ManejadorEventos;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaPassword extends JDialog {

	private final JPanel panelContenido = new JPanel();
	private JTextField cajaPassword;
	private JPanel panelCajaPassword;
	private ManejadorEventos manejador;
	private JLabel etiquetaPassword;
	private JButton botonAceptar, botonCancelar;

	
	public VentanaPassword() {
		
		try {
			Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("American Captain.ttf"));
			
			setBounds(100, 100, 376, 266);
			setIconImage(Toolkit.getDefaultToolkit().getImage("calculator_icon.png"));
			getContentPane().setLayout(new BorderLayout());
			panelContenido.setBorder(new EmptyBorder(5, 5, 5, 5));
			getContentPane().add(panelContenido, BorderLayout.CENTER);
			panelContenido.setBackground(Color.WHITE);
			panelContenido.setLayout(null);
			
			etiquetaPassword = new JLabel("INTRODUZCA PASSWORD:");
			etiquetaPassword.setBounds(34, 73, 142, 20);
			etiquetaPassword.setFont(font.deriveFont(Font.TRUETYPE_FONT, 16f));
			etiquetaPassword.setForeground(new Color(30, 144, 255));
			panelContenido.add(etiquetaPassword);
			
			panelCajaPassword = new JPanel();
			panelCajaPassword.setBorder(new LineBorder(new Color(30, 144, 255)));
			panelCajaPassword.setBackground(Color.WHITE);
			panelCajaPassword.setBounds(199, 67, 124, 26);
			panelCajaPassword.setLayout(null);
			
			cajaPassword = new JTextField();
			cajaPassword.setBounds(0, 0, 124, 26);
			cajaPassword.setColumns(10);
			cajaPassword.setFont(font.deriveFont(Font.TRUETYPE_FONT, 16f));
			cajaPassword.setForeground(new Color(30, 144, 255));
			cajaPassword.requestFocus();
			panelCajaPassword.add(cajaPassword);
			panelContenido.add(panelCajaPassword);
			
			
			botonAceptar = new JButton("ACEPTAR");
			botonAceptar.setBounds(34, 144, 104, 37);
			botonAceptar.setBackground(new Color(30, 144, 255));
			botonAceptar.setFont(font.deriveFont(Font.TRUETYPE_FONT, 16f));
			botonAceptar.setForeground(Color.WHITE);
			
			panelContenido.add(botonAceptar);
			
			botonCancelar = new JButton("CANCELAR");
			botonCancelar.setBounds(219, 144, 104, 37);
			botonCancelar.setBackground(new Color(30, 144, 255));
			botonCancelar.setFont(font.deriveFont(Font.TRUETYPE_FONT, 16f));
			botonCancelar.setForeground(Color.WHITE);
			
			panelContenido.add(botonCancelar);
			
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


	public JTextField getCajaPassword() {
		return cajaPassword;
	}


	public JButton getBotonAceptar() {
		return botonAceptar;
	}


	public JButton getBotonCancelar() {
		return botonCancelar;
	}
	
	public void linkadorEventos(ManejadorEventos manejador) {
		botonAceptar.addActionListener(manejador);
		botonCancelar.addActionListener(manejador);
		
	}
	
}
