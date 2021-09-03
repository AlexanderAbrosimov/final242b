package pp.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import pp.model.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();
    void save(User user);


//    void update(int id, User updatedUser);
//    void delete(int id);
//    User show(int id);
}
