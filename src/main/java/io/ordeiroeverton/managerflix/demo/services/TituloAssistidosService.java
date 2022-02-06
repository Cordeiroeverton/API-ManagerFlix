package io.ordeiroeverton.managerflix.demo.services;

import java.util.List;
import org.springframework.stereotype.Service;
import io.ordeiroeverton.managerflix.demo.models.TituloAssistido;
import io.ordeiroeverton.managerflix.demo.repository.TitutoAssistidosRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TituloAssistidosService {

    private final TitutoAssistidosRepository titulosAssistidosRepository;

    public TituloAssistido obterTituloAssistido(Long id) {
        return titulosAssistidosRepository.findById(id).get();
    }

    public TituloAssistido atualizarTitulosAssistido(TituloAssistido tituloAssistido, long id) {
        return titulosAssistidosRepository.save(obterTituloAssistido(id));
    }

    public List<TituloAssistido> listarTitulosAssistidos() {
        return titulosAssistidosRepository.findAll();
    }

    public void deletarTtitulsoAssistidos(long id) {
        titulosAssistidosRepository.deleteById(id);
    }
}