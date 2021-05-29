package partesPersonaje;

import java.awt.Image;

import plantillas.PlantillaCreacionImagenes;

public class HerramientaArqueroDiamante extends HerramientaPersonaje{

	public HerramientaArqueroDiamante() {
		miPlanImg = new PlantillaCreacionImagenes();
		this.asignarDatorHerramienta();
	}
	@Override
	public void asignarDatorHerramienta() {
		//Atributos
		nombreHerramienta = "HerramientaArcoDiamante";
		categoriaHerramienta = "Arquero";
		dagno = 15;
		miPlanImg.setNombreImg(nombreHerramienta);
		elementoCategoria = categoriaHerramienta;
		
	}

	@Override
	public Image retornarImagen(){
		// TODO Auto-generated method stub
		return miPlanImg.getImagenMov2();
	}
	@Override
	public HerramientaPersonaje clonarHerramienta() {
		HerramientaPersonaje miClon = new HerramientaArqueroDiamante();
		return miClon;
	}

}
