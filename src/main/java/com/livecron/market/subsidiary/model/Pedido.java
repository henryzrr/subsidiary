/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.livecron.market.generics.ModelBase;
import com.livecron.market.subsidiary.dto.PedidoDto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@Entity
public class Pedido extends ModelBase<PedidoDto> {

    @Column(nullable = false)
    private LocalDate fechaPedido;

    @Column(nullable = false)
    private String nombreCliente;

    @Column(nullable = false)
    private String telefono;

    @Column(nullable = false)
    private BigDecimal montoTotal;

    @Column(nullable = false)
    private String idTransaccionBancaria;

    @OneToMany(mappedBy = "pedido")
    private Set<DetallePedido> detallesPedido;
}
