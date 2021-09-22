/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.controller;

import com.livecron.market.generics.GenericController;
import lombok.RequiredArgsConstructor;
import com.livecron.market.subsidiary.model.Pedido;
import com.livecron.market.subsidiary.dto.PedidoDto;
import com.livecron.market.subsidiary.service.PedidoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/pedidos")
public class PedidoController extends GenericController<Pedido, PedidoDto> {
    private final PedidoService service;

    @Override
    protected PedidoService getService() {
        return service;
    }

}
