package br.com.gestao.empregos.gestaoEmpregos.usuario.repository;

import br.com.gestao.empregos.gestaoEmpregos.usuario.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepositoty extends CrudRepository<User,Long> {
}
