package controller;

import wnt.Tipoestablecimiento;
import facade.TipoestablecimientoFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "tipoestablecimientoController")
@ViewScoped
public class TipoestablecimientoController extends AbstractController<Tipoestablecimiento> {

    @Inject
    private MobilePageController mobilePageController;

    public TipoestablecimientoController() {
        // Inform the Abstract parent controller of the concrete Tipoestablecimiento Entity
        super(Tipoestablecimiento.class);
    }

}
