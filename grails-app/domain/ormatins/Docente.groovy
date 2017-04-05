package ormatins

class Docente {

    String nombre
    String apellido
    String email
    String telefono
    int antiguedad
    int puntaje
    Titulo tituloBase
    //Set<Titulo> otrosTitulos
    //List<LapsoHorario> disponibilidadHoraria
    //List<CursoSalon> cursosSalon
    //List<MATERIA> materiasAdicionales

    //static hasMany = [otrosTitulos: Titulo]

    static constraints = {
        antiguedad nullable: true
        puntaje nullable: true
        email email: true
        tituloBase blank: true, nullable: true
    }
}
