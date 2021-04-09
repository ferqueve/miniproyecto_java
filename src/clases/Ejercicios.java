package clases;

import java.util.Date;

public class Ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Persona pepe = new Persona();
		pepe.setNombre("Charruas");
		pepe.setApellido("Rodriguez");
		pepe.setCedula(11111111);
		pepe.setDireccion("Direccion 123");
		pepe.setFechaNacimiento("26/04/1994");
		pepe.setApellido("Indefinido");
		
		System.out.println(pepe.getApellido());
		
	}

}
