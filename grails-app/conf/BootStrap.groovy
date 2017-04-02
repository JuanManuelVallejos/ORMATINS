import ormatins.Docente

class BootStrap {

    def init = { servletContext ->
        new Docente()
    }
    def destroy = {
    }
}
