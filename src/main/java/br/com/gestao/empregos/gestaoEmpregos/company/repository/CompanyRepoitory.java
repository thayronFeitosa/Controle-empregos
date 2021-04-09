package br.com.gestao.empregos.gestaoEmpregos.company.repository;

import br.com.gestao.empregos.gestaoEmpregos.company.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepoitory extends CrudRepository<Company,Long> {
        }
