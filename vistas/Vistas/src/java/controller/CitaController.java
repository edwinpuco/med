package controller;

import wnt.Cita;
import facade.CitaFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "citaController")
@ViewScoped
public class CitaController extends AbstractController<Cita> {

    @Inject
    private MobilePageController mobilePageController;

    public CitaController() {
        // Inform the Abstract parent controller of the concrete Cita Entity
        super(Cita.class);
    }

}
