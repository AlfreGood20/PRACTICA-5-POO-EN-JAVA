package PRACTICA_5;

public class Principal {

	public static void main(String[] args) {
		//CREAMOS EL ARRAY DE 10 DE LONGITUD
		Eletrodomestico[] listaElectrodomesticos=new Eletrodomestico[10];
		
		//HACEMOS OBEJTOS Y RELLENAMO EL ARRAY
		listaElectrodomesticos[0]=new Eletrodomestico(200,"verde","C",60); //1
        listaElectrodomesticos[1]=new Lavadora(150, 30);
        listaElectrodomesticos[2]=new Television(500, "negro","E",42,80,false);
        listaElectrodomesticos[3]=new Eletrodomestico();  //2
        listaElectrodomesticos[4]=new Eletrodomestico(600,"gris","D",20);  //3
        listaElectrodomesticos[5]=new Lavadora(300,"blanco","Z",40, 40);
        listaElectrodomesticos[6]=new Television(250, 70);
        listaElectrodomesticos[7]=new Lavadora(400,"verde","A",100,15);
        listaElectrodomesticos[8]=new Television(200,"naranja", "C", 30,60,true);
        listaElectrodomesticos[9]=new Eletrodomestico(50, 10);  //4
		
        //HACEMOS VARIABLES O CONTADORES PARA LA SUMA DE LOS ELETRODOMESTICOS POR CADA OBJETO DIFERENTE
        double sumaEletrodomesticos=0;
        double sumaTeleviciones=0;
        double sumaLavadoras=0;
        
        for (int i = 0; i < listaElectrodomesticos.length; i++) {

            if (listaElectrodomesticos[i] instanceof Eletrodomestico) {
                sumaEletrodomesticos += listaElectrodomesticos[i].precioFinal();
            }

            
            if (listaElectrodomesticos[i] instanceof Lavadora) {
                sumaLavadoras += listaElectrodomesticos[i].precioFinal();
            }

            
            if (listaElectrodomesticos[i] instanceof Television) {
                sumaTeleviciones += listaElectrodomesticos[i].precioFinal();
            }
        }
 
        //MOSTRAR LA SUMA DE CADA CLASE Y CADA OBJETO
        System.out.println("La suma del precio de los electrodomésticos: " + sumaEletrodomesticos);
        System.out.println("La suma del precio de las televisiones: " + sumaTeleviciones);
        System.out.println("La suma del precio de las lavadoras: " + sumaLavadoras);
        	
	}
}