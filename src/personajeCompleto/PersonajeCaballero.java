package personajeCompleto;

import java.awt.Image;

import personajeOrdenarConstruccion.BuilderArquero;
import personajeOrdenarConstruccion.Director;

public class PersonajeCaballero extends PersonajeAnimado{
	//Constructor
	public PersonajeCaballero() {
	}
			
			
	@Override
	public void realizarAccion() {
		if(acumulador == 1) {
			imgPerAni.numImg = "1";
		}else {
			imgPerAni.numImg = "2";
			acumulador = 0;
		}
		acumulador ++;
	}

	@Override
	public void asignarDesplazamiento() {
		// TODO Auto-generated method stub	
	}

	@Override
	public PersonajeAnimado clonarPersonaje() {
			PersonajeAnimado miClonArquero;
		    //Se Determinan las partes del Mago
		    Director miDirector = new Director();
		    BuilderArquero miBuilderMago = new BuilderArquero();
		        
		    miDirector.construir(miBuilderMago);
		    //Se instancia el objeto para que sea Mago
		    miClonArquero = miBuilderMago.obtenerPerAnimado();
		    //Metodos que reciben parametros
		return miClonArquero;
	}

	@Override
	public Image imgPersonaje() {
			this.realizarAccion();
		return imgPerAni.getImagenMov2();
	}

	@Override
	public void asignarDatos() {
		this.oficio = "Caballero";
		this.imgPerAni.setNombreImg(oficio);
	}
}
