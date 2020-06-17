package br.com.felipezanella.springbootcontainer.controllers;

import br.com.felipezanella.springbootcontainer.models.User;
import br.com.felipezanella.springbootcontainer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable("id") Integer id) {
        return userRepository.findById(id).get();
    }

    @PostMapping
    @PutMapping
    public User save(@RequestBody User user) {
        return userRepository.save(user);
    }

    @DeleteMapping
    public void deleteById(@PathVariable("id") Integer id) {
        userRepository.deleteById(id);
    }


}
