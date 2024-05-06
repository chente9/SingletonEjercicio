package AppSingleton;

public class Main {
    public static void main (String [] args ) {
        AppConfig configuracion = AppConfig.getInstance();
        configuracion.setServidoUrl("www.hostdatabase.com");
        configuracion.setPuerto(8088);
        configuracion.setPrecioHost(19.5);
        configuracion.setUrlDisponible("www.youtube.org, www.youtube.ar, ...");

                System.out.println("URL del servidor: " + configuracion.getServidorUrl()  + "\nPuerto Host"
                        + configuracion.getPuerto() + "\nPrecio anual: " + configuracion.getPrecioHost()
                        + "\nURL disponibles " + configuracion.getUrlDisponible());
    }
}
