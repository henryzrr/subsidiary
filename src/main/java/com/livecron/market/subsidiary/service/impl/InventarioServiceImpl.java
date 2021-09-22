/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.livecron.market.generics.GenericServiceImpl;
import com.livecron.market.generics.GenericRepository;
import com.livecron.market.subsidiary.model.Inventario;
import com.livecron.market.subsidiary.service.InventarioService;
import com.livecron.market.subsidiary.repository.InventarioRepository;

@Service
@RequiredArgsConstructor
public class InventarioServiceImpl extends GenericServiceImpl<Inventario> implements InventarioService {
    private final InventarioRepository repository;

    @Override
    protected GenericRepository<Inventario> getRepository() {
        return repository;
    }

}
