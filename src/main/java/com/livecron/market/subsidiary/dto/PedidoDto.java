/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.dto;

import lombok.Getter;
import lombok.Setter;
import com.livecron.market.subsidiary.model.Pedido;
import com.livecron.market.generics.DtoBase;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
public class PedidoDto extends DtoBase<Pedido> {
    private LocalDate fechaPedido;

    private String nombreCliente;

    private String telefono;

    private BigDecimal montoTotal;

    private String idTransaccionBancaria;

    private Set<DetallePedidoDto> detallesPedido;
}
