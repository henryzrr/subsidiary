/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.livecron.market.generics.GenericServiceImpl;
import com.livecron.market.generics.GenericRepository;
import com.livecron.market.subsidiary.model.Sucursal;
import com.livecron.market.subsidiary.service.SucursalService;
import com.livecron.market.subsidiary.repository.SucursalRepository;

@Service
@RequiredArgsConstructor
public class SucursalServiceImpl extends GenericServiceImpl<Sucursal> implements SucursalService {
    private final SucursalRepository repository;

    @Override
    protected GenericRepository<Sucursal> getRepository() {
        return repository;
    }

}
