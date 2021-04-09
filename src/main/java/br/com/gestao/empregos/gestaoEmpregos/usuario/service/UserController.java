package br.com.gestao.empregos.gestaoEmpregos.usuario.service;

import br.com.gestao.empregos.gestaoEmpregos.usuario.User;
import br.com.gestao.empregos.gestaoEmpregos.usuario.repository.UserRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {

    @Autowired
    private UserRepositoty userRepositoty;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<User>listUser() {

        return  userRepositoty.findAll();
    }

    @PostMapping(path = "/add")
    public void insertUser(@RequestBody User user) {
        try {
            userRepositoty.save(user);

        } catch(Error error) {
             error.getCause();
        }
    }

    @PutMapping(path = "/edit")
    public void editUser(@RequestBody User user) {
        userRepositoty.save(user);
    }
    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody void deleteUser(@PathVariable(name = "id") long id){
        userRepositoty.deleteById(id);
    };

}
