package com.example.privateerv2.controller;

import com.example.privateerv2.model.WatchlistItem;
import com.example.privateerv2.repository.WatchlistItemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wli")
public class WatchlistItemController {

    WatchlistItemRepository wlir;
    WatchlistItemController(WatchlistItemRepository watchlistItemRepository) {
        this.wlir = watchlistItemRepository;
    }
    @GetMapping()
    List<WatchlistItem> getAllWatchlistItem()
    {
        return wlir.findAll();
    }

    @GetMapping("/{id}")
    WatchlistItem getWatchlistItembyId(@PathVariable int id){
        return wlir.findById(id).get();
    }

    @PostMapping()
    void insertWatchlistItem(@RequestBody WatchlistItem watchlistItem){
        wlir.save(watchlistItem);
    }

    @PutMapping()
    void updateWatchlistItem(@RequestBody WatchlistItem watchlistItem){
        wlir.save(watchlistItem);
    }

    @DeleteMapping("/{id}")
    void deleteWatchlistItem(@PathVariable int id){
        wlir.deleteById(id);
    }
}



