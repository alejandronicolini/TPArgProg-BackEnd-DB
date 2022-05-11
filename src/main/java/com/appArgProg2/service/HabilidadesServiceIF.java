package com.appArgProg2.service;

import com.appArgProg2.model.Habilidades;
import java.util.List;

public interface HabilidadesServiceIF {
    
    public List<Habilidades> listarRegistros();

    public void crearRegistro(Habilidades obj);

    public void actualizarRegistro(Habilidades obj);

    public void borrarRegistro(Long id);

    public Habilidades registroPorId(Long id);
    
}
