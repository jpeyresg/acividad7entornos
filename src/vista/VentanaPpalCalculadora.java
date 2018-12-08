package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ManejadorEventos;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.management.openmbean.OpenDataException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class VentanaPpalCalculadora extends JFrame {

	private JPanel panelContenido, panelCaja1, panelCaja2;
	private JTextField cajaTexto1;
	private JTextField cajaTexto2;
	private JButton botonSumar, botonRestar, botonMultiplicar, botonDividir, botonRaiz2, botonRaiz3;
	private JLabel etiquetaNumero1, etiquetaNumero2, etiquetaResultado, impresionResultado, logo, impresionResultado2;

	public VentanaPpalCalculadora() {
		setTitle("CALCULADORA");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 518);
		setIconImage(Toolkit.getDefaultToolkit().getImage("calculator_icon.png"));
		inicializarComponentes();
		setVisible(true);

	}

	private void inicializarComponentes() {
		
		
		try {
			Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("American Captain.ttf"));
			
			panelContenido = new JPanel();
			panelContenido.setBackground(Color.WHITE);
			panelContenido.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(panelContenido);
			panelContenido.setLayout(null);
			
			Image img = new ImageIcon("Calculadora titulo 02.png").getImage();
			logo = new JLabel(new ImageIcon(img.getScaledInstance(160, 80, Image.SCALE_SMOOTH)));
			logo.setBounds(10, 23, 294, 80);
			panelContenido.add(logo);

			etiquetaNumero1 = new JLabel("Numero 1:");
			etiquetaNumero1.setBounds(40, 155, 89, 20);
			etiquetaNumero1.setFont(font.deriveFont(Font.TRUETYPE_FONT, 16f));
			etiquetaNumero1.setForeground(new Color(30, 144, 255));
			panelContenido.add(etiquetaNumero1);

			etiquetaNumero2 = new JLabel("Numero 2:");
			etiquetaNumero2.setBounds(40, 186, 89, 20);
			etiquetaNumero2.setFont(font.deriveFont(Font.TRUETYPE_FONT, 16f));
			etiquetaNumero2.setForeground(new Color(30, 144, 255));
			panelContenido.add(etiquetaNumero2);
			
			panelCaja1 = new JPanel();
			panelCaja1.setBorder(new LineBorder(new Color(30, 144, 255)));
			panelCaja1.setBackground(Color.WHITE);
			panelCaja1.setBounds(154, 151, 104, 22);
			panelCaja1.setLayout(null);
			
			cajaTexto1 = new JTextField();
			cajaTexto1.setBounds(1, 1, 102, 20);
			cajaTexto1.setColumns(10);
			cajaTexto1.setBorder(null);
			cajaTexto1.setFont(font.deriveFont(Font.TRUETYPE_FONT, 16f));
			cajaTexto1.setForeground(new Color(30, 144, 255));
			panelCaja1.add(cajaTexto1);
			panelContenido.add(panelCaja1);
			
			panelCaja2 = new JPanel();
			panelCaja2.setBorder(new LineBorder(new Color(30, 144, 255)));
			panelCaja2.setBackground(Color.WHITE);
			panelCaja2.setBounds(154, 184, 104, 22);
			panelCaja2.setLayout(null);

			cajaTexto2 = new JTextField();
			cajaTexto2.setColumns(10);
			cajaTexto2.setBounds(1, 1, 102, 20);
			cajaTexto2.setBorder(null);
			cajaTexto2.setFont(font.deriveFont(Font.TRUETYPE_FONT, 16f));
			cajaTexto2.setForeground(new Color(30, 144, 255));
			panelCaja2.add(cajaTexto2);
			panelContenido.add(panelCaja2);

			botonSumar = new JButton("Sumar");
			botonSumar.setBounds(40, 217, 104, 37);
			botonSumar.setFont(font.deriveFont(Font.TRUETYPE_FONT, 16f));
			botonSumar.setBackground(new Color(30, 144, 255));
			botonSumar.setForeground(Color.WHITE);
			panelContenido.add(botonSumar);

			botonRestar = new JButton("Restar");
			botonRestar.setBounds(154, 217, 104, 37);
			botonRestar.setFont(font.deriveFont(Font.TRUETYPE_FONT, 16f));
			botonRestar.setBackground(new Color(30, 144, 255));
			botonRestar.setForeground(Color.WHITE);
			panelContenido.add(botonRestar);

			botonMultiplicar = new JButton("Multiplicar");
			botonMultiplicar.setBounds(40, 265, 104, 37);
			botonMultiplicar.setFont(font.deriveFont(Font.TRUETYPE_FONT, 16f));
			botonMultiplicar.setBackground(new Color(30, 144, 255));
			botonMultiplicar.setForeground(Color.WHITE);
			panelContenido.add(botonMultiplicar);

			botonDividir = new JButton("Dividir");
			botonDividir.setBounds(154, 265, 104, 37);
			botonDividir.setFont(font.deriveFont(Font.TRUETYPE_FONT, 16f));
			botonDividir.setBackground(new Color(30, 144, 255));
			botonDividir.setForeground(Color.WHITE);
			panelContenido.add(botonDividir);
			
			botonRaiz2 = new JButton("Raiz 2");
			botonRaiz2.setBounds(40, 313, 104, 37);
			botonRaiz2.setFont(font.deriveFont(Font.TRUETYPE_FONT, 16f));
			botonRaiz2.setBackground(new Color(30, 144, 255));
			botonRaiz2.setForeground(Color.WHITE);
			panelContenido.add(botonRaiz2);
			
			botonRaiz3 = new JButton("Raiz 3");
			botonRaiz3.setBounds(154, 313, 104, 37);
			botonRaiz3.setFont(font.deriveFont(Font.TRUETYPE_FONT, 16f));
			botonRaiz3.setBackground(new Color(30, 144, 255));
			botonRaiz3.setForeground(Color.WHITE);
			panelContenido.add(botonRaiz3);

			etiquetaResultado = new JLabel("Resultado :");
			etiquetaResultado.setBounds(40, 352, 89, 31);
			etiquetaResultado.setFont(font.deriveFont(Font.TRUETYPE_FONT, 16f));
			etiquetaResultado.setForeground(new Color(30, 144, 255));
			panelContenido.add(etiquetaResultado);

			impresionResultado = new JLabel("");
			impresionResultado.setBounds(40, 383, 218, 31);
			impresionResultado.setHorizontalAlignment(SwingConstants.CENTER);
			impresionResultado.setFont(font.deriveFont(Font.TRUETYPE_FONT, 16f));
			impresionResultado.setForeground(new Color(30, 144, 255));
			panelContenido.add(impresionResultado);
			
			impresionResultado2 = new JLabel("");
			impresionResultado2.setForeground(new Color(30, 144, 255));
			impresionResultado2.setHorizontalAlignment(SwingConstants.CENTER);
			impresionResultado2.setFont(font.deriveFont(Font.TRUETYPE_FONT, 16f));
			impresionResultado2.setBounds(40, 433, 218, 31);
			panelContenido.add(impresionResultado2);
			

			
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

	public JButton getBotonSumar() {
		return botonSumar;
	}

	public JButton getBotonRestar() {
		return botonRestar;
	}

	public JButton getBotonMultiplicar() {
		return botonMultiplicar;
	}

	public JButton getBotonDividir() {
		return botonDividir;
	}

	public JButton getBotonRaiz2() {
		return botonRaiz2;
	}

	public JButton getBotonRaiz3() {
		return botonRaiz3;
	}

	public JTextField getCajaTexto1() {
		return cajaTexto1;
	}

	public JTextField getCajaTexto2() {
		return cajaTexto2;
	}
	
	public void linkadorEventos(ManejadorEventos manejador) {
		botonSumar.addActionListener(manejador);
		botonRestar.addActionListener(manejador);
		botonMultiplicar.addActionListener(manejador);
		botonDividir.addActionListener(manejador);
		botonRaiz2.addActionListener(manejador);
		botonRaiz3.addActionListener(manejador);
		
	}
	
	public void imprimirResultado(String resultado) {
		impresionResultado.setText(resultado);
	}
	
	public void imprimirResultado2(String resultado) {
		impresionResultado2.setText(resultado);
	}
	
	public void imprimirError(String error) {
		impresionResultado2.setText(error);
	}
}
