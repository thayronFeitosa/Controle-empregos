package br.com.gestao.empregos.gestaoEmpregos.company.service;

import br.com.gestao.empregos.gestaoEmpregos.company.Company;
import br.com.gestao.empregos.gestaoEmpregos.company.repository.CompanyRepoitory;
import br.com.gestao.empregos.gestaoEmpregos.usuario.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.persistence.*;
import java.util.Date;

@RestController
@RequestMapping(path = "/api/company")
public class CompanyController {


    @Autowired
    private CompanyRepoitory companyRepoitory;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Company>listUser() {

        return companyRepoitory.findAll();
    }

    @PostMapping(path = "/add")
    public void insertUser(@RequestBody Company company) {
        try {
            companyRepoitory.save(company);

        } catch(Error error) {
            error.getCause();
        }
    }

    @PutMapping(path = "/edit")
    public void editUser(@RequestBody Company company) {
        companyRepoitory.save(company);
    }
    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody void deleteUser(@PathVariable(name = "id") long id){
        companyRepoitory.deleteById(id);
    };
}
