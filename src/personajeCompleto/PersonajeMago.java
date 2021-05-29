package personajeCompleto;

import java.awt.Image;

import personajeOrdenarConstruccion.BuilderMago;
import personajeOrdenarConstruccion.BuilderRecolector;
import personajeOrdenarConstruccion.Director;

public class PersonajeMago extends PersonajeAnimado {
	//Constructor
	public PersonajeMago() {
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
		PersonajeAnimado miClonMago;
        //Se Determinan las partes del Mago
        Director miDirector = new Director();
        BuilderMago miBuilderRecolector = new BuilderMago();
        
        miDirector.construir(miBuilderRecolector);
        //Se instancia el objeto para que sea Mago
        miClonMago = miBuilderRecolector.obtenerPerAnimado();
        //Metodos que reciben parametros
		return miClonMago;
	}

	@Override
	public Image imgPersonaje() {
		this.realizarAccion();
		return imgPerAni.getImagenMov2();
	}

	@Override
	public void asignarDatos() {
		this.oficio = "Mago";
		this.imgPerAni.setNombreImg(oficio);
	}

}
