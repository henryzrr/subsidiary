/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

import com.livecron.market.generics.ModelBase;
import com.livecron.market.subsidiary.dto.DetallePedidoDto;

@Getter
@Setter
@Entity
public class DetallePedido extends ModelBase<DetallePedidoDto> {

}
