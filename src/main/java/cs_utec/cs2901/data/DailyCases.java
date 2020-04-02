package cs_utec.cs2901.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import java.io.Serializable;

import java.util.Date;

@Entity
public class DailyCases implements Serializable { // esta clase puede ser serialziable (convertida a JSON)

	@Id
	private long id;

	@Column
	private Integer cantidad;

	@Column
	private Date fecha;

	public DailyCases(Long id, Integer cantidad, Date fecha) {
		this.id = id;
		this.cantidad = cantidad;
		this.fecha = fecha;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}