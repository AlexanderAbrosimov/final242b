package pp.dao;

import pp.model.User;

import java.util.List;

public interface UserDAO {

    List<User> findAll();
    User find(String email);

    void save(User user);

//    void save(User user);
//    void update(int id, User updatedUser);
//    void delete(int id);
//    User show(int id);
}
