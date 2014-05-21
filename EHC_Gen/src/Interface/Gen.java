package Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
//import java.awt.GridBagLayout;
//import java.awt.BorderLayout;
//import javax.swing.BoxLayout;
//import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
//import javax.swing.SwingConstants;
//import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.factories.FormFactory;
//import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
//import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JSeparator;

import java.awt.event.*;
import javax.swing.*;
//import java.awt.*;
import java.io.*;
import java.util.*;

public class Gen {

	private JFrame frmEhcArduinocodeGenerator;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	
	private boolean IR,lights, blinds, intercom, temp, motion, rain, lightSensor;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gen window = new Gen();
					window.frmEhcArduinocodeGenerator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gen() {
		IR = lights = blinds = intercom = temp =  motion = rain = lightSensor = false;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEhcArduinocodeGenerator = new JFrame();
		frmEhcArduinocodeGenerator.setTitle("EHC Arduino-Code Generator");
		frmEhcArduinocodeGenerator.setBounds(100, 100, 898, 662);
		frmEhcArduinocodeGenerator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frmEhcArduinocodeGenerator.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel lblBienvenidoAlSistema = new JLabel("Bienvenido al sistema Generador de Codigo Arduino EHC");
		
		JRadioButton rdbtnControlIr = new JRadioButton("Control IR");
		
		JRadioButton rdbtnControlLuces = new JRadioButton("Control Luces");
		
		JRadioButton rdbtnPersianas = new JRadioButton("Persianas");
		
		JRadioButton rdbtnTelefonillo = new JRadioButton("Telefonillo");
		
		JRadioButton rdbtnTermostato = new JRadioButton("Termostato");
		
		JLabel lblSeleccioneLosServicios = new JLabel("Seleccione los servicios:");
		
		JLabel lblSeleccioneDirectorioDestino = new JLabel("Seleccione Directorio Destino:");
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setText("/home/hectorgpala/Test");
		
		JLabel lblSeleccionDePines = new JLabel("Seleccion de Pines:");
		
		JLabel lblLecturaIr = new JLabel("Lectura IR:");
		
		Box verticalBox = Box.createVerticalBox();
		
		JLabel lblReleLuces = new JLabel("Rele Luces:");
		
		JButton btnGenerar = new JButton("Generar!");
		
		JRadioButton rdbtnSensorMovimiento = new JRadioButton("Sensor Movimiento");
		
		JRadioButton rdbtnSensorLluvia = new JRadioButton("Sensor Lluvia");
		
		JRadioButton rdbtnSensorLuz = new JRadioButton("Sensor Luz");
		
		JLabel lblPersianas = new JLabel("Persianas:");
		
		JLabel lblTelefonillo = new JLabel("Telefonillo:");
		
		JLabel lblTermostato = new JLabel("Termostato:");
		
		JLabel lblMovimiento = new JLabel("Movimiento:");
		
		JLabel lblLluvia = new JLabel("Lluvia:");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setText("2");
		textField_1.setToolTipText("Pin de entrada DIGITAL");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setText("4");
		textField_2.setToolTipText("Pin de salida DIGITAL");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setText("9");
		textField_3.setToolTipText("Pin DIGITAL");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setText("13");
		textField_4.setToolTipText("Salida a cerradura PIN DIGITAL");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setText("A0");
		textField_5.setToolTipText("Pin de entrada Analogico");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setText("10");
		textField_6.setToolTipText("Pin DIGITAL");
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setText("A1");
		textField_7.setToolTipText("Pin de entrada Analogico");
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setText("7");
		textField_8.setToolTipText("Pin de entrada DIGITAL");
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setText("A2");
		textField_9.setToolTipText("Pin de entrada Analogico");
		
		JLabel lblLuz = new JLabel("Luz:");
		
		JSeparator separator = new JSeparator();
		
		JSeparator separator_1 = new JSeparator();
		
		JSeparator separator_2 = new JSeparator();
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		
		JLabel lblIdservice = new JLabel("idService");
		
		JLabel lblNombreHabitacion = new JLabel("Nombre Habitacion:");
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		
		JLabel lblIddevice = new JLabel("idDevice:");
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setText("11");
		textField_20.setToolTipText("Pin DIGITAL");
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setText("8");
		textField_21.setToolTipText("Pin DIGITAL");
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setText("12");
		textField_22.setToolTipText("Pin DIGITAL");
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setText("5");
		textField_23.setToolTipText("Pin de entrada DIGITAL");
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setText("6");
		textField_24.setToolTipText("Salida DIGITAL, caldera");
		
		textField_25 = new JTextField();
		textField_25.setToolTipText("Pin de salida DIGITAL");
		textField_25.setText("A3");
		textField_25.setColumns(10);
		
		textField_26 = new JTextField();
		textField_26.setToolTipText("Pin de salida DIGITAL");
		textField_26.setText("A4");
		textField_26.setColumns(10);
		
		JLabel lblSeleccioneDirectorioDe = new JLabel("Seleccione Directorio de Ficheros Fuente:");
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setText("/home/hectorgpala/ArduinoConf");
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(26)
					.addComponent(lblBienvenidoAlSistema)
					.addContainerGap(468, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(28)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnControlLuces)
								.addComponent(rdbtnPersianas)
								.addComponent(rdbtnTelefonillo)
								.addComponent(rdbtnTermostato)
								.addComponent(rdbtnSensorMovimiento)
								.addComponent(rdbtnControlIr)
								.addComponent(rdbtnSensorLluvia)
								.addComponent(rdbtnSensorLuz)))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblSeleccioneLosServicios)))
					.addGap(31)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
							.addComponent(textField_17, Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
							.addComponent(textField_16, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addComponent(lblIdservice)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))))
					.addGap(62)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(23)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(182)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblLecturaIr)
								.addComponent(lblTelefonillo)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblTermostato)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblLluvia)
										.addComponent(lblMovimiento)
										.addComponent(lblLuz)))
								.addComponent(lblPersianas)
								.addComponent(lblNombreHabitacion)
								.addComponent(lblReleLuces))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
										.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
												.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
												.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup()
													.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
												.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(21)
									.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(77)
							.addComponent(lblSeleccionDePines)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(verticalBox, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(33, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 587, Short.MAX_VALUE)
					.addGap(295))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(295)
					.addComponent(lblIddevice)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(477, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, 435, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSeleccioneDirectorioDe))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSeleccioneDirectorioDestino)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 435, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(405)
					.addComponent(btnGenerar)
					.addContainerGap(404, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBienvenidoAlSistema)
						.addComponent(lblNombreHabitacion)
						.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSeleccioneLosServicios)
								.addComponent(verticalBox, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
							.addGap(18))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblIdservice)
								.addComponent(lblSeleccionDePines))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnControlIr)
								.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(16)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnControlLuces)
								.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnPersianas)
								.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnTelefonillo)
								.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnTermostato)
								.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnSensorMovimiento)
								.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnSensorLluvia)
								.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnSensorLuz)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(2)
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblLecturaIr)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblReleLuces)
								.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblPersianas)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTelefonillo)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTermostato)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMovimiento)
								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblLluvia)
								.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblLuz)
								.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIddevice)
						.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSeleccioneDirectorioDe)
						.addComponent(lblSeleccioneDirectorioDestino))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addComponent(btnGenerar)
					.addContainerGap(36, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		frmEhcArduinocodeGenerator.getContentPane().setLayout(groupLayout);
		
		rdbtnControlIr.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				IR = !IR;
			}
		});
		rdbtnControlLuces.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lights = !lights;
			}
		});
		rdbtnPersianas.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				blinds = !blinds;
			}
		});
		rdbtnTelefonillo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				intercom = !intercom;
			}
		});
		rdbtnTermostato.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				temp = !temp;
			}
		});
		rdbtnSensorMovimiento.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				motion = !motion;
			}
		});
		rdbtnSensorLluvia.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				rain = !rain;
			}
		});
		rdbtnSensorLuz.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lightSensor = !lightSensor;
			}
		});
		btnGenerar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				genDir();
				genMain();
				if(IR)
					genCodeIR();
				if(lights)
					genCodeLights();
				if(blinds)
					genCodeBlinds();
				if(intercom)
					genCodeIntercom();
				if(temp)
					genCodeTemp();
				if(motion)
					genCodeMotion();
				if(rain)
					genCodeRain();
				if(lightSensor)
					genCodeLS();
			}
		});
	}
	
	void genDir(){//generate file config pins and idServices
		try{
			File folder = new File(textField.getText()+"/"+textField_18.getText());
			folder.mkdirs();
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null,"ERROR al crear el directorio!");					
		}
	}
	
	void genMain(){
		try{
			File main = new File(textField.getText()+"/"+textField_18.getText()+"/"+textField_18.getText()+".ino");
			PrintWriter p = null;
		    p = new PrintWriter(main);
		    p.println("//"+textField_18.getText()+"\n\r");
		    p.println("#include <string.h>\n\r");
		    p.println("//***idDevice***");
		    p.println("const int idDevice = "+textField_19.getText()+";"+"\n\r");
		    p.println("//***idServices***");
		    if(IR)
		    	p.println("const int service_IR = "+getIRService()+";");
		    if(lights)
		    	p.println("const int service_lights = "+getLightsService()+";");
		    if(blinds)
		    	p.println("const int service_blinds = "+getBlindsService()+";");
		    if(intercom)
		    	p.println("const int service_intercom = "+getIntercomService()+";");
		    if(temp)
		    	p.println("const int service_temp = "+getTempService()+";");
		    if(motion)
		    	p.println("const int service_motion = "+getMotionService()+";");
		    if(rain)
		    	p.println("const int service_rain = "+getRainService()+";");
		    if(lightSensor)
		    	p.println("const int service_lightSensor = "+getLSService()+";");
		    p.println("\n\r");
		    genSetup(p);
		    genLoop(p);
		    p.close();		    
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"ERROR al generar fichero principal");
		}
	}
	
	void genSetup(PrintWriter p) throws Exception{
		p.println("void setup(){");
		p.println("\tSerial.begin(9600);");
		if(IR)
	    	p.println("\tsetup_IR();");
	    if(lights)
	    	p.println("\tsetup_LightControl();");
	    if(blinds)
	    	p.println("\tsetup_blindSensor();");
	    if(intercom)
	    	p.println("\tsetup_Intercom();");
	    if(temp)
	    	p.println("\tsetup_temp();");
	    if(motion)
	    	p.println("\tsetup_Motion();");
	    if(rain)
	    	p.println("\tsetup_Rain();");
	    if(lightSensor)
	    	p.println("\tsetup_lightSensor();");
	    p.println("}\n\r");		
	}
	
	void genLoop(PrintWriter p) throws Exception{
		p.println("void loop(){");
		if(IR)
	    	p.println("\tloop_IR(idDevice,service_IR);");
	    if(lights)
	    	p.println("\tloop_LightControl(idDevice,service_lights);");
	    if(blinds)
	    	p.println("\tloop_blinds(idDevice,service_blinds);");
	    if(intercom)
	    	p.println("\tloop_Intercom(idDevice,service_intercom);");
	    if(temp)
	    	p.println("\tloop_temp();");
	    if(motion)
	    	p.println("\tloop_Motion(idDevice,service_motion);");
	    if(rain)
	    	p.println("\tloop_Rain(idDevice,service_rain);");
	    if(lightSensor)
	    	p.println("\tloop_LightSensor(idDevice,service_lightSensor);");
	    String def = new Scanner(new File(textField_27.getText()+"/mainDefault")).useDelimiter("\\Z").next();
	    p.println(def);
	    if(IR){
	    	String s = new Scanner(new File(textField_27.getText()+"/IR_Action")).useDelimiter("\\Z").next();
		    p.println(s);
	    }
	    if(lights){
	    	String s = new Scanner(new File(textField_27.getText()+"/LIGHTS_Action")).useDelimiter("\\Z").next();
		    p.println(s);
	    }
	    if(blinds){
	    	String s = new Scanner(new File(textField_27.getText()+"/BLINDS_Action")).useDelimiter("\\Z").next();
		    p.println(s);
	    }
	    if(intercom){
	    	String s = new Scanner(new File(textField_27.getText()+"/INTERCOM_Action")).useDelimiter("\\Z").next();
		    p.println(s);
	    }
	    if(temp){
	    	String s = new Scanner(new File(textField_27.getText()+"/TEMP_Action")).useDelimiter("\\Z").next();
		    p.println(s);
	    }
	    String s = new Scanner(new File(textField_27.getText()+"/DEFAULT_Action")).useDelimiter("\\Z").next();
	    p.println(s);
	    p.println("\t\t\t}");
	    p.println("\t\t}");
	    p.println("\t\tSerial.flush();");
	    p.println("\t}");
	    p.println("}");	    
	}
	
	void genCodeIR(){
		try{
			File f = new File(textField.getText()+"/"+textField_18.getText()+"/Control_IR.ino");
			PrintWriter p = null;
		    p = new PrintWriter(f);
		    p.println("/*test sobre control IR completo*/");
		    p.println("#include <IRremote.h>\n\r");
		    p.println("int pinRead_IR = "+textField_1.getText()+";");
			String s = new Scanner(new File(textField_27.getText()+"/Control_IR.ino")).useDelimiter("\\Z").next();
			p.println(s);
			p.close();
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"ERROR al generar codigo IR");
		}
	}
	
	void genCodeLights(){
		try{
			File f = new File(textField.getText()+"/"+textField_18.getText()+"/Light_Control.ino");
			PrintWriter p = null;
			p = new PrintWriter(f);
			p.println("const int pinRelay1 = "+textField_2.getText()+";");
			p.println("const int pinSensor1 = "+textField_25.getText()+";");
			p.println("const int pinSensor2 = "+textField_26.getText()+";");
			String s = new Scanner(new File(textField_27.getText()+"/Light_Control.ino")).useDelimiter("\\Z").next();
			p.println(s);
			p.close();
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"ERROR al generar codigo Persianas");
		}		
	}
	
	void genCodeBlinds(){
		try{
			File f = new File(textField.getText()+"/"+textField_18.getText()+"/blindSensors.ino");
			PrintWriter p = null;
			p = new PrintWriter(f);
			p.println("const int Eo_p = "+textField_21.getText()+";// Enabled out pin");
			p.println("const int UDo_p = "+textField_3.getText()+";// Up/Down out pin");
			p.println("const int bottomSens_p = "+textField_6.getText()+";// Sensor in bottom position pin");
			p.println("const int mediumSens_p = "+textField_20.getText()+";// Sensor in bottom position pin");
			p.println("const int upSens_p = "+textField_22.getText()+";// Sensor in bottom position pin\n\r");
			String s = new Scanner(new File(textField_27.getText()+"/blindSensors.ino")).useDelimiter("\\Z").next();
			p.println(s);
			p.close();
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"ERROR al generar codigo Persianas");
		}		
	}
	
	void genCodeIntercom(){
		try{
			File f = new File(textField.getText()+"/"+textField_18.getText()+"/Intercom.ino");
			PrintWriter p = null;
			p = new PrintWriter(f);
			p.println("const int pinDoor = "+textField_4.getText()+";");
			p.println("const int pinSignal = "+textField_23.getText()+";");
			String s = new Scanner(new File(textField_27.getText()+"/Intercom.ino")).useDelimiter("\\Z").next();
			p.println(s);
			p.close();
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"ERROR al generar codigo Intercom");
		}		
	}
	
	void genCodeTemp(){
		try{
			File f = new File(textField.getText()+"/"+textField_18.getText()+"/temp.ino");
			PrintWriter p = null;
			p = new PrintWriter(f);
			p.println("const int tempPin = "+textField_5.getText()+";");
			p.println("const int tempPin2 = "+textField_24.getText()+";");
			String s = new Scanner(new File(textField_27.getText()+"/temp.ino")).useDelimiter("\\Z").next();
			p.println(s);
			p.close();
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"ERROR al generar codigo Termostato");
		}
	}
	
	void genCodeMotion(){
		try{
			File f = new File(textField.getText()+"/"+textField_18.getText()+"/Motion_Sensor.ino");
			PrintWriter p = null;
			p = new PrintWriter(f);
			p.println("const int inputPinMotion = "+textField_7.getText()+";");
			String s = new Scanner(new File(textField_27.getText()+"/Motion_Sensor.ino")).useDelimiter("\\Z").next();
			p.println(s);
			p.close();
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"ERROR al generar codigo Termostato");
		}		
	}
	
	void genCodeRain(){
		try{
			File f = new File(textField.getText()+"/"+textField_18.getText()+"/Rain_Sensor.ino");
			PrintWriter p = null;
			p = new PrintWriter(f);
			p.println("const int inputPinRain = "+textField_8.getText()+";");
			String s = new Scanner(new File(textField_27.getText()+"/Rain_Sensor.ino")).useDelimiter("\\Z").next();
			p.println(s);
			p.close();
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"ERROR al generar codigo LLuvia");
		}		
	}
	
	void genCodeLS(){
		try{
			File f = new File(textField.getText()+"/"+textField_18.getText()+"/lightSensor.ino");
			PrintWriter p = null;
			p = new PrintWriter(f);
			p.println("const int Si_p = "+textField_9.getText()+";");
			String s = new Scanner(new File(textField_27.getText()+"/lightSensor.ino")).useDelimiter("\\Z").next();
			p.println(s);
			p.close();
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"ERROR al generar codigo Sensor de Luz");
		}
	}
	
	String getIRService(){return textField_10.getText();}
	
	String getLightsService(){return textField_11.getText();}
	
	String getBlindsService(){return textField_12.getText();}
	
	String getIntercomService(){return textField_13.getText();}
	
	String getTempService(){return textField_14.getText();}
	
	String getMotionService(){return textField_15.getText();}
	
	String getRainService(){return textField_16.getText();}
	
	String getLSService(){return textField_17.getText();}
}
