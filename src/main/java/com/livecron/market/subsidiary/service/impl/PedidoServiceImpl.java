/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.service.impl;

import com.livecron.market.subsidiary.service.DetallePedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.livecron.market.generics.GenericServiceImpl;
import com.livecron.market.generics.GenericRepository;
import com.livecron.market.subsidiary.model.Pedido;
import com.livecron.market.subsidiary.service.PedidoService;
import com.livecron.market.subsidiary.repository.PedidoRepository;


@Service
@RequiredArgsConstructor
public class PedidoServiceImpl extends GenericServiceImpl<Pedido> implements PedidoService {
    private final PedidoRepository repository;
    private final DetallePedidoService detallePedidoService;

    @Override
    protected GenericRepository<Pedido> getRepository() {
        return repository;
    }

    @Override
    public Pedido save(Pedido pedido) {
        pedido = super.save(pedido);
        Pedido finalPedido = pedido;
        pedido.getDetallesPedido()
                .forEach(detallePedido -> {
                    detallePedido.setPedido(finalPedido);
                });
        detallePedidoService.saveAll(pedido.getDetallesPedido());
        return pedido;
    }
}
