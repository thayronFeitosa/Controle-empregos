package br.com.gestao.empregos.gestaoEmpregos.vacancy;

import br.com.gestao.empregos.gestaoEmpregos.company.Company;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Vacancy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column (nullable = false, length = 3000)
    private String description;

    @Column()
    private String fileVacancy;

    @Column(unique = false)
    private Date createAt;

    @Column(unique = false)
    private Date vanity;

// Colocar a chave estrangeira como CNPJ nas novas verões
    @ManyToOne
    private Company company;
}
