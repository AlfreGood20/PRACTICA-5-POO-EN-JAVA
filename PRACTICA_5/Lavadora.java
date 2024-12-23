package PRACTICA_5;

public class Lavadora extends Eletrodomestico{
	private final int CARGA_DEFECTO=5;
	private int carga;
	
	public Lavadora() {
		super();
		this.carga=CARGA_DEFECTO;
	}

	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		this.carga=CARGA_DEFECTO;
	}

	public Lavadora(int precioBase, String color, String consumoEnergetico, int peso,int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga=carga;
	}

	public int getCarga() {
		return carga;
	}
	
	//METODO PARA PRECIO FINAL
	@Override
	public double precioFinal() {
		double precioFiLa=super.precioFinal();
		return(carga>=30)?precioFiLa+50:precioFiLa;
	}
	
}