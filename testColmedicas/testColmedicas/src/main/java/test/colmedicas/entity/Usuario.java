package test.colmedicas.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "tipodocumentoid", referencedColumnName = "id")
    private TipoIdentificacion tipoidentificacion;

    @Column(name = "numerodocumento")
    private String numerodocumento;

    @Column(name = "fechanacimiento")
    private Date fechanacimiento;

    @Column(name = "primernombre")
    private String primernombre;

    @Column(name = "segundonombre")
    private String segundonombre;

    @Column(name = "primerapellido")
    private String primerapellido;

    @Column(name = "segundoapellido")
    private String segundoapellido;

    @Column(name = "direccionresidencia")
    private String direccionresidencia;

    @Column(name = "numerocelular")
    private String numerocelular;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "planid", referencedColumnName = "id")
    private Plan plan;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public TipoIdentificacion getTipoidentificacion() {
		return tipoidentificacion;
	}

	public void setTipoidentificacion(TipoIdentificacion tipoidentificacion) {
		this.tipoidentificacion = tipoidentificacion;
	}

	public String getNumerodocumento() {
		return numerodocumento;
	}

	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}

	public Date getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getPrimernombre() {
		return primernombre;
	}

	public void setPrimernombre(String primernombre) {
		this.primernombre = primernombre;
	}

	public String getSegundonombre() {
		return segundonombre;
	}

	public void setSegundonombre(String segundonombre) {
		this.segundonombre = segundonombre;
	}

	public String getPrimerapellido() {
		return primerapellido;
	}

	public void setPrimerapellido(String primerapellido) {
		this.primerapellido = primerapellido;
	}

	public String getSegundoapellido() {
		return segundoapellido;
	}

	public void setSegundoapellido(String segundoapellido) {
		this.segundoapellido = segundoapellido;
	}

	public String getDireccionresidencia() {
		return direccionresidencia;
	}

	public void setDireccionresidencia(String direccionresidencia) {
		this.direccionresidencia = direccionresidencia;
	}

	public String getNumerocelular() {
		return numerocelular;
	}

	public void setNumerocelular(String numerocelular) {
		this.numerocelular = numerocelular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}
   
}