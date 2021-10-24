package eventos;

public class FormaDePago {
	public FormaDePago(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	String descripcion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
