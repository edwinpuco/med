package controller;

import wnt.Horario;
import facade.HorarioFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "horarioController")
@ViewScoped
public class HorarioController extends AbstractController<Horario> {

    @Inject
    private MobilePageController mobilePageController;

    public HorarioController() {
        // Inform the Abstract parent controller of the concrete Horario Entity
        super(Horario.class);
    }

}
