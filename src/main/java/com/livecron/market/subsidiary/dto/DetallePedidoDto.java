/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import com.livecron.market.subsidiary.model.DetallePedido;
import com.livecron.market.generics.DtoBase;


@Getter
@Setter
public class DetallePedidoDto extends DtoBase<DetallePedido> {

    @JsonIgnore
    private PedidoDto pedido;
    private Long idProductoInventario;
}
