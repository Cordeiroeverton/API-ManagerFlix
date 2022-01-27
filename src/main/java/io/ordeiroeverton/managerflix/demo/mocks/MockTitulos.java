package io.ordeiroeverton.managerflix.demo.mocks;

import java.util.List;

import io.ordeiroeverton.managerflix.demo.models.Titulos;

public class MockTitulos {
    public List<Titulos> listarTitulos() {

        Titulos jessicaJones = new Titulos();

        jessicaJones.setId(34);
        jessicaJones.setNome("Jessica Jones");
        jessicaJones.setSinopse("Descrição do Titulo");
        jessicaJones.setTemporadas(3);
        jessicaJones.setEpsodios(98);
        jessicaJones.setDuracao("43:00");

        Titulos vikings = new Titulos();

        vikings.setId(23);
        vikings.setNome("Vikings");
        vikings.setSinopse("Descrição do Titulo");
        vikings.setTemporadas(7);
        vikings.setEpsodios(100);
        vikings.setDuracao("52:00");

        var strangerThings = new Titulos();

        strangerThings.setId(45);
        strangerThings.setNome("Stranger Things");
        strangerThings.setSinopse("Descrição do Titulo");
        strangerThings.setTemporadas(4);
        strangerThings.setEpsodios(50);
        strangerThings.setDuracao("45:00");

        return List.of(
                jessicaJones,
                vikings,
                strangerThings);
    }
}
