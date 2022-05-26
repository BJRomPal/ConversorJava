import javax.swing.JOptionPane;

public class ConversorTemperatura {
	
	double numero;
	
	public ConversorTemperatura(double numero) {
		this.numero = numero;
	}
	
	public double celciusAFahrenheit () {
		double Fahrenheit = (this.numero * 1.8) + 32;
		return Fahrenheit;
	}
	
	public double fahrenheitACelcius () {
		double celcius = (this.numero - 32) / 1.8;
		return celcius;
	}
	
	public void conversion () {
		
		double convertido;
		
		// ConversorTemperatura conversorTemp = new ConversorTemperatura(numero);
		
		String temperatura = (JOptionPane.showInputDialog(null, "Seleccione que tipo de conversion desea hacer", 
				"Tipo de Conversor", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Celcius a Fahrenheit", "Fahrenheit a Celcius"}, "Celcius a Fahrenheit")).toString();
		if (temperatura == "Celcius a Fahrenheit") {
			convertido = Math.round(celciusAFahrenheit() * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, numero + "° grados Celcius equivalen a " + convertido + "° Fahrenheit", "Temperatura Convertida", 1);
		}else {
			convertido = Math.round(fahrenheitACelcius() * 100.0) / 100.0;
			JOptionPane.showMessageDialog(null, numero + "° grados Fahrenheit equivalen a " + convertido + "° Celcius", "Temperatura Convertida", 1);
		}
	}
	
}
