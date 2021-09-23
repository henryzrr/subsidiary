/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.livecron.market.generics.ModelBase;
import com.livecron.market.subsidiary.dto.ProductoDto;

@Getter
@Setter
@Entity
@EqualsAndHashCode
public class Producto extends ModelBase<ProductoDto>{

    @ManyToOne
    private Item item;

    @OneToOne(mappedBy = "producto")
    private ProductoInventario productoInventario;

    private String codigo;
}
