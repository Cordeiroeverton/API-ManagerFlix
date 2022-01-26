package io.ordeiroeverton.managerflix.demo.Service;

import java.util.List;

import io.ordeiroeverton.managerflix.demo.Model.Categorias;

public class CategoriaService {
    
    public Categorias cadastrarCategoria( Categorias categoria ){
     
        return categoria;
    }

    public Categorias obterCategoria(  Long id){ 

        Categorias categorias = new Categorias();
        categorias.setId(id);

        return categorias;
    }
  
    public Categorias atualizarCategoria( Categorias categorias, long id){
        categorias.setId(id);
       
        return categorias;
    }

    public List <Categorias> listarCategoria(){

        Categorias Comedia = new Categorias();
        
        Comedia.setId(34);
        Comedia.setNome("Comédia");

        var Aventura = new Categorias();

        Aventura.setId(23);
        Aventura.setNome("Aventura");
      
        var Acao = new Categorias();

        Acao.setId(67);
        Acao.setNome("Ação");

        return List.of(
            Comedia,
            Aventura,
            Acao
        ); 
    }

    public void deletarCategoria( long id){
        //
    }
}
