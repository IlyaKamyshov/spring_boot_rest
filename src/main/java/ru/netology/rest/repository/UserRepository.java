package ru.netology.rest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.rest.model.Authorities;
import ru.netology.rest.model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(User user) {

        List<Authorities> authorities = new ArrayList<>();

        if (user.getUser().equals("admin") && user.getPassword().equals("admin")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        }

        if (user.getUser().equals("poweruser") && user.getUser().equals("poweruser")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE);
        }

        if (user.getUser().equals("user") && user.getPassword().equals("user")) {
            Collections.addAll(authorities, Authorities.READ);
        }

        return authorities;
    }

}
