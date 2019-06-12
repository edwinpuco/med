package entidad;

import entidad.Atencion;
import entidad.Cita;
import entidad.Especialidad;
import entidad.Persona;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-08T15:32:32")
@StaticMetamodel(Medico.class)
public class Medico_ { 

    public static volatile SingularAttribute<Medico, Integer> tiempoatencion;
    public static volatile CollectionAttribute<Medico, Cita> citaCollection;
    public static volatile CollectionAttribute<Medico, Atencion> atencionCollection;
    public static volatile SingularAttribute<Medico, Integer> calificacionmedico;
    public static volatile SingularAttribute<Medico, Persona> idpersona;
    public static volatile SingularAttribute<Medico, Especialidad> idespecialidad;
    public static volatile SingularAttribute<Medico, Integer> idmedico;
    public static volatile SingularAttribute<Medico, String> fichamedica;

}