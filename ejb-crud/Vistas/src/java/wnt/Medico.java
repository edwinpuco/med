/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wnt;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author edwin
 */
@Entity
@Table(name = "medico")
@NamedQueries({
    @NamedQuery(name = "Medico.findAll", query = "SELECT m FROM Medico m")})
public class Medico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "tiempoatencion")
    private Integer tiempoatencion;
    @Column(name = "calificacionmedico")
    private Integer calificacionmedico;
    @Size(max = 200)
    @Column(name = "fichamedica")
    private String fichamedica;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmedico")
    private Integer idmedico;
    

    public Medico() {
    }

    public Medico(Integer idmedico) {
        this.idmedico = idmedico;
    }

    public Integer getTiempoatencion() {
        return tiempoatencion;
    }

    public void setTiempoatencion(Integer tiempoatencion) {
        this.tiempoatencion = tiempoatencion;
    }

    public Integer getCalificacionmedico() {
        return calificacionmedico;
    }

    public void setCalificacionmedico(Integer calificacionmedico) {
        this.calificacionmedico = calificacionmedico;
    }

    public String getFichamedica() {
        return fichamedica;
    }

    public void setFichamedica(String fichamedica) {
        this.fichamedica = fichamedica;
    }

    public Integer getIdmedico() {
        return idmedico;
    }

    public void setIdmedico(Integer idmedico) {
        this.idmedico = idmedico;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmedico != null ? idmedico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medico)) {
            return false;
        }
        Medico other = (Medico) object;
        if ((this.idmedico == null && other.idmedico != null) || (this.idmedico != null && !this.idmedico.equals(other.idmedico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "wnt.Medico[ idmedico=" + idmedico + " ]";
    }
    
}
