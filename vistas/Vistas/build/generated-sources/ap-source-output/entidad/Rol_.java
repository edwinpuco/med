package entidad;

import entidad.Persona;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-08T15:32:32")
@StaticMetamodel(Rol.class)
public class Rol_ { 

    public static volatile SingularAttribute<Rol, Integer> idrol;
    public static volatile CollectionAttribute<Rol, Persona> personaCollection;
    public static volatile SingularAttribute<Rol, String> nombrerol;

}