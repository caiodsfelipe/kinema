package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Funcionario;
import modelo.Item_venda;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-23T09:34:03")
@StaticMetamodel(Venda.class)
public class Venda_ { 

    public static volatile SingularAttribute<Venda, Integer> forma_pagamento;
    public static volatile SingularAttribute<Venda, Float> total;
    public static volatile SingularAttribute<Venda, Date> data;
    public static volatile ListAttribute<Venda, Item_venda> listaItens;
    public static volatile SingularAttribute<Venda, Funcionario> idFuncionário;
    public static volatile SingularAttribute<Venda, Integer> idVenda;

}