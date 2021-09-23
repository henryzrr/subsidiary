/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.livecron.market.generics.ModelBase;
import com.livecron.market.subsidiary.dto.ItemDto;

import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
@Entity
public class Item extends ModelBase<ItemDto> {
    private BigDecimal precioUnitario;
    private String codigo;
    private String descripcion;
    private Integer numeroElementos;

    @OneToMany(mappedBy = "item")
    private Set<Producto> productos;
}
