/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

import com.livecron.market.generics.ModelBase;
import com.livecron.market.subsidiary.dto.MovimientoProductoDto;

@Getter
@Setter
@Entity
public class MovimientoProducto extends ModelBase<MovimientoProductoDto> {

}
