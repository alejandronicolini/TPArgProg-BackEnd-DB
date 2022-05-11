package com.appArgProg2.service;

import com.appArgProg2.model.InfoPersonal;

public interface InfoPersonalServiceIF {
    
    public void crearRegistro(InfoPersonal obj);

    public void actualizarRegistro(InfoPersonal obj);

    public void borrarRegistro(Long id);

    public InfoPersonal registroPorId(Long id);
    
    
}
