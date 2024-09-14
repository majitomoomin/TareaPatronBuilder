import java.util.ArrayList;
import java.util.List;

public class EmailBuilder {
    private List<String> destinatarios = new ArrayList<>();
    private String asunto;
    private String cuerpo;
    private List<String> adjuntos = new ArrayList<>();

    public EmailBuilder ObtenerDestinatarios(String destinatario) {
        this.destinatarios.add(destinatario);
        return this;
    }

    public EmailBuilder ObtenerAsunto(String asunto) {
        this.asunto = asunto;
        return this;
    }

    public EmailBuilder ObtenerCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
        return this;
    }

    public EmailBuilder ObtenesAdjuntos(String adjunto) {
        this.adjuntos.add(adjunto);
        return this;
    }


    public List<String> getDestinatarios() {
        return destinatarios;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public List<String> getAdjuntos() {
        return adjuntos;
    }

    public Email build() {
        if (destinatarios.isEmpty()) {
            throw new IllegalStateException("Debe agregar al menos un destinatario.");
        }
        if (asunto == null || asunto.isEmpty()) {
            throw new IllegalStateException("El asunto es obligatorio.");
        }
        if (cuerpo == null || cuerpo.isEmpty()) {
            throw new IllegalStateException("El cuerpo del correo es obligatorio.");
        }
        return new Email(this);
    }
}


