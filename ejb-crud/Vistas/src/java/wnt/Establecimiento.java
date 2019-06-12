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
@Table(name = "establecimiento")
@NamedQueries({
    @NamedQuery(name = "Establecimiento.findAll", query = "SELECT e FROM Establecimiento e")})
public class Establecimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idestablecimiento")
    private Integer idestablecimiento;
    @Size(max = 100)
    @Column(name = "nombreestablecimiento")
    private String nombreestablecimiento;
    @Size(max = 10)
    @Column(name = "telefonoestablecimiento")
    private String telefonoestablecimiento;
    
    public Establecimiento() {
    }

    public Establecimiento(Integer idestablecimiento) {
        this.idestablecimiento = idestablecimiento;
    }

    public Integer getIdestablecimiento() {
        return idestablecimiento;
    }

    public void setIdestablecimiento(Integer idestablecimiento) {
        this.idestablecimiento = idestablecimiento;
    }

    public String getNombreestablecimiento() {
        return nombreestablecimiento;
    }

    public void setNombreestablecimiento(String nombreestablecimiento) {
        this.nombreestablecimiento = nombreestablecimiento;
    }

    public String getTelefonoestablecimiento() {
        return telefonoestablecimiento;
    }

    public void setTelefonoestablecimiento(String telefonoestablecimiento) {
        this.telefonoestablecimiento = telefonoestablecimiento;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestablecimiento != null ? idestablecimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Establecimiento)) {
            return false;
        }
        Establecimiento other = (Establecimiento) object;
        if ((this.idestablecimiento == null && other.idestablecimiento != null) || (this.idestablecimiento != null && !this.idestablecimiento.equals(other.idestablecimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "wnt.Establecimiento[ idestablecimiento=" + idestablecimiento + " ]";
    }
    
}
