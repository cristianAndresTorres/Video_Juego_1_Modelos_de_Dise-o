package partesPersonaje;

import java.awt.Image;

import plantillas.PlantillaCreacionImagenes;

public abstract class CodigoElemtoJuego {
	//Atributos
	protected String codigoUbicacion;
	protected String elementoCategoria;
	protected PlantillaCreacionImagenes miPlanImg;
	
	public void asignarCodigo(String codigo) {
		this.codigoUbicacion = codigo;
	}
	public String retornarCodigo() {
		return codigoUbicacion;	
	}
	
	public  String getElementoCategoria() {
		return elementoCategoria;
	}
	
	public PlantillaCreacionImagenes plantillaImagen() {
		return miPlanImg;
	}
	
	public abstract Image retornarImagen();
	
	

}
