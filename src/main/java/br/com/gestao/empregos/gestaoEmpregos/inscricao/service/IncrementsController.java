package br.com.gestao.empregos.gestaoEmpregos.inscricao.service;

import br.com.gestao.empregos.gestaoEmpregos.inscricao.Increments;
import br.com.gestao.empregos.gestaoEmpregos.inscricao.repository.IncrementsRepository;
import br.com.gestao.empregos.gestaoEmpregos.vacancy.Vacancy;
import br.com.gestao.empregos.gestaoEmpregos.vacancy.repository.VacancyRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/increment")
public class IncrementsController {
    @Autowired
    private IncrementsRepository incrementsRepository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Increments>listUser() {

        return  incrementsRepository.findAll();
    }

    @PostMapping(path = "/add")
    public void insertUser(@RequestBody Increments increments) {
        try {
            incrementsRepository.save(increments);

        } catch(Error error) {
            error.getCause();
        }
    }

    @PutMapping(path = "/edit")
    public void editUser(@RequestBody Increments increments) {
        incrementsRepository.save(increments);
    }
    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody void deleteUser(@PathVariable(name = "id") long id){
        incrementsRepository.deleteById(id);
    };

}

