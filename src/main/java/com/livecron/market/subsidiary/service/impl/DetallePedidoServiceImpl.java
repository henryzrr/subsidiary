/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.livecron.market.generics.GenericServiceImpl;
import com.livecron.market.generics.GenericRepository;
import com.livecron.market.subsidiary.model.DetallePedido;
import com.livecron.market.subsidiary.service.DetallePedidoService;
import com.livecron.market.subsidiary.repository.DetallePedidoRepository;

@Service
@RequiredArgsConstructor
public class DetallePedidoServiceImpl extends GenericServiceImpl<DetallePedido> implements DetallePedidoService {
    private final DetallePedidoRepository repository;

    @Override
    protected GenericRepository<DetallePedido> getRepository() {
        return repository;
    }

}
