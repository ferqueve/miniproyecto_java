package clases;

import java.util.Date;

public class Persona {
	//Atributos de nuestro objeto Persona
	private int cedula;
	private String nombre;
	private String apellido;
	private String sexo;
	private int telefono;
	private String direccion;
	private String fechaNacimiento;
	
	//Metodo constructor para acceder a construir nuestro objeto Persona
	public Persona(int cedula, String nombre, String apellido, String sexo, int telefono, String direccion,
			String fechaNacimiento) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.telefono = telefono;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	//Metodos getters y setters para obtener y establecer los atributos
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}

