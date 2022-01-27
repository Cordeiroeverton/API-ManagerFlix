package io.ordeiroeverton.managerflix.demo.services;

import org.springframework.stereotype.Service;

import io.ordeiroeverton.managerflix.demo.mocks.MockTitulos;
import io.ordeiroeverton.managerflix.demo.models.Titulos;

import java.util.List;

@Service
public class TitulosService {

    public Titulos cadastrar(Titulos titulos) {

        return titulos;
    }

    public Titulos obter(Long id) {
        Titulos titulos = new Titulos();
        titulos.setId(id);

        return titulos;
    }

    public static Titulos atualizar(Titulos titulos, long id) {
        titulos.setId(id);

        return titulos;
    }

    public static List<Titulos> listar() {

        MockTitulos listarTitulos = new MockTitulos();

        return listarTitulos.listarTitulos();
    }

    public static void deletar(long id) {
        //
    }

}
