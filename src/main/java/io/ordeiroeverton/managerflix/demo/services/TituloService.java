package io.ordeiroeverton.managerflix.demo.services;

import io.ordeiroeverton.managerflix.demo.models.Titulo;
import io.ordeiroeverton.managerflix.demo.repository.TituloRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TituloService {

    @Autowired
    private TituloRepository tituloRepository;

    public Titulo cadastrar(Titulo titulos) {

        Titulo tituloCadastrado = tituloRepository.save(titulos);

        return tituloCadastrado;
    }

    public Titulo obter(Long id) {

        Titulo titulosObtido = tituloRepository.findById(id).get();

        return titulosObtido;
    }

    public Titulo atualizar(Titulo titulos, long id) {

        Titulo titulosAtualizados = this.obter(id);

        titulosAtualizados.setNome(titulos.getNome());
        titulosAtualizados.setSinopse(titulos.getSinopse());
        titulosAtualizados.setTemporadas(titulos.getTemporadas());
        titulosAtualizados.setEpsodios(titulos.getEpsodios());
        titulosAtualizados.setDuracao(titulos.getDuracao());

        tituloRepository.save(titulosAtualizados);

        return titulosAtualizados;
    }

    public List<Titulo> listar() {

        List<Titulo> tituloslistados = tituloRepository.findAll();

        return tituloslistados;
    }

    public void deletar(long id) {
        tituloRepository.deleteById(id);
    }

}
