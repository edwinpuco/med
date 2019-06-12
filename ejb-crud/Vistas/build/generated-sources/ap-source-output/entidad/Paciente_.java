package entidad;

import entidad.Cita;
import entidad.Direccion;
import entidad.Persona;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-08T15:32:32")
@StaticMetamodel(Paciente.class)
public class Paciente_ { 

    public static volatile CollectionAttribute<Paciente, Cita> citaCollection;
    public static volatile SingularAttribute<Paciente, Date> fechanacimiento;
    public static volatile SingularAttribute<Paciente, Integer> citacancelada;
    public static volatile SingularAttribute<Paciente, Persona> idpersona;
    public static volatile SingularAttribute<Paciente, Integer> citarealizada;
    public static volatile CollectionAttribute<Paciente, Direccion> direccionCollection;
    public static volatile SingularAttribute<Paciente, Integer> idpaciente;

}