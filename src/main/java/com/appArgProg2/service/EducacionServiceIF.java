package com.appArgProg2.service;

import com.appArgProg2.model.Educacion;
import java.util.List;

public interface EducacionServiceIF {

    public List<Educacion> listarRegistros();

    public void crearRegistro(Educacion obj);

    public void actualizarRegistro(Educacion obj);

    public void borrarRegistro(Long id);

    public Educacion registroPorId(Long id);

}
