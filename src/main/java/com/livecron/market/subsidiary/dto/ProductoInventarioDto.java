/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.dto;

import com.livecron.market.subsidiary.model.*;
import lombok.Getter;
import lombok.Setter;
import com.livecron.market.generics.DtoBase;

@Getter
@Setter
public class ProductoInventarioDto extends DtoBase<ProductoInventario> {

    private InventarioDto inventario;
    private ProductoDto producto;

    private EstadoProducto estadoProducto;
}
