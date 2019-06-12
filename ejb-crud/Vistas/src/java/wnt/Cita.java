/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wnt;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author edwin
 */
@Entity
@Table(name = "cita")
@NamedQueries({
    @NamedQuery(name = "Cita.findAll", query = "SELECT c FROM Cita c")})
public class Cita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcita")
    private Integer idcita;
    @Column(name = "fechagenerada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechagenerada;
    @Column(name = "fechacita")
    @Temporal(TemporalType.DATE)
    private Date fechacita;
    @Column(name = "horacita")
    @Temporal(TemporalType.TIME)
    private Date horacita;
    @Column(name = "estadocita")
    private Integer estadocita;
    @Column(name = "calificacioncita")
    private Integer calificacioncita;
    @Column(name = "confirmacioncita")
    private Integer confirmacioncita;
    

    public Cita() {
    }

    public Cita(Integer idcita) {
        this.idcita = idcita;
    }

    public Integer getIdcita() {
        return idcita;
    }

    public void setIdcita(Integer idcita) {
        this.idcita = idcita;
    }

    public Date getFechagenerada() {
        return fechagenerada;
    }

    public void setFechagenerada(Date fechagenerada) {
        this.fechagenerada = fechagenerada;
    }

    public Date getFechacita() {
        return fechacita;
    }

    public void setFechacita(Date fechacita) {
        this.fechacita = fechacita;
    }

    public Date getHoracita() {
        return horacita;
    }

    public void setHoracita(Date horacita) {
        this.horacita = horacita;
    }

    public Integer getEstadocita() {
        return estadocita;
    }

    public void setEstadocita(Integer estadocita) {
        this.estadocita = estadocita;
    }

    public Integer getCalificacioncita() {
        return calificacioncita;
    }

    public void setCalificacioncita(Integer calificacioncita) {
        this.calificacioncita = calificacioncita;
    }

    public Integer getConfirmacioncita() {
        return confirmacioncita;
    }

    public void setConfirmacioncita(Integer confirmacioncita) {
        this.confirmacioncita = confirmacioncita;
    }

   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcita != null ? idcita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cita)) {
            return false;
        }
        Cita other = (Cita) object;
        if ((this.idcita == null && other.idcita != null) || (this.idcita != null && !this.idcita.equals(other.idcita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "wnt.Cita[ idcita=" + idcita + " ]";
    }
    
}
