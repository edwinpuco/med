package entidad;

import entidad.Establecimiento;
import entidad.Paciente;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-08T15:32:32")
@StaticMetamodel(Direccion.class)
public class Direccion_ { 

    public static volatile SingularAttribute<Direccion, Integer> iddireccion;
    public static volatile SingularAttribute<Direccion, Establecimiento> idestablecimiento;
    public static volatile SingularAttribute<Direccion, String> direccion;
    public static volatile CollectionAttribute<Direccion, Paciente> pacienteCollection;

}