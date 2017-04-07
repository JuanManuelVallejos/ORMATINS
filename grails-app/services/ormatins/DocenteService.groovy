package ormatins

import filter.DocenteFilter

class DocenteService {

    def crearQueryParaFilter(DocenteFilter filter){
        def query=""
        if (filter.nombre)
            query += " and d.nombre = :nombre "
        if (filter.apellido)
            query += " and d.apellido = :apellido "
        if (filter.email)
            query += " and d.email = :email "
        if (filter.telefono)
            query += " and d.telefono = :telefono "
        if (filter.antiguedad)
            query += " and d.antiguedad = :antiguedad "
        if (filter.puntaje)
            query += " and d.puntaje = :puntaje "

        return query
    }

    def search(DocenteFilter filter){
        def query = "select d from Docente as d where 1=1 " + crearQueryParaFilter(filter)
        def mapParams = filter.filterParams()
        println()
        println()
        print(query)
        println()
        println()
        def docentes = Docente.executeQuery(query, mapParams,[max:100])
        return docentes
    }

    def count(DocenteFilter filter){
        def query = "select count(d) from Docente as d where 1=1 " + crearQueryParaFilter(filter)
        def mapParams = filter.filterParams()
        def total = Docente.executeQuery(query, mapParams).getAt(0)
        return total

    }

    long saveDocente(def docenteDTO) {
        return 0
    }
}
