package controller;

import wnt.Direccion;
import facade.DireccionFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "direccionController")
@ViewScoped
public class DireccionController extends AbstractController<Direccion> {

    @Inject
    private MobilePageController mobilePageController;

    public DireccionController() {
        // Inform the Abstract parent controller of the concrete Direccion Entity
        super(Direccion.class);
    }

}
