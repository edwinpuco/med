package controller;

import wnt.Establecimiento;
import facade.EstablecimientoFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "establecimientoController")
@ViewScoped
public class EstablecimientoController extends AbstractController<Establecimiento> {

    @Inject
    private MobilePageController mobilePageController;

    public EstablecimientoController() {
        // Inform the Abstract parent controller of the concrete Establecimiento Entity
        super(Establecimiento.class);
    }

}
