package PersonajeObervadoresRecolectores;

import java.awt.Graphics;

import partesPersonaje.CodigoElemtoJuego;
import personajeCompleto.PersonajeAnimado;

public interface ObservadorRecolector {
	public void notificar(PersonajeAnimado personajeActual, CodigoElemtoJuego codigoAgrega);
	public PersonajeAnimado retornarNuevoEstado();
}
