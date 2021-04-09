package br.com.gestao.empregos.gestaoEmpregos.vacancy.repository;

import br.com.gestao.empregos.gestaoEmpregos.usuario.User;
import br.com.gestao.empregos.gestaoEmpregos.vacancy.Vacancy;
import org.springframework.data.repository.CrudRepository;

public interface VacancyRepositiry extends CrudRepository<Vacancy,Long> {
}

