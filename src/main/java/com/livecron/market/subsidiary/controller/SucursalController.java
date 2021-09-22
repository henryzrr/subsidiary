/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.controller;

import com.livecron.market.generics.GenericController;
import lombok.RequiredArgsConstructor;
import com.livecron.market.subsidiary.model.Sucursal;
import com.livecron.market.subsidiary.dto.SucursalDto;
import com.livecron.market.subsidiary.service.SucursalService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class SucursalController extends GenericController<Sucursal, SucursalDto> {
    private final SucursalService service;

    @Override
    protected SucursalService getService() {
        return service;
    }

}
