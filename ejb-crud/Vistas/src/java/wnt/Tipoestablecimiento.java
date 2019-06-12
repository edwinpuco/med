/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wnt;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "tipoestablecimiento")
@NamedQueries({
    @NamedQuery(name = "Tipoestablecimiento.findAll", query = "SELECT t FROM Tipoestablecimiento t")})
public class Tipoestablecimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipoestablecimiento")
    private Integer idtipoestablecimiento;
    @Size(max = 11)
    @Column(name = "tipoestablecimiento")
    private String tipoestablecimiento;

    public Tipoestablecimiento() {
    }

    public Tipoestablecimiento(Integer idtipoestablecimiento) {
        this.idtipoestablecimiento = idtipoestablecimiento;
    }

    public Integer getIdtipoestablecimiento() {
        return idtipoestablecimiento;
    }

    public void setIdtipoestablecimiento(Integer idtipoestablecimiento) {
        this.idtipoestablecimiento = idtipoestablecimiento;
    }

    public String getTipoestablecimiento() {
        return tipoestablecimiento;
    }

    public void setTipoestablecimiento(String tipoestablecimiento) {
        this.tipoestablecimiento = tipoestablecimiento;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoestablecimiento != null ? idtipoestablecimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoestablecimiento)) {
            return false;
        }
        Tipoestablecimiento other = (Tipoestablecimiento) object;
        if ((this.idtipoestablecimiento == null && other.idtipoestablecimiento != null) || (this.idtipoestablecimiento != null && !this.idtipoestablecimiento.equals(other.idtipoestablecimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "wnt.Tipoestablecimiento[ idtipoestablecimiento=" + idtipoestablecimiento + " ]";
    }
    
}
