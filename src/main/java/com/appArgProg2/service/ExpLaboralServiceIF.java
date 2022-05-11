package com.appArgProg2.service;

import com.appArgProg2.model.ExperienciaLaboral;
import java.util.List;

public interface ExpLaboralServiceIF {

    public List<ExperienciaLaboral> listarRegistros();

    public void crearRegistro(ExperienciaLaboral obj);

    public void actualizarRegistro(ExperienciaLaboral obj);

    public void borrarRegistro(Long id);

    public ExperienciaLaboral registroPorId(Long id);

}
