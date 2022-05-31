package conversores;
import javax.swing.JOptionPane;

public class ConversorMonedas {

	private double numero;
	
	public ConversorMonedas(double numero) {
		this.numero = numero;
	}
	
	private double dolar = 124;
	private double yen = 0.94;
	private double euro = 127.45;
	private double real = 24.70;
	private double libra = 149.06;
	private double yuan = 17.84;
	
	
	public double pesoADolar() {
		return this.numero / dolar;
	}
	
	public double pesoAEuro() {
		return this.numero / euro;
	}
	
	public double pesoAReal() {
		return this.numero / real;
	}
	
	public double pesoALibra() {
		return this.numero / libra;
	}
	
	public double pesoAYen () {
		return this.numero / yen;
	}
	
	public double pesoAYuan () {
		return this.numero / yuan;
	}
	
	public double dolarAPeso() {
		return this.numero * dolar;
	}
	
	public double euroAPeso() {
		return this.numero * euro;
	}
	
	public double realAPeso() {
		return this.numero * real;
	}
	
	public double libraAPeso() {
		return this.numero * libra;
	}
	
	public double yenAPeso () {
		return this.numero * yen;
	}
	
	public double yuanAPeso () {
		return this.numero * yuan;
	}
	
	public String escribeMensaje (String moneda1, String moneda2, double convertido) {
		String mensaje = this.numero + " " + moneda1 + " equivalen a " + convertido + " " + moneda2;
		return mensaje;
	}
	
	public void conversion () {
		String moneda1;
		String moneda2;
		double convertido;
		
		String moneda = (JOptionPane.showInputDialog(null, "Seleccione que tipo de conversion desea hacer", 
				"Tipo de Conversor", JOptionPane.PLAIN_MESSAGE, null, new Object[] 
				{"Peso a Dolar", "Peso a Euro", "Peso a Real", "Peso a Yen", "Peso a Yuan", "Dolar a Peso", 
				"Euro a Peso", "Real a Peso", "Yen a Peso", "Yuan a Peso"}, "Peso a Dolar")).toString();
		if (moneda == "Peso a Dolar") {
			moneda1 = "Pesos";
			moneda2 = "Dolares";
			convertido = Math.round(pesoADolar() * 100.0) / 100.0;
			String mensaje = escribeMensaje(moneda1, moneda2, convertido);
					//this.numero + " " + moneda1 + " equivalen a " + convertido + " " + moneda2;
			JOptionPane.showMessageDialog(null, mensaje, "Conversion efectuada", 1);
		}else if (moneda == "Peso a Euro") {
			moneda1 = "Pesos";
			moneda2 = "Euros";
			convertido = Math.round(pesoAEuro() * 100.0) / 100.0;
			String mensaje = escribeMensaje(moneda1, moneda2, convertido);
			JOptionPane.showMessageDialog(null, mensaje, "Conversion efectuada", 1);
		}else if (moneda == "Peso a Real") {
			moneda1 = "Pesos";
			moneda2 = "Reales";
			convertido = Math.round(pesoAReal() * 100.0) / 100.0;
			String mensaje = escribeMensaje(moneda1, moneda2, convertido);
			JOptionPane.showMessageDialog(null, mensaje, "Conversion efectuada", 1);
		}else if (moneda == "Peso a Yen") {
			moneda1 = "Pesos";
			moneda2 = "Yenes";
			convertido = Math.round(pesoAYen() * 100.0) / 100.0;
			String mensaje = escribeMensaje(moneda1, moneda2, convertido);
			JOptionPane.showMessageDialog(null, mensaje, "Conversion efectuada", 1);
		}else if (moneda == "Peso a Yuan") {
			moneda1 = "Pesos";
			moneda2 = "Yuanes";
			convertido = Math.round(pesoAYuan() * 100.0) / 100.0;
			String mensaje = escribeMensaje(moneda1, moneda2, convertido);
			JOptionPane.showMessageDialog(null, mensaje, "Conversion efectuada", 1);
		}else if (moneda == "Dolar a Peso") {
			moneda1 = "Dolares";
			moneda2 = "Pesos";
			convertido = Math.round(dolarAPeso() * 100.0) / 100.0;
			String mensaje = escribeMensaje(moneda1, moneda2, convertido);
			JOptionPane.showMessageDialog(null, mensaje, "Conversion efectuada", 1);
		}else if (moneda == "Euro a Peso") {
			moneda1 = "Euros";
			moneda2 = "Pesos";
			convertido = Math.round(euroAPeso() * 100.0) / 100.0;
			String mensaje = escribeMensaje(moneda1, moneda2, convertido);
			JOptionPane.showMessageDialog(null, mensaje, "Conversion efectuada", 1);
		}else if (moneda == "Real a Peso") {
			moneda1 = "Reales";
			moneda2 = "Pesos";
			convertido = Math.round(realAPeso() * 100.0) / 100.0;
			String mensaje = escribeMensaje(moneda1, moneda2, convertido);
			JOptionPane.showMessageDialog(null, mensaje, "Conversion efectuada", 1);
		}else if (moneda == "Yen a Peso") {
			moneda1 = "Yenes";
			moneda2 = "Pesos";
			convertido = Math.round(yenAPeso() * 100.0) / 100.0;
			String mensaje = escribeMensaje(moneda1, moneda2, convertido);
			JOptionPane.showMessageDialog(null, mensaje, "Conversion efectuada", 1);
		}else if (moneda == "Yuan a Peso") {
			moneda1 = "Yuanes";
			moneda2 = "Pesos";
			convertido = Math.round(yuanAPeso() * 100.0) / 100.0;
			String mensaje = escribeMensaje(moneda1, moneda2, convertido);
			JOptionPane.showMessageDialog(null, mensaje, "Conversion efectuada", 1);
		}
			
	}
	
}
