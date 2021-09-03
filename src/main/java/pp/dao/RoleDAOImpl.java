package pp.dao;

import org.springframework.stereotype.Repository;
import pp.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Repository
public class RoleDAOImpl implements RoleDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Role> findAll() {
        return em.createQuery("SELECT r FROM Role r", Role.class).getResultList();
    }

    public Role findRoleByAuthority(String roleName) throws NoSuchElementException {
        Role role = null;
        try {
            role = em
                    .createQuery("SELECT r FROM Role r WHERE r.roleName=:roleName", Role.class)
                    .setParameter("roleName", roleName)
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println("Role not found");
        }
        return role;
    }
}
