package ormatins

import filter.DocenteFilter

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import com.lucastex.grails.fileuploader.UFile

class DocenteController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def docenteService

    def index(DocenteFilter filter) {
        if(!filter)
            filter = new DocenteFilter()
        else
            filter.validate()

        def docentes = docenteService.search(filter)
        def total = docenteService.count(filter)
        //render(view: "index", model: [docenteList: docentes, docenteCount: total])
        [docenteList: docentes, docenteCount: total]
    }

    def success(int i){

    }

    def error(int i){

    }

    def show() {
        List<Docente> listaDocentes = Docente.getAll()
        [docentes: listaDocentes]
    }

    def downloadFile() {
        render file: new File ("/ORMATINS/web-app/images"), fileName: 'fondoEscolar.jpg'
    }

    def create() {
        Docente docente = new Docente()
        [docenteInstance: docente]
        //render ([view: 'create', model:[docenteInstance: docente]])
    }

    def save(Docente docenteInstance) {
        if (docenteInstance == null) {
            notFound()
            return
        }

        if (docenteInstance.hasErrors()) {
            respond docenteInstance.errors, view:'create'
            return
        }

        docenteInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'docente.label', default: 'Docente'), docenteInstance.id])
                redirect docenteInstance
            }
            '*' { respond docenteInstance, [status: CREATED] }
        }
    }

    def edit() {
        List<Docente> listaDocentes = Docente.getAll()
        [docentes: listaDocentes]
    }

    def update(Docente docenteInstance) {
        if (docenteInstance == null) {
            notFound()
            return
        }

        if (docenteInstance.hasErrors()) {
            respond docenteInstance.errors, view:'edit'
            return
        }

        docenteInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Docente.label', default: 'Docente'), docenteInstance.id])
                redirect docenteInstance
            }
            '*'{ respond docenteInstance, [status: OK] }
        }
    }

    def delete(Docente docenteInstance) {

        if (docenteInstance == null) {
            notFound()
            return
        }

        docenteInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Docente.label', default: 'Docente'), docenteInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'docente.label', default: 'Docente'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
