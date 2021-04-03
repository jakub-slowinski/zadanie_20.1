package pl.biomechanika.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RepoController {

    UserRepo userRepo;

    @ResponseBody
    @GetMapping("/users")

    public String users() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Marian", "Kowalski", 34));
        userList.add(new User("Andrzej", "Maksymiuk", 44));
        userList.add(new User("Bolesław", "Krzywousty", 54));
        StringBuilder finalList = new StringBuilder();
        for (User user : userList) {
            finalList.append(user.getFirstName()).append(" ").append(user.getLastName())
                    .append(", ").append(user.getAge()).append("</br>");
        }
        return finalList.toString();
    }

}

