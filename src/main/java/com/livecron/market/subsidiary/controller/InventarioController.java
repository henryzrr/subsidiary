/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.controller;

import com.livecron.market.generics.GenericController;
import lombok.RequiredArgsConstructor;
import com.livecron.market.subsidiary.model.Inventario;
import com.livecron.market.subsidiary.dto.InventarioDto;
import com.livecron.market.subsidiary.service.InventarioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class InventarioController extends GenericController<Inventario, InventarioDto> {
    private final InventarioService service;

    @Override
    protected InventarioService getService() {
        return service;
    }

}
