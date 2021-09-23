/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.livecron.market.generics.ModelBase;
import com.livecron.market.subsidiary.dto.ProductoInventarioDto;

@Getter
@Setter
@Entity
public class ProductoInventario extends ModelBase<ProductoInventarioDto> {

    @OneToOne
    @JoinColumn
    private Producto producto;

    @ManyToOne(optional = false)
    @JoinColumn
    private Inventario inventario;

    @Enumerated(EnumType.STRING)
    private EstadoProducto estadoProducto;

    @OneToOne(mappedBy = "productoInventario")
    private DetallePedido detallePedido;
}
