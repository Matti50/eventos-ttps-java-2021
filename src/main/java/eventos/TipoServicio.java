package eventos;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_servicio")
public class TipoServicio {
	public TipoServicio(String descripcion) {
		super();
		this.descripcion = descripcion;
	}
	
	public TipoServicio() {}
	
	@Id
	@Column(name = "tipo_servicio_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	

	private String descripcion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}
}
