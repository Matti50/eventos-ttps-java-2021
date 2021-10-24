package eventos;

import javax.persistence.*;

@Entity
@Table(name = "tipo_evento")
public class TipoEvento {
	public TipoEvento(String descripcion) {
		super();
		this.descripcion = descripcion;
	}
	
	public TipoEvento() {}
	
	@Id
	@Column(name = "tipo_evento_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	private String descripcion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
