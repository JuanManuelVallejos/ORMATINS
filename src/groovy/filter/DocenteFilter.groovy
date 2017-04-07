package filter

import grails.validation.Validateable

/**
 * Created by juan on 06/04/17.
 */
@Validateable
class DocenteFilter extends AbstractFilter{
    String nombre
    String apellido
    String email
    String telefono
    int antiguedad
    int puntaje

    @Override
    def fillParams(params) {
        if(params.nombre)
            this.nombre = params.nombre
        if(params.apellido)
            this.apellido = params.apellido
        if(params.email)
            this.email = params.email
        if(params.telefono)
            this.telefono = params.telefono
        if(params.antiguedad)
            this.antiguedad = params.antiguedad
        if(params.puntaje)
            this.puntaje = params.puntaje
    }

    @Override
    def filterParams() {
        def map = [:]
        if(nombre)
            map.nombre = nombre
        if(apellido)
            map.apellido = apellido
        if(email)
            map.email = email
        if(telefono)
            map.telefono = telefono
        if(antiguedad)
            map.antiguedad = antiguedad
        if(puntaje)
            map.puntaje = puntaje
        return map
    }
}
