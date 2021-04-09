package clases;

public class Socio {
	
	private int cedula;
	private int frecuencia;
	private boolean competidor;
	private int antiguedad;
	private String fechaUltimaCuota;
	private String fechaFichaMedica;
	
	public Socio(int cedula, int frecuencia, boolean competidor, int antiguedad, String fechaUltimaCuota,
			String fechaFichaMedica) {
		super();
		this.cedula = cedula;
		this.frecuencia = frecuencia;
		this.competidor = competidor;
		this.antiguedad = antiguedad;
		this.fechaUltimaCuota = fechaUltimaCuota;
		this.fechaFichaMedica = fechaFichaMedica;
	}
	
	public Socio() {
		
	}
	
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public int getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}
	public boolean isCompetidor() {
		return competidor;
	}
	public void setCompetidor(boolean competidor) {
		this.competidor = competidor;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public String getFechaUltimaCuota() {
		return fechaUltimaCuota;
	}
	public void setFechaUltimaCuota(String fechaUltimaCuota) {
		this.fechaUltimaCuota = fechaUltimaCuota;
	}
	public String getFechaFichaMedica() {
		return fechaFichaMedica;
	}
	public void setFechaFichaMedica(String fechaFichaMedica) {
		this.fechaFichaMedica = fechaFichaMedica;
	}
	


	
	
}
