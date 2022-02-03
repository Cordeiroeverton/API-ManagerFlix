package io.ordeiroeverton.managerflix.demo.services;

import io.ordeiroeverton.managerflix.demo.dtos.request.PostTituloRequest;
import io.ordeiroeverton.managerflix.demo.dtos.response.PostTituloResponse;
import io.ordeiroeverton.managerflix.demo.models.Titulo;
import io.ordeiroeverton.managerflix.demo.repository.TituloRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TituloService {

    @Autowired
    private TituloRepository tituloRepository;

    public PostTituloResponse cadastrar(PostTituloRequest postTituloRequest) {

        Titulo titulo = new Titulo();

        titulo.setNome(postTituloRequest.getNome());
        titulo.setSinopse(postTituloRequest.getSinopse());
        titulo.setTemporadas(postTituloRequest.getTemporadas());
        titulo.setEpsodios(postTituloRequest.getEpsodios());
        titulo.setDuracao(postTituloRequest.getDuracao());

        Titulo tituloCriado = tituloRepository.save(titulo);

        PostTituloResponse postTituloResponse = new PostTituloResponse();
        postTituloResponse.setTituloCadastrado(tituloCriado.getId());
        postTituloResponse.setMensagem("Titulo cadastrado com sucesso.");

        return postTituloResponse;
    }

    public Titulo obter(Long id) {
        return tituloRepository.findById(id).get();
    }

    public Titulo atualizar(Titulo titulos, long id) {

        Titulo titulosAtualizados = this.obter(id);

        titulosAtualizados.setNome(titulos.getNome());
        titulosAtualizados.setSinopse(titulos.getSinopse());
        titulosAtualizados.setTemporadas(titulos.getTemporadas());
        titulosAtualizados.setEpsodios(titulos.getEpsodios());
        titulosAtualizados.setDuracao(titulos.getDuracao());

        return tituloRepository.save(titulosAtualizados);
    }

    public List<Titulo> listar() {
        return tituloRepository.findAll();
    }

    public void deletar(long id) {
        tituloRepository.deleteById(id);
    }
}
