/**
 * @author: Henry Zerda Rodriguez
 */

package com.livecron.market.subsidiary.controller;

import com.livecron.market.generics.GenericController;
import lombok.RequiredArgsConstructor;
import com.livecron.market.subsidiary.model.Item;
import com.livecron.market.subsidiary.dto.ItemDto;
import com.livecron.market.subsidiary.service.ItemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/items")
public class ItemController extends GenericController<Item, ItemDto> {
    private final ItemService service;

    @Override
    protected ItemService getService() {
        return service;
    }

}
