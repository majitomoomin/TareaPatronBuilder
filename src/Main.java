public class Main {
    public static void main(String[] args) {
        // Creando el correo electrónico utilizando EmailBuilder
        Email email = new EmailBuilder()
                .ObtenerDestinatarios("carolyn@gmail.com")
                .ObtenerDestinatarios("guillermo@gmail.com")
                .ObtenerAsunto("Reunión")
                .ObtenerCuerpo("recordatorio para la reunión de mañana.")
                .ObtenesAdjuntos("archivoreunion.pdf")
                .build();
        
        System.out.println(email.ObtenerInfo());
    }
}
