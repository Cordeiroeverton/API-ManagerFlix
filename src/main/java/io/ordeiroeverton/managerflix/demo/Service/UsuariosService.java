package io.ordeiroeverton.managerflix.demo.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import io.ordeiroeverton.managerflix.demo.Model.Usuarios;

@Service
public class UsuariosService {
    
    public Usuarios cadastrarUsuarios( Usuarios usuarios ){
          
        return usuarios;
    }
    
    public Usuarios obterUsuarios( Long id){ 

        Usuarios usuarios = new Usuarios();
        usuarios.setId(id);

        return usuarios;
    }

    public Usuarios atualizarUsuarios( Usuarios  usuarios, long id){
        usuarios.setId(id);
       
        return usuarios;
    }

    public List<Usuarios> listarUsuarios(){

        Usuarios usuarioUm = new Usuarios();
        
        usuarioUm.setId((long) 2);
        usuarioUm.setNome("Pedro");
        
        Usuarios usuarioDois = new Usuarios();
        
        usuarioDois.setId((long) 5);
        usuarioDois.setNome("Joana");

        Usuarios usuarioTres = new Usuarios();
        
        usuarioTres.setId((long) 32);
        usuarioTres.setNome("Beatriz");

        Usuarios usuarioQuatro = new Usuarios();
        
        usuarioQuatro.setId((long) 332);
        usuarioQuatro.setNome("Vanessa");
 
        return List.of(
            usuarioUm,
            usuarioDois,
            usuarioTres,
            usuarioQuatro
        );
    }

    public void deletarUsuarios( long id){
        //
    }
}
