package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Sessao;
import modelo.Venda;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-23T09:34:03")
@StaticMetamodel(Ingresso.class)
public class Ingresso_ { 

    public static volatile SingularAttribute<Ingresso, Integer> qtd;
    public static volatile SingularAttribute<Ingresso, Integer> idIngresso;
    public static volatile SingularAttribute<Ingresso, Integer> tipo;
    public static volatile SingularAttribute<Ingresso, Date> expedicao;
    public static volatile SingularAttribute<Ingresso, Float> valor;
    public static volatile SingularAttribute<Ingresso, Sessao> idSessao;
    public static volatile SingularAttribute<Ingresso, Venda> idVenda;

}