package ru.itmo.blps.lab3.data.dto;

import lombok.Data;
import ru.itmo.blps.lab3.data.Equity;
import ru.itmo.blps.lab3.data.Watchlist;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Data
public class WatchlistDto {
    private Long id;

    private String name;

    private Set<Long> equities;

    public static WatchlistDto fromWatchlist(Watchlist watchlist){
        WatchlistDto watchlistDto = new WatchlistDto();

        watchlistDto.setId(watchlist.getId());
        watchlistDto.setName(watchlist.getName());
        watchlistDto.setEquities(
               watchlist.getEquities().stream().map(Equity::getId).collect(Collectors.toSet())
        );

        return watchlistDto;
    }

    public static List<WatchlistDto> fromWatchlistsCollection(Collection<Watchlist> watchlists){
        return watchlists.stream().map(WatchlistDto::fromWatchlist).collect(Collectors.toList());
    }
}
