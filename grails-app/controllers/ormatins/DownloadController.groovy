package ormatins
import org.apache.tomcat.util.http.fileupload.*

class DownloadController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def downloadFile() {
        InputStream contentStream
        try {
            def file = new File("/ORMATINS/web-app/images/fondoEscolar.jpg")
            response.setHeader "Content-disposition", "attachment; filename=fondoEscolar2.jpg"
            response.setHeader("Content-Length", "file-size")
            response.setContentType("file-mime-type")
            contentStream = file.newInputStream()
            response.outputStream << contentStream
            webRequest.renderView = false
        } finally {
            IOUtils.closeQuietly(contentStream)
        }
    }
}
