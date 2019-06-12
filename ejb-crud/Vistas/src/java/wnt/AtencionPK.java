/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wnt;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author edwin
 */
@Embeddable
public class AtencionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idhorario")
    private int idhorario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idestablecimiento")
    private int idestablecimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmedico")
    private int idmedico;

    public AtencionPK() {
    }

    public AtencionPK(int idhorario, int idestablecimiento, int idmedico) {
        this.idhorario = idhorario;
        this.idestablecimiento = idestablecimiento;
        this.idmedico = idmedico;
    }

    public int getIdhorario() {
        return idhorario;
    }

    public void setIdhorario(int idhorario) {
        this.idhorario = idhorario;
    }

    public int getIdestablecimiento() {
        return idestablecimiento;
    }

    public void setIdestablecimiento(int idestablecimiento) {
        this.idestablecimiento = idestablecimiento;
    }

    public int getIdmedico() {
        return idmedico;
    }

    public void setIdmedico(int idmedico) {
        this.idmedico = idmedico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idhorario;
        hash += (int) idestablecimiento;
        hash += (int) idmedico;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AtencionPK)) {
            return false;
        }
        AtencionPK other = (AtencionPK) object;
        if (this.idhorario != other.idhorario) {
            return false;
        }
        if (this.idestablecimiento != other.idestablecimiento) {
            return false;
        }
        if (this.idmedico != other.idmedico) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "wnt.AtencionPK[ idhorario=" + idhorario + ", idestablecimiento=" + idestablecimiento + ", idmedico=" + idmedico + " ]";
    }
    
}
