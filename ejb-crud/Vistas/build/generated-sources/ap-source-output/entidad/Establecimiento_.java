package entidad;

import entidad.Atencion;
import entidad.Direccion;
import entidad.Tipoestablecimiento;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-08T15:32:32")
@StaticMetamodel(Establecimiento.class)
public class Establecimiento_ { 

    public static volatile SingularAttribute<Establecimiento, Integer> idestablecimiento;
    public static volatile SingularAttribute<Establecimiento, String> telefonoestablecimiento;
    public static volatile SingularAttribute<Establecimiento, String> nombreestablecimiento;
    public static volatile SingularAttribute<Establecimiento, Tipoestablecimiento> idtipoestablecimiento;
    public static volatile CollectionAttribute<Establecimiento, Atencion> atencionCollection;
    public static volatile CollectionAttribute<Establecimiento, Direccion> direccionCollection;

}