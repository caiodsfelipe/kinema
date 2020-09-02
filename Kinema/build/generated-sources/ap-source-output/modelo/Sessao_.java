package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Filme;
import modelo.Sala;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-23T09:34:03")
@StaticMetamodel(Sessao.class)
public class Sessao_ { 

    public static volatile SingularAttribute<Sessao, Date> dataSessao;
    public static volatile SingularAttribute<Sessao, Float> valorIngresso;
    public static volatile SingularAttribute<Sessao, Filme> idFilme;
    public static volatile SingularAttribute<Sessao, Integer> idSessao;
    public static volatile SingularAttribute<Sessao, String> inicio;
    public static volatile SingularAttribute<Sessao, Sala> idSala;
    public static volatile SingularAttribute<Sessao, String> termino;

}