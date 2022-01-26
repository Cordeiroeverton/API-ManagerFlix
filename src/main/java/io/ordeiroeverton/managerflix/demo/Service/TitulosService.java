package io.ordeiroeverton.managerflix.demo.Service;


import org.springframework.stereotype.Service;
import java.util.List;
import io.ordeiroeverton.managerflix.demo.Model.Titulos;

@Service
public class TitulosService {


    public Titulos cadastrar( Titulos titulos ){
        
        return titulos;
    }

  
    public Titulos obter(  Long id){ 
            Titulos titulos = new Titulos();
            titulos.setId(id);

            return titulos;
    }

  
    public static Titulos atualizar( Titulos titulos, long id){
        titulos.setId(id);
       
        return titulos;
    }


    public static  List <Titulos> listar(){

        Titulos JessicaJones = new Titulos();
        
        JessicaJones.setId(34);
        JessicaJones.setNome("Jessica Jones");
        JessicaJones.setSinopse("Descrição do Titulo");
        JessicaJones.setTemporadas(3);
        JessicaJones.setEpsodios(98);
        JessicaJones.setDuracao("43:00");

        Titulos Vikings = new Titulos();

        Vikings.setId(23);
        Vikings.setNome("Vikings");
        Vikings.setSinopse("Descrição do Titulo");
        Vikings.setTemporadas(7);
        Vikings.setEpsodios(100);
        Vikings.setDuracao("52:00");

        var StrangerThings = new Titulos();

        StrangerThings.setId(45);
        StrangerThings.setNome("Stranger Things");
        StrangerThings.setSinopse("Descrição do Titulo");
        StrangerThings.setTemporadas(4);
        StrangerThings.setEpsodios(50);
        StrangerThings.setDuracao("45:00");

        return List.of(
            JessicaJones,
            Vikings,
            StrangerThings
        ); 
    }

    public static  void deletar(long id){
        //
    }

    
}
