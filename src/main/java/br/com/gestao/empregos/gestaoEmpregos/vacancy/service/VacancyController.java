package br.com.gestao.empregos.gestaoEmpregos.vacancy.service;

import br.com.gestao.empregos.gestaoEmpregos.vacancy.Vacancy;
import br.com.gestao.empregos.gestaoEmpregos.vacancy.repository.VacancyRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/vacancy")
public class VacancyController {
    @Autowired
    private VacancyRepositiry vacancyRepositiry;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Vacancy>listUser() {

        return  vacancyRepositiry.findAll();
    }

    @PostMapping(path = "/add")
    public void insertUser(@RequestBody Vacancy vacancy) {
        try {
            vacancyRepositiry.save(vacancy);

        } catch(Error error) {
            error.getCause();
        }
    }

    @PutMapping(path = "/edit")
    public void editUser(@RequestBody Vacancy vacancy) {
        vacancyRepositiry.save(vacancy);
    }
    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody void deleteUser(@PathVariable(name = "id") long id){
        vacancyRepositiry.deleteById(id);
    };

}
