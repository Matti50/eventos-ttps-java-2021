package eventos;

import java.util.List;

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
	
	
	//navigationProperties
	@OneToMany(mappedBy="tipo_evento")
	private List<Evento> eventos;
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}
	
	@Column(nullable=false)
	private String descripcion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
