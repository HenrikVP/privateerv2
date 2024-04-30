package com.example.privateerv2.repository;

import com.example.privateerv2.model.WatchlistItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WatchlistItemRepository extends JpaRepository<WatchlistItem, Integer> {}