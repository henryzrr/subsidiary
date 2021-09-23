/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.livecron.market.generics.ModelBase;
import com.livecron.market.subsidiary.dto.InventarioDto;

@Getter
@Setter
@Entity
public class Inventario extends ModelBase<InventarioDto> {
    private String codigo;

    @ManyToOne(optional = false)
    private Sucursal sucursal;
}
