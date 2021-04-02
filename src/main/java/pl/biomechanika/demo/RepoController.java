package pl.biomechanika.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RepoController {

    @ResponseBody
    @GetMapping("/users")

    public void users(){
        UserRepo userRepo = new UserRepo();
        userRepo.userList();
    }
}
