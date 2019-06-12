package entidad;

import entidad.Medico;
import entidad.Paciente;
import entidad.Rol;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-08T15:32:32")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> clave;
    public static volatile SingularAttribute<Persona, Rol> idrol;
    public static volatile SingularAttribute<Persona, String> segundoapellido;
    public static volatile SingularAttribute<Persona, Integer> idpersona;
    public static volatile SingularAttribute<Persona, String> correo;
    public static volatile CollectionAttribute<Persona, Medico> medicoCollection;
    public static volatile SingularAttribute<Persona, String> primernombre;
    public static volatile SingularAttribute<Persona, String> celular;
    public static volatile SingularAttribute<Persona, String> primerapellido;
    public static volatile CollectionAttribute<Persona, Paciente> pacienteCollection;
    public static volatile SingularAttribute<Persona, String> segundonombre;

}