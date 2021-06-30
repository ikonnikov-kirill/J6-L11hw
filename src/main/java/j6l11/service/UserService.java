package j6l11.service;

import j6l11.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<UserDto> findAll();

    UserDto findById(int id);

    UserDto save(UserDto userDto);

    void deleteById(int id);


}
