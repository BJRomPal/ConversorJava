import javax.swing.JOptionPane;

public class ConversorPesos {

	private double numero;
	
	public ConversorPesos(double numero) {
		this.numero = numero;
	}
	
	public double mgAGramo() {
		return this.numero / 1000;
	}
	
	public double mgAKilo() {
		return this.numero / 1000000;
	}
	
	public double gramoAMg() {
		return this.numero * 1000;
	}
	
	public double gramoAKilo() {
		return this.numero / 1000;
	}
	
	public double gramoALibra () {
		return this.numero / 453.59;
	}
	
	public double kiloATon () {
		return this.numero / 1000;
	}
	
	public double kiloAMg () {
		return this.numero * 1000000;
	}
	
	public double kiloAGramo() {
		return this.numero * 1000;
	}
	
	
	public double kiloALibra() {
		return this.numero * 2.2046;
	}
	
	public double libraAKilo() {
		return this.numero / 2.2046;
	}
	
	public double libraAGramo () {
		return this.numero * 453.59;
	}
	
	public double tonAKilo() {
		return this.numero * 1000;
	}
	
	
	
	public void conversion () {
		String peso1;
		String peso2;
		double convertido;
		
		String peso = (JOptionPane.showInputDialog(null, "Seleccione que tipo de conversion desea hacer", 
				"Tipo de Conversor", JOptionPane.PLAIN_MESSAGE, null, new Object[] 
				{"Miligramo a Gramo", "Miligramo a Kilo", "Gramo a Miligramo", "Gramo a Kilo", "Gramo a Libra",  
						"Kilo a Miligramo", "Kilo a Gramo", "Kilo a Libra", "Kilo a Tonelada", "Libra a Gramo",
						"Libra a Kilogramo", "Tonelada a Kilo"}, "Miligramo a Gramo")).toString();
		if (peso == "Miligramo a Gramo") {
			peso1 = "Miligramos";
			peso2 = "Gramos";
			convertido = Math.round(mgAGramo() * 100.0) / 100.0;
			String mensaje = this.numero + " " + peso1 + " equivalen a " + convertido + " " + peso2;
			JOptionPane.showMessageDialog(null, mensaje, "Conversion efectuada", 1);
		}else if (peso == "Miligramo a Kilo") {
			peso1 = "Miligramos";
			peso2 = "Kilos";
			convertido = Math.round(mgAKilo() * 100.0) / 100.0;
			String mensaje = this.numero + " " + peso1 + " equivalen a " + convertido + " " + peso2;
			JOptionPane.showMessageDialog(null, mensaje, "Conversion efectuada", 1);
		}else if (peso == "Gramo a Kilo") {
			peso1 = "Gramos";
			peso2 = "Kilos";
			convertido = Math.round(gramoAKilo() * 100.0) / 100.0;
			String mensaje = this.numero + " " + peso1 + " equivalen a " + convertido + " " + peso2;
			JOptionPane.showMessageDialog(null, mensaje, "Conversion efectuada", 1);
		}else if (peso == "Gramo a Libra") {
			peso1 = "Gramos";
			peso2 = "Libras";
			convertido = Math.round(gramoALibra() * 100.0) / 100.0;
			String mensaje = this.numero + " " + peso1 + " equivalen a " + convertido + " " + peso2;
			JOptionPane.showMessageDialog(null, mensaje, "Conversion efectuada", 1);
		}else if (peso == "Gramo a Miligramo") {
			peso1 = "Gramos";
			peso2 = "Miligramos";
			convertido = Math.round(gramoAMg() * 100.0) / 100.0;
			String mensaje = this.numero + " " + peso1 + " equivalen a " + convertido + " " + peso2;
			JOptionPane.showMessageDialog(null, mensaje, "Conversion efectuada", 1);
		}else if (peso == "Kilo a Miligramo") {
			peso1 = "Kilos";
			peso2 = "Miligramos";
			convertido = Math.round(kiloAGramo() * 100.0) / 100.0;
			String mensaje = this.numero + " " + peso1 + " equivalen a " + convertido + " " + peso2;
			JOptionPane.showMessageDialog(null, mensaje, "Conversion efectuada", 1);
		}else if (peso == "Kilo a Gramo") {
			peso1 = "Kilos";
			peso2 = "Gramos";
			convertido = Math.round(kiloAGramo() * 100.0) / 100.0;
			String mensaje = this.numero + " " + peso1 + " equivalen a " + convertido + " " + peso2;
			JOptionPane.showMessageDialog(null, mensaje, "Conversion efectuada", 1);
		}else if (peso == "Kilo a Libra") {
			peso1 = "Kilos";
			peso2 = "Libras";
			convertido = Math.round(kiloALibra() * 100.0) / 100.0;
			String mensaje = this.numero + " " + peso1 + " equivalen a " + convertido + " " + peso2;
			JOptionPane.showMessageDialog(null, mensaje, "Conversion efectuada", 1);
		}else if (peso == "Kilo a Tonelada") {
			peso1 = "Kilos";
			peso2 = "Toneladas";
			convertido = Math.round(kiloATon() * 100.0) / 100.0;
			String mensaje = this.numero + " " + peso1 + " equivalen a " + convertido + " " + peso2;
			JOptionPane.showMessageDialog(null, mensaje, "Conversion efectuada", 1);
		}else if (peso == "Libra a Gramo") {
			peso1 = "Libras";
			peso2 = "Gramos";
			convertido = Math.round(libraAGramo() * 100.0) / 100.0;
			String mensaje = this.numero + " " + peso1 + " equivalen a " + convertido + " " + peso2;
			JOptionPane.showMessageDialog(null, mensaje, "Conversion efectuada", 1);
		}else if (peso == "Libra a Kilo") {
			peso1 = "Libras";
			peso2 = "Kilos";
			convertido = Math.round(libraAKilo() * 100.0) / 100.0;
			String mensaje = this.numero + " " + peso1 + " equivalen a " + convertido + " " + peso2;
			JOptionPane.showMessageDialog(null, mensaje, "Conversion efectuada", 1);
		}else if (peso == "Tonelada a Kilo") {
			peso1 = "Toneladas";
			peso2 = "Kilos";
			convertido = Math.round(tonAKilo() * 100.0) / 100.0;
			String mensaje = this.numero + " " + peso1 + " equivalen a " + convertido + " " + peso2;
			JOptionPane.showMessageDialog(null, mensaje, "Conversion efectuada", 1);
		}	
	}
}
