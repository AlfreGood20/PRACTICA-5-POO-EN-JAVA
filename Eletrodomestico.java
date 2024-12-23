package PRACTICA_5;
//CODE CREADO POR J.ALFREDO L.D.C
//SUPERCLASE SI
public class Eletrodomestico {
	private final String COLOR_DEFECTO="blanco";
	private final String CONSUMO_DEFECTO="F";
	private final int PRECIO_BASE_DEFECTO=100;
	private final int PESO_DEFECTO=5;
	
	//ATRIBUTOS
	private int precioBase;
	private String color;
	private String consumoEnergetico;
	private int peso;
	
	//CONSTRUCTOR POR DEFECTO
	public Eletrodomestico() {
		this.precioBase = PRECIO_BASE_DEFECTO;
		this.color = COLOR_DEFECTO;
		this.consumoEnergetico = CONSUMO_DEFECTO;
		this.peso = PESO_DEFECTO;
	}
	
	//CONSTRUCTOR CON EL PRECIO Y PESO. LO DEMAS POR DEFECTO
	public Eletrodomestico(int precioBase, int peso) {
		this.precioBase = precioBase;
		this.color = COLOR_DEFECTO;
		this.consumoEnergetico = CONSUMO_DEFECTO;
		this.peso = peso;
	}
	

	//CONSTRUCTOR CON TODOS LOS ATRIBUTOS
	public Eletrodomestico(int precioBase, String color, String consumoEnergetico, int peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}


	//GET PARA TODOS LOS ATRIBUTOS
	public int getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public String getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}
	
	//METODO PARA COMPROBAR SI LA LETRA INGRESADA ES CORRECTA
	private String comprobarConsumoEnergetico(String letra) {
		String [] letrasDisponible= {"A","B","C","D","E","F"};
		boolean encontrado=false;
		for(int i=0;i<letrasDisponible.length;i++) {
			if(letra.equals(letrasDisponible[i])) {
				encontrado=true;
				break;
			}
		}
		return(encontrado)?letra:CONSUMO_DEFECTO;
	}
	
	//METODO PARA COMPROBAR SI ESTA EL COLOR QUE INGRESO
	private String comprobarColor(String color) {
		String [] coloresDisponible= {"blanco","negro","rojo","azul","gris"};
		boolean encontrado=false;
		for(int i=0;i<coloresDisponible.length;i++) {
			if(color.equals(coloresDisponible[i])) {
				encontrado=true;
				break;
			}
		}
		return(encontrado)?color:COLOR_DEFECTO;
	}
	
	public double precioFinal() {
		int precioConsumo=(consumoEnergetico.equals("A")?100:
			(consumoEnergetico.equals("B")?80:
			(consumoEnergetico.equals("C")?60:
			(consumoEnergetico.equals("D")?50:
			(consumoEnergetico.equals("E")?30:10)))));
		
		int precioPeso=(peso>=0 && peso<=19)?10:
			(peso>=20 && peso<=49)?50:
			(peso>=50 && peso<=79)?80:100;
	
		return precioConsumo+precioPeso+precioBase;
	}
}