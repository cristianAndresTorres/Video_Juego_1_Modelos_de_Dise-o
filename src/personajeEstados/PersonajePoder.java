package personajeEstados;

import java.awt.Graphics;
import java.awt.Image;

import partesPersonaje.CodigoElemtoJuego;
import plantillas.PlantillaCreacionImagenes;

public class PersonajePoder{
	//Atributos
	private String nombrePoder;
	private int iteradorPoder=0;
	private CodigoElemtoJuego datosHabilidad;
	private PlantillaCreacionImagenes plantillaPoder;
	
	//Constructor
	public PersonajePoder(CodigoElemtoJuego datosHabilidad) {
		this.datosHabilidad = datosHabilidad;
		this.plantillaPoder = datosHabilidad.plantillaImagen();
		
	}
	public void iterarImagen() {
		plantillaPoder.numImg = "";
		plantillaPoder.numImg = ""+iteradorPoder;
		iteradorPoder ++;
		if(iteradorPoder == 3) {
			iteradorPoder=0;
		}
		
	}
	
	public Image retornarPoder(){
		this.iterarImagen();
		return plantillaPoder.getImagenMov2();
	}
}
