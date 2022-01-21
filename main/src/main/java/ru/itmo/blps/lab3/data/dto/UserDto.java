package ru.itmo.blps.lab3.data.dto;

import lombok.Data;
import ru.itmo.blps.lab3.data.User;
import ru.itmo.blps.lab3.data.Watchlist;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Data
public class UserDto {
    private Long id;

    private String username;

    private Set<Long> watchlists;

    private Long violationsCount;

    public static UserDto fromUser(User user){
       UserDto userDto = new UserDto();

       userDto.setId(user.getId());
       userDto.setUsername(user.getUsername());
       userDto.setWatchlists(
              user.getWatchlists().stream().map(Watchlist::getId).collect(Collectors.toSet())
       );
       userDto.setViolationsCount(user.getViolationsCount());

       return userDto;
    }

    public static List<UserDto> fromUsersCollection(Collection<User> users){
        return users.stream().map(UserDto::fromUser).collect(Collectors.toList());
    }
}
