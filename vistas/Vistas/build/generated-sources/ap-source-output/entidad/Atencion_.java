package entidad;

import entidad.AtencionPK;
import entidad.Cita;
import entidad.Establecimiento;
import entidad.Horario;
import entidad.Medico;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-08T15:32:32")
@StaticMetamodel(Atencion.class)
public class Atencion_ { 

    public static volatile CollectionAttribute<Atencion, Cita> citaCollection;
    public static volatile SingularAttribute<Atencion, Integer> precio;
    public static volatile SingularAttribute<Atencion, Horario> horario;
    public static volatile SingularAttribute<Atencion, Establecimiento> establecimiento;
    public static volatile SingularAttribute<Atencion, Medico> medico;
    public static volatile SingularAttribute<Atencion, AtencionPK> atencionPK;
    public static volatile SingularAttribute<Atencion, Integer> numeroconsultorio;

}