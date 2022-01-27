package io.ordeiroeverton.managerflix.demo.services;

import java.util.List;
import org.springframework.stereotype.Service;

import io.ordeiroeverton.managerflix.demo.mocks.MockTitulosAssistidos;
import io.ordeiroeverton.managerflix.demo.models.TitulosAssistidos;

@Service
public class TitulosAssistidosService {

    public TitulosAssistidos obterTtituloAssistido(Long id) {

        TitulosAssistidos titulosAssistidos = new TitulosAssistidos();
        titulosAssistidos.setId(id);

        return titulosAssistidos;
    }

    public TitulosAssistidos atualizarTitulosAssistido(TitulosAssistidos titulosAssistidos, long id) {

        titulosAssistidos.setId(id);

        return titulosAssistidos;
    }

    public List<TitulosAssistidos> listarTitulosAssistidos() {

        MockTitulosAssistidos listarAssistidos = new MockTitulosAssistidos();

        return listarAssistidos.listarTitulosAssistidos();
    }

    public void deletarTtitulsoAssistidos(long id) {
        //
    }

}
