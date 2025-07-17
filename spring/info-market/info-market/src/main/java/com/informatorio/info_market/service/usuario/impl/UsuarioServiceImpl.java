package com.informatorio.info_market.service.usuario.impl;

import com.informatorio.info_market.domain.Usuario;
import com.informatorio.info_market.exception.notfound.NotFoundException;
import com.informatorio.info_market.repository.usuario.UsuarioRepository;
import com.informatorio.info_market.service.usuario.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario getUsuarioEntityById(UUID id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        if (usuario.isPresent()) {
            return  usuario.get() ;
        }else{
            throw new NotFoundException("No se encontro el usuario con id : " + id);
        }
    }
}
