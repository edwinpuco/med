package entidad;

import entidad.Atencion;
import entidad.Medico;
import entidad.Paciente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-08T15:32:32")
@StaticMetamodel(Cita.class)
public class Cita_ { 

    public static volatile SingularAttribute<Cita, Date> fechacita;
    public static volatile SingularAttribute<Cita, Integer> idcita;
    public static volatile SingularAttribute<Cita, Date> horacita;
    public static volatile SingularAttribute<Cita, Integer> estadocita;
    public static volatile SingularAttribute<Cita, Date> fechagenerada;
    public static volatile SingularAttribute<Cita, Integer> confirmacioncita;
    public static volatile SingularAttribute<Cita, Integer> calificacioncita;
    public static volatile SingularAttribute<Cita, Atencion> atencion;
    public static volatile SingularAttribute<Cita, Medico> idmedico;
    public static volatile SingularAttribute<Cita, Paciente> idpaciente;

}