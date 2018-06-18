package loom.hola_mundo;

public class HolaMundo {

	/**
	 * Metodo para saludar
	 * @param persona Nombre de la persona a la que se saludará
	 * @return saludo.
	 */
	
    public String saludar(final String persona) {
        if(persona.isEmpty())
        	return "¡Hola!";
        return "¡Hola, "+persona+"!";
    }
}
