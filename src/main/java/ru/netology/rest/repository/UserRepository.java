package ru.netology.rest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.rest.model.Authorities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {

        List<Authorities> authorities = new ArrayList<>();

        if (user.equals("admin") && password.equals("admin")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        }

        if (user.equals("poweruser") && password.equals("poweruser")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE);
        }

        if (user.equals("user") && password.equals("user")) {
            Collections.addAll(authorities, Authorities.READ);
        }

        return authorities;
    }

}
