package io.ordeiroeverton.managerflix.demo.mocks;

import java.util.List;

import io.ordeiroeverton.managerflix.demo.models.TitulosAssistidos;

public class MockTitulosAssistidos {
    public List<TitulosAssistidos> listarTitulosAssistidos() {
        TitulosAssistidos suits = new TitulosAssistidos();

        suits.setId((long) 349);
        suits.setNome("IT Crowd");
        suits.setSinopse("Descrição do Titulo");
        suits.setTemporadas(3);
        suits.setEpsodios(98);
        suits.setDuracao("43:00");
        suits.setStatus("Concluido");

        var supernatural = new TitulosAssistidos();

        supernatural.setId((long) 349);
        supernatural.setNome("Supernatural");
        supernatural.setSinopse("Descrição do Titulo");
        supernatural.setTemporadas(15);
        supernatural.setEpsodios(234);
        supernatural.setDuracao("43:00");
        supernatural.setStatus("Concluido");

        var breakingBad = new TitulosAssistidos();

        breakingBad.setId((long) 349);
        breakingBad.setNome("Supernatural");
        breakingBad.setSinopse("Descrição do Titulo");
        breakingBad.setTemporadas(15);
        breakingBad.setEpsodios(234);
        breakingBad.setDuracao("43:00");
        breakingBad.setStatus("Concluido");

        return List.of(
                suits,
                supernatural,
                breakingBad);
    }
}
