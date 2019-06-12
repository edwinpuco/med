package entidad;

import entidad.Medico;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-08T15:32:32")
@StaticMetamodel(Especialidad.class)
public class Especialidad_ { 

    public static volatile CollectionAttribute<Especialidad, Medico> medicoCollection;
    public static volatile SingularAttribute<Especialidad, Integer> idespecialidad;
    public static volatile SingularAttribute<Especialidad, String> nombreespecialidad;

}