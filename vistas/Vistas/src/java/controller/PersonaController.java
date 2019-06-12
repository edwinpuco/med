package controller;

import wnt.Persona;
import facade.PersonaFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "personaController")
@ViewScoped
public class PersonaController extends AbstractController<Persona> {

    @Inject
    private MobilePageController mobilePageController;

    public PersonaController() {
        // Inform the Abstract parent controller of the concrete Persona Entity
        super(Persona.class);
    }

}
