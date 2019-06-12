package controller;

import wnt.Especialidad;
import facade.EspecialidadFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "especialidadController")
@ViewScoped
public class EspecialidadController extends AbstractController<Especialidad> {

    @Inject
    private MobilePageController mobilePageController;

    public EspecialidadController() {
        // Inform the Abstract parent controller of the concrete Especialidad Entity
        super(Especialidad.class);
    }

}
