package eventos;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "forma_pago")
public class FormaDePago {
	public FormaDePago(String descripcion) {
		super();
		this.descripcion = descripcion;
	}
	
	public FormaDePago() {
		
	} 
	
	@Id
	@Column(name = "forma_pago_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private String descripcion;
	
	
	//navigation properties
	@OneToMany(mappedBy="formaDePago")
	private List<Evento> eventos;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	

}
