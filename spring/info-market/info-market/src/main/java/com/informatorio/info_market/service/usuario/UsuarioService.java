package com.informatorio.info_market.service.usuario;

import com.informatorio.info_market.domain.Usuario;

import java.util.UUID;

public interface UsuarioService {
    Usuario getUsuarioEntityById(UUID id);
}
