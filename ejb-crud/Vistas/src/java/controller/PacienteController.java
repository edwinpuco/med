package controller;

import wnt.Paciente;
import facade.PacienteFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "pacienteController")
@ViewScoped
public class PacienteController extends AbstractController<Paciente> {

    @Inject
    private MobilePageController mobilePageController;

    public PacienteController() {
        // Inform the Abstract parent controller of the concrete Paciente Entity
        super(Paciente.class);
    }

}
