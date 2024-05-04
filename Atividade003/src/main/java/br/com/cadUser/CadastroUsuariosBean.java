package br.com.cadUser;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class CadastroUsuariosBean {
    private String nome;
    private List<Pessoa> pessoas;

    @PostConstruct
    public void init() {
        pessoas = new ArrayList<>();
    }

    public void salvar() {
        Pessoa novaPessoa = new Pessoa();
        novaPessoa.setNome(nome);
        pessoas.add(novaPessoa);
        nome = null; // Limpa o campo de nome após salvar
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}