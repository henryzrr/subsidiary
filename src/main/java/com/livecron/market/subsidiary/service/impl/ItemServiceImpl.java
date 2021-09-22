/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.livecron.market.generics.GenericServiceImpl;
import com.livecron.market.generics.GenericRepository;
import com.livecron.market.subsidiary.model.Item;
import com.livecron.market.subsidiary.service.ItemService;
import com.livecron.market.subsidiary.repository.ItemRepository;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl extends GenericServiceImpl<Item> implements ItemService {
    private final ItemRepository repository;

    @Override
    protected GenericRepository<Item> getRepository() {
        return repository;
    }

}
