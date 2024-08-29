package br.com.WPL.crudusuario.usuario.services;

import br.com.WPL.crudusuario.usuario.domain.Usuario;
import br.com.WPL.crudusuario.usuario.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario cadastrarUsuario(Usuario usuario) {
           return usuarioRepository.save(usuario);
    }
}
