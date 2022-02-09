package io.ordeiroeverton.managerflix.demo.services;

import io.ordeiroeverton.managerflix.demo.dtos.request.PostTituloRequest;
import io.ordeiroeverton.managerflix.demo.dtos.response.PostTituloResponse;
import io.ordeiroeverton.managerflix.demo.exceptions.TamanhoNaoValidoException;
import io.ordeiroeverton.managerflix.demo.mappers.MapperTituloRequestToTitulo;
import io.ordeiroeverton.managerflix.demo.mappers.MapperTituloToTituloResponse;
import io.ordeiroeverton.managerflix.demo.models.Titulo;
import io.ordeiroeverton.managerflix.demo.repository.TituloRepository;
import lombok.RequiredArgsConstructor;
import java.util.List;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TituloService {

    private final TituloRepository tituloRepository;
    private final MapperTituloRequestToTitulo mapperTituloRequestToTitulo;
    private final MapperTituloToTituloResponse mapperTituloToTituloResponse;

    public PostTituloResponse cadastrar(PostTituloRequest postTituloRequest) {
        if(postTituloRequest.getNome().length() < 20) {
            throw new TamanhoNaoValidoException("O nome não pode ser muito longo.");
        }

        Titulo titulo = mapperTituloRequestToTitulo.toModel(postTituloRequest);

        tituloRepository.save(titulo);

        return mapperTituloToTituloResponse.toResponse(titulo);
    }

    public Titulo obter(Long id) {
        return tituloRepository.findById(id).get();
    }

    public Titulo atualizar(Titulo titulos, long id) {  
        return tituloRepository.save(obter(id));
    }

    public List<Titulo> listar() {
        return tituloRepository.findAll();
    }

    public void deletar(long id) {
        tituloRepository.deleteById(id);
    }
}
