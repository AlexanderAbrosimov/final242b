package pp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pp.dao.UserDAO;
import pp.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;

    }

    @Override
    public List<User> findAllUsers() {
        return userDAO.findAll();
    }


    @Override
    public void save(User user) {
        userDAO.save(user);
    }


//    @Override
//    public User show(int id) {
//        return userDAO.show(id);
//    }
//    @Override
//    public void update(int id, User updatedUser) {
//        userDAO.update(id, updatedUser);
//    }
//
//    @Override
//    public void delete(int id) {
//        userDAO.delete(id);
//    }

}
