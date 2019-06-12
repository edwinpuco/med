/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import wnt.Tipoestablecimiento;

/**
 *
 * @author edwin
 */
@Stateless
public class TipoestablecimientoFacade extends AbstractFacade<Tipoestablecimiento> {

    @PersistenceContext(unitName = "VistasPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoestablecimientoFacade() {
        super(Tipoestablecimiento.class);
    }
    
}
