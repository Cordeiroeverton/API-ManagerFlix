
package io.ordeiroeverton.managerflix.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.ordeiroeverton.managerflix.demo.models.Assistindo;
import io.ordeiroeverton.managerflix.demo.repository.AssistindoRepository;

@Service
public class AssistindoService {

    @Autowired
    private AssistindoRepository assistindoRepository;

    public Assistindo obter(Long id) {

        Assistindo obterAssistido = assistindoRepository.findById(id).get();

        return obterAssistido;
    }

    public Assistindo mudarStatus(Assistindo assistindo, long id) {

        Assistindo assistindoStatus = this.obter(id);
        assistindoStatus.setNome(assistindo.getNome());
        assistindoStatus.setSinopse(assistindo.getSinopse());
        assistindoStatus.setTemporadas(assistindo.getTemporadas());
        assistindoStatus.setEpsodios(assistindo.getEpsodios());
        assistindoStatus.setDuracao(assistindo.getDuracao());

        assistindoRepository.save(assistindoStatus);

        return assistindoStatus;
    }

    public List<Assistindo> listarAssistindo() {

        List<Assistindo> listarAssistindo = assistindoRepository.findAll();

        return listarAssistindo;
    }

    public void deletar(long id) {
        assistindoRepository.deleteById(id);
    }

}
