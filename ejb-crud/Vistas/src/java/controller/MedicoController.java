package controller;

import wnt.Medico;
import facade.MedicoFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "medicoController")
@ViewScoped
public class MedicoController extends AbstractController<Medico> {

    @Inject
    private MobilePageController mobilePageController;

    public MedicoController() {
        // Inform the Abstract parent controller of the concrete Medico Entity
        super(Medico.class);
    }

}
