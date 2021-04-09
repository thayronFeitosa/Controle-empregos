package br.com.gestao.empregos.gestaoEmpregos.inscricao;

import br.com.gestao.empregos.gestaoEmpregos.company.Company;
import br.com.gestao.empregos.gestaoEmpregos.usuario.User;
import br.com.gestao.empregos.gestaoEmpregos.vacancy.Vacancy;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Increments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

  // Mudar na proxima versão para cpf
    @ManyToOne()
    public User user;

    // Mudar na proxima versão para cnpj
    @ManyToOne()
    public Company company;

    // Mudar na proxima versão para Id
    @ManyToOne()
    public Vacancy vacancy;

}
