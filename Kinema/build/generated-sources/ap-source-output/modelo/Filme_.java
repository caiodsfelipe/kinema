package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Distribuidora;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-23T09:34:03")
@StaticMetamodel(Filme.class)
public class Filme_ { 

    public static volatile SingularAttribute<Filme, Integer> dias_em_cartaz;
    public static volatile SingularAttribute<Filme, Date> lancamento;
    public static volatile SingularAttribute<Filme, String> genero;
    public static volatile SingularAttribute<Filme, Integer> idFilme;
    public static volatile SingularAttribute<Filme, String> nome;
    public static volatile SingularAttribute<Filme, Distribuidora> idDistribuidora;

}