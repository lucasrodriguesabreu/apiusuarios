package br.com.lucas.apiusuarios.services;

import br.com.lucas.apiusuarios.entities.Usuario;
import br.com.lucas.apiusuarios.repositories.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public Usuario findById(Long id) {
        Optional<Usuario> obj = repository.findById(id);
        return obj.get();
    }
    public Usuario salvarUsuario(Usuario usuario) {
        return repository.save(usuario);
    }
}
