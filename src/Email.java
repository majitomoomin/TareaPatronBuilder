import java.util.List;


public class Email {
    private final List<String> destinatarios;
    private final String asunto;
    private final String cuerpo;
    private final List<String> adjuntos;

    // Constructor
    Email(EmailBuilder builder) {
        this.destinatarios = builder.getDestinatarios();
        this.asunto = builder.getAsunto();
        this.cuerpo = builder.getCuerpo();
        this.adjuntos = builder.getAdjuntos();
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

    // obtener la información del correo
    public String ObtenerInfo() {
        return "Email{" +
                "destinatarios=" + destinatarios +
                ", asunto='" + asunto + '\'' +
                ", cuerpo='" + cuerpo + '\'' +
                ", adjuntos=" + adjuntos +
                '}';
    }
}
