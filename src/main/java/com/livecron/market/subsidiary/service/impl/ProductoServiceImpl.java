/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.livecron.market.generics.GenericServiceImpl;
import com.livecron.market.generics.GenericRepository;
import com.livecron.market.subsidiary.model.Producto;
import com.livecron.market.subsidiary.service.ProductoService;
import com.livecron.market.subsidiary.repository.ProductoRepository;

@Service
@RequiredArgsConstructor
public class ProductoServiceImpl extends GenericServiceImpl<Producto> implements ProductoService {
    private final ProductoRepository repository;

    @Override
    protected GenericRepository<Producto> getRepository() {
        return repository;
    }

}
