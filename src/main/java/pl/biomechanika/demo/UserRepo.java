package pl.biomechanika.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepo {

    List<User> userList = new ArrayList<>();

    public List<User> getUserList() {
        userList.add(new User("Marian","Kowalski",34));
        userList.add(new User("Andrzej","Maksymiuk",44));
        userList.add(new User("Bolesław","Krzywousty",54));
        return userList;
    }


}
