/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.dto;

import lombok.Getter;
import lombok.Setter;
import com.livecron.market.subsidiary.model.Producto;
import com.livecron.market.generics.DtoBase;


@Getter
@Setter
public class ProductoDto extends DtoBase<Producto> {

    private ItemDto item;
    private String codigo;

}
