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

import controlador.ManejadorEventos;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VentanaAviso extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton botonAceptar;
	private ManejadorEventos manejador;
	private JLabel etiquetaAviso;

	
	public VentanaAviso() {
		
		try {
			Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("American Captain.ttf"));
			
			setBounds(200, 300, 350, 240);
			setIconImage(Toolkit.getDefaultToolkit().getImage("calculator_icon.png"));
			getContentPane().setLayout(new BorderLayout());
			contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPanel.setBackground(Color.WHITE);
			getContentPane().add(contentPanel, BorderLayout.CENTER);
			contentPanel.setLayout(null);
			
			botonAceptar = new JButton("ACEPTAR");
			botonAceptar.setBounds(115, 118, 104, 37);
			
			botonAceptar.setFont(font.deriveFont(Font.TRUETYPE_FONT, 16f));
			botonAceptar.setBackground(new Color(30, 144, 255));
			botonAceptar.setForeground(Color.WHITE);
			contentPanel.add(botonAceptar);
			
			etiquetaAviso = new JLabel("FUNCION NO DISPONIBLE");
			etiquetaAviso.setHorizontalAlignment(SwingConstants.CENTER);
			etiquetaAviso.setBounds(10, 42, 314, 54);
			etiquetaAviso.setFont(font.deriveFont(Font.TRUETYPE_FONT, 20f));
			etiquetaAviso.setForeground(new Color(30, 144, 255));
			contentPanel.add(etiquetaAviso);
			
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}


	public JButton getBotonAceptar() {
		return botonAceptar;
	}
	
	public void linkadorEventos(ManejadorEventos manejador) {
		botonAceptar.addActionListener(manejador);
	}
	
}
