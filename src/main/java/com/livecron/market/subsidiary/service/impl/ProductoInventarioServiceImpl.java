/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.livecron.market.generics.GenericServiceImpl;
import com.livecron.market.generics.GenericRepository;
import com.livecron.market.subsidiary.model.ProductoInventario;
import com.livecron.market.subsidiary.service.ProductoInventarioService;
import com.livecron.market.subsidiary.repository.ProductoInventarioRepository;

@Service
@RequiredArgsConstructor
public class ProductoInventarioServiceImpl extends GenericServiceImpl<ProductoInventario> implements ProductoInventarioService {
    private final ProductoInventarioRepository repository;

    @Override
    protected GenericRepository<ProductoInventario> getRepository() {
        return repository;
    }

}
