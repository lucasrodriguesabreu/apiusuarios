package br.com.lucas.apiusuarios.services;

import br.com.lucas.apiusuarios.entities.Usuario;
import br.com.lucas.apiusuarios.model.UsuarioUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class GerenciaUsuarioService implements UserDetailsService {

    private final UsuarioService usuarioService;

    public GerenciaUsuarioService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.buscarUsuarioBanco(username);
        if (null == usuario) {
            System.out.println("Usuário nao encontrado!");
            throw new UsernameNotFoundException("Usuário nao encontrado!");
        }
        UsuarioUserDetails usuarioUserDetails = new UsuarioUserDetails(usuario);
        return usuarioUserDetails;
    }
}
