/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.controller;

import com.livecron.market.generics.GenericController;
import lombok.RequiredArgsConstructor;
import com.livecron.market.subsidiary.model.Producto;
import com.livecron.market.subsidiary.dto.ProductoDto;
import com.livecron.market.subsidiary.service.ProductoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class ProductoController extends GenericController<Producto, ProductoDto> {
    private final ProductoService service;

    @Override
    protected ProductoService getService() {
        return service;
    }

}
