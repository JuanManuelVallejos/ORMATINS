package ormatins

class Docente {

    String nombre
    String apellido
    String email
    String telefono
    int antiguedad
    int puntaje
    Titulo tituloBase
    List<Titulo> otrosTitulos
    List<LapsoHorario> disponibilidadHoraria
    List<CursoSalon> cursosSalon
    List<MATERIA> materiasAdicionales

    static constraints = {
    }
}
