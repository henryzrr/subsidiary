/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.controller;

import com.livecron.market.generics.GenericController;
import lombok.RequiredArgsConstructor;
import com.livecron.market.subsidiary.model.ProductoInventario;
import com.livecron.market.subsidiary.dto.ProductoInventarioDto;
import com.livecron.market.subsidiary.service.ProductoInventarioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/productosinventario")
public class ProductoInventarioController extends GenericController<ProductoInventario, ProductoInventarioDto> {
    private final ProductoInventarioService service;

    @Override
    protected ProductoInventarioService getService() {
        return service;
    }

}
