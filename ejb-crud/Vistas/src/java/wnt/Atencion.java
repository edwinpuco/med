/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wnt;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author edwin
 */
@Entity
@Table(name = "atencion")
@NamedQueries({
    @NamedQuery(name = "Atencion.findAll", query = "SELECT a FROM Atencion a")})
public class Atencion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AtencionPK atencionPK;
    @Column(name = "precio")
    private Integer precio;
    @Column(name = "numeroconsultorio")
    private Integer numeroconsultorio;
    

    public Atencion() {
    }

    public Atencion(AtencionPK atencionPK) {
        this.atencionPK = atencionPK;
    }

    public Atencion(int idhorario, int idestablecimiento, int idmedico) {
        this.atencionPK = new AtencionPK(idhorario, idestablecimiento, idmedico);
    }

    public AtencionPK getAtencionPK() {
        return atencionPK;
    }

    public void setAtencionPK(AtencionPK atencionPK) {
        this.atencionPK = atencionPK;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getNumeroconsultorio() {
        return numeroconsultorio;
    }

    public void setNumeroconsultorio(Integer numeroconsultorio) {
        this.numeroconsultorio = numeroconsultorio;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (atencionPK != null ? atencionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Atencion)) {
            return false;
        }
        Atencion other = (Atencion) object;
        if ((this.atencionPK == null && other.atencionPK != null) || (this.atencionPK != null && !this.atencionPK.equals(other.atencionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "wnt.Atencion[ atencionPK=" + atencionPK + " ]";
    }
    
}
