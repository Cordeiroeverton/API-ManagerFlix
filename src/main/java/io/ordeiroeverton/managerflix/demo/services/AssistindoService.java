package io.ordeiroeverton.managerflix.demo.services;

import java.util.List;
import org.springframework.stereotype.Service;

import io.ordeiroeverton.managerflix.demo.mocks.MockAssistindo;
import io.ordeiroeverton.managerflix.demo.models.Assistindo;

@Service
public class AssistindoService {

    public Assistindo obter(Long id) {

        Assistindo assistindo = new Assistindo();
        assistindo.setId(id);

        return assistindo;
    }

    public Assistindo mudarStatus(Assistindo assistindo, long id) {

        assistindo.setId(id);

        return assistindo;
    }

    public List<Assistindo> listarAssistindo() {

        MockAssistindo assistindoLista = new MockAssistindo();

        return assistindoLista.listarAssistindo();
    }

    public void deletar(long id) {
        //
    }

}
