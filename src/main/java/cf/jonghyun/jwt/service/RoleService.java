package cf.jonghyun.jwt.service;


import cf.jonghyun.jwt.dao.RoleDao;
import cf.jonghyun.jwt.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
