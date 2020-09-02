package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Produto;
import modelo.Venda;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-23T09:34:03")
@StaticMetamodel(Item_venda.class)
public class Item_venda_ { 

    public static volatile SingularAttribute<Item_venda, Integer> qtd;
    public static volatile SingularAttribute<Item_venda, Produto> idProduto;
    public static volatile SingularAttribute<Item_venda, Float> valor_unit;
    public static volatile SingularAttribute<Item_venda, Venda> idVenda;

}