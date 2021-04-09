package br.com.gestao.empregos.gestaoEmpregos.inscricao.repository;

import br.com.gestao.empregos.gestaoEmpregos.inscricao.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepoitory extends CrudRepository<Company,Long> {
        }
