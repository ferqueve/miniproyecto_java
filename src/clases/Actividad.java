package clases;

public class Actividad {
	
	private String nombre;
	private String dia;
	private String hora;
	private String lugar;
	private String sexo;
	private int edad;
	private String tipoCompetencia;
	
	public Actividad(String nombre, String dia, String hora, String lugar, String sexo, int edad,
			String tipoCompetencia) {
		super();
		this.nombre = nombre;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.sexo = sexo;
		this.edad = edad;
		this.tipoCompetencia = tipoCompetencia;
	}
	
	public Actividad() {
	
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getTipoCompetencia() {
		return tipoCompetencia;
	}
	public void setTipoCompetencia(String tipoCompetencia) {
		this.tipoCompetencia = tipoCompetencia;
	}
	
	
}
