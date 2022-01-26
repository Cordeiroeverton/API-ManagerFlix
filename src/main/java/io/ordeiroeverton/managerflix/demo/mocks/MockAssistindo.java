package io.ordeiroeverton.managerflix.demo.mocks;

import java.util.List;

import io.ordeiroeverton.managerflix.demo.models.Assistindo;

public class MockAssistindo {

    public List<Assistindo> listarAssistindo() {

        Assistindo jessicaJones = new Assistindo();

        jessicaJones.setId((long) 34);
        jessicaJones.setNome("Jessica Jones");
        jessicaJones.setSinopse("Descrição do Titulo");
        jessicaJones.setTemporadas(3);
        jessicaJones.setEpsodios(98);
        jessicaJones.setDuracao("43:00");
        jessicaJones.setStatus("Concluido");

        Assistindo vikings = new Assistindo();

        vikings.setId(23);
        vikings.setNome("Vikings");
        vikings.setSinopse("Descrição do Titulo");
        vikings.setTemporadas(7);
        vikings.setEpsodios(100);
        vikings.setDuracao("52:00");
        vikings.setStatus("Em andamento");

        var strangerThings = new Assistindo();

        strangerThings.setId(45);
        strangerThings.setNome("Stranger Things");
        strangerThings.setSinopse("Descrição do Titulo");
        strangerThings.setTemporadas(4);
        strangerThings.setEpsodios(50);
        strangerThings.setDuracao("45:00");
        strangerThings.setStatus("Em andamento");

        var cobraKai = new Assistindo();

        cobraKai.setId(4);
        cobraKai.setNome("Cobra Kai");
        cobraKai.setSinopse("Descrição do Titulo");
        cobraKai.setTemporadas(4);
        cobraKai.setEpsodios(40);
        cobraKai.setDuracao("45:00");
        cobraKai.setStatus("Concluido");

        return List.of(
                jessicaJones,
                vikings,
                strangerThings,
                cobraKai);

    }

}
