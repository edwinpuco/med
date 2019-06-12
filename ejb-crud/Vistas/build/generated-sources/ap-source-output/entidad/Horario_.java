package entidad;

import entidad.Atencion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-08T15:32:32")
@StaticMetamodel(Horario.class)
public class Horario_ { 

    public static volatile SingularAttribute<Horario, Date> horafin;
    public static volatile CollectionAttribute<Horario, Atencion> atencionCollection;
    public static volatile SingularAttribute<Horario, Integer> idhorario;
    public static volatile SingularAttribute<Horario, Date> horainicio;
    public static volatile SingularAttribute<Horario, String> dia;

}