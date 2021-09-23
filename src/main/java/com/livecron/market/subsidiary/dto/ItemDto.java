/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.dto;

import lombok.Getter;
import lombok.Setter;
import com.livecron.market.subsidiary.model.Item;
import com.livecron.market.generics.DtoBase;

import java.math.BigDecimal;

@Getter
@Setter
public class ItemDto extends DtoBase<Item> {
    private BigDecimal precioUnitario;
    private String codigo;
    private String descripcion;
    private Integer numeroElementos;
}
