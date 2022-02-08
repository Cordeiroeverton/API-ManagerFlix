
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
        return assistindoRepository.findById(id).get();
    }

    public Assistindo mudarStatus(Assistindo assistindo, long id) {

        Assistindo assistindoStatus = this.obter(id);
        assistindoStatus.setStatus(assistindo.getStatus());

        return assistindoRepository.save(assistindoStatus);
    }

    public List<Assistindo> listarAssistindo() {
        return assistindoRepository.findAll();
    }

    public void deletar(long id) {
        assistindoRepository.deleteById(id);
    }
}
