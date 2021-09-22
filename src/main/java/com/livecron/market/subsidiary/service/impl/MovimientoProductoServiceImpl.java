/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.livecron.market.generics.GenericServiceImpl;
import com.livecron.market.generics.GenericRepository;
import com.livecron.market.subsidiary.model.MovimientoProducto;
import com.livecron.market.subsidiary.service.MovimientoProductoService;
import com.livecron.market.subsidiary.repository.MovimientoProductoRepository;

@Service
@RequiredArgsConstructor
public class MovimientoProductoServiceImpl extends GenericServiceImpl<MovimientoProducto> implements MovimientoProductoService {
    private final MovimientoProductoRepository repository;

    @Override
    protected GenericRepository<MovimientoProducto> getRepository() {
        return repository;
    }

}
