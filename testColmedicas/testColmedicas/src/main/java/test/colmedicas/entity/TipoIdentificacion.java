package test.colmedicas.entity;
import jakarta.persistence.*;


@Entity
@Table(name = "tiposidentificacion")
public class TipoIdentificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "codigotipoidentificacion")
    private String codigotipoidentificacion;

    @Column(name = "descripcion")
    private String descripcion;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCodigotipoidentificacion() {
		return codigotipoidentificacion;
	}

	public void setCodigotipoidentificacion(String codigotipoidentificacion) {
		this.codigotipoidentificacion = codigotipoidentificacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



}