package Conversion;

/**
 * Paquete de conversion de diferentes cosas
 * 
 * @version 1.0
 * @author MarianoMiro
 * 
 * 
 */

import javax.swing.JOptionPane;


import conversores.ConversorMonedas;
import conversores.ConversorPesos;
import conversores.ConversorTemperatura;
import conversores.MainMenu;
import conversores.RepetirConversion;

/**
 * 
 * 
 * 
 * Genera el programa hasta que se cumpla la condicion de que el usuario no decida utilizar mas conversiones.
 * Conversiones aceptadas: Temperatura, Peso, Monedas.
 * @param programaFuncionando - boolean
 * @author Mariano Miro
 * @version 1.0
 *
 *
 */

public class ProgramaConversion_V1 {

	public static void main(String[] args) {

		MainMenu menu = new MainMenu();

		boolean programaFuncionando = true;

		
		
		while (programaFuncionando) {

			int opcion = menu.seleccionarOpcion();

			double numero;
			boolean numeroCorrecto = false;

			while (!numeroCorrecto) {
				try {
					if (opcion == 0) {
						numero = Double.parseDouble(
								JOptionPane.showInputDialog(null, "Ingrese la cantidad de moneda a convertir"));
						numeroCorrecto = true;
						ConversorMonedas conversorMon = new ConversorMonedas(numero);
						conversorMon.conversion();
					} else if (opcion == 1) {
						numero = Double.parseDouble(
								JOptionPane.showInputDialog(null, "Ingrese la cantidad de peso a convertir"));
						numeroCorrecto = true;
						ConversorPesos conversorPeso = new ConversorPesos(numero);
						conversorPeso.conversion();
					} else if (opcion == 2) {
						numero = Double.parseDouble(
								JOptionPane.showInputDialog(null, "Ingrese la cantidad de temperatura a convertir"));
						numeroCorrecto = true;
						ConversorTemperatura conversorTemp = new ConversorTemperatura(numero);
						conversorTemp.conversion();

					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor Incorrecto", "Error", 0);
				} catch (NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Usted ha cancelado", "Cancelado", 0);
					numeroCorrecto = true;
				}
			}
			RepetirConversion repetir = new RepetirConversion();
			int decision = repetir.preguntarRepeticion();

			if (decision == 1) {
				JOptionPane.showMessageDialog(null, "Programa Terminado", null, 0);
				programaFuncionando = false;
			}

		}

	}
}
