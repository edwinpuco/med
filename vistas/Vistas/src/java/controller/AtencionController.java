package controller;

import wnt.Atencion;
import facade.AtencionFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "atencionController")
@ViewScoped
public class AtencionController extends AbstractController<Atencion> {


    @Inject
    private MobilePageController mobilePageController;

    public AtencionController() {
        // Inform the Abstract parent controller of the concrete Atencion Entity
        super(Atencion.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setAtencionPK(new wnt.AtencionPK());
    }

}
