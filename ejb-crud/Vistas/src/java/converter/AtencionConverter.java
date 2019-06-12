package converter;

import wnt.Atencion;
import facade.AtencionFacade;
import controller.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.enterprise.inject.spi.CDI;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@FacesConverter(value = "atencionConverter")
public class AtencionConverter implements Converter {

    private AtencionFacade ejbFacade;

    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.getEjbFacade().find(getKey(value));
    }

    wnt.AtencionPK getKey(String value) {
        wnt.AtencionPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new wnt.AtencionPK();
        key.setIdhorario(Integer.parseInt(values[0]));
        key.setIdestablecimiento(Integer.parseInt(values[1]));
        key.setIdmedico(Integer.parseInt(values[2]));
        return key;
    }

    String getStringKey(wnt.AtencionPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getIdhorario());
        sb.append(SEPARATOR);
        sb.append(value.getIdestablecimiento());
        sb.append(SEPARATOR);
        sb.append(value.getIdmedico());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Atencion) {
            Atencion o = (Atencion) object;
            return getStringKey(o.getAtencionPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Atencion.class.getName()});
            return null;
        }
    }

    private AtencionFacade getEjbFacade() {
        this.ejbFacade = CDI.current().select(AtencionFacade.class).get();
        return this.ejbFacade;
    }
}
