package UserRegistration.example.userRegistration.controller;

import UserRegistration.example.userRegistration.model.User;
import UserRegistration.example.userRegistration.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class UserRegistrationController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/register")
    public String register(@RequestBody User user){
        userRepository.save(user);
        return "Hi " + user.getName() + " great, your registration successful ";

    }

    @GetMapping("/getAllUsers")
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @GetMapping("/findUser/{email}")
    public List<User> findById(@PathVariable String email){
        return userRepository.findByEmail(email);

    }

    @DeleteMapping("/delete/{id}")
    public List<User> deleteById(@PathVariable int id){
        userRepository.deleteById(id);
        return userRepository.findAll();
    }



}
