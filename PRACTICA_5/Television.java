package PRACTICA_5;

public class Television extends Eletrodomestico{
	private final int resolucion_DEFECTO=20;
	private final boolean sintonizadorTDT_DEFECTO=false; 
	
	private int resolucion;
	private boolean sintonizadorTDT;
	
	public Television() {
		super();
		this.resolucion=resolucion_DEFECTO;
		this.sintonizadorTDT=sintonizadorTDT_DEFECTO;
	}
	
	public Television(int precioBase, int peso) {
		super(precioBase, peso);
		this.resolucion=resolucion_DEFECTO;
		this.sintonizadorTDT=sintonizadorTDT_DEFECTO;
	}
	
	public Television(int precioBase, String color, String consumoEnergetico, int peso, int resolucion, boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion=resolucion;
		this.sintonizadorTDT=sintonizadorTDT;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	

	@Override
	public double precioFinal() {
		double precioFiTel=super.precioFinal();
		int precioSintonizador=(sintonizadorTDT)?50:0;
		double precioResolucion=(resolucion>=40)?precioFiTel+(precioFiTel*0.30):precioFiTel;
		
		return precioResolucion+precioSintonizador;
	}
	
}
