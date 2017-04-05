package ormatins



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

class DocenteController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Docente.list(params), model:[docenteInstanceCount: Docente.count()]
    }

    def show(Docente docenteInstance) {
        respond docenteInstance
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

    def edit(Docente docenteInstance) {
        respond docenteInstance
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
