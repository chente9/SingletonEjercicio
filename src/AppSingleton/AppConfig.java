package AppSingleton;

public class AppConfig {
    private static AppConfig instancia;
    private AppConfig () {

    }

    public static synchronized AppConfig getInstance() {
        if ( instancia == null) {
            instancia = new AppConfig();
        }
            return instancia;

    }
    private String servidorUrl;

    private int puerto;
    private double precioHost;
    private String urlDisponible;



    public String getServidorUrl () {
        return servidorUrl;
    }

    public void setServidoUrl ( String servidorUrl1) {
        this.servidorUrl = servidorUrl1;
        }

        public int getPuerto () {
        return puerto;
        }

        public void setPuerto (int puerto1) {
        this.puerto = puerto1;
        }
        public double getPrecioHost () {
        return precioHost;
        }
        public void setPrecioHost (double precioHost1) {
        this.precioHost = precioHost1;
        }
        public String getUrlDisponible () {
        return urlDisponible;
        }
        public void setUrlDisponible (String urlDisponible1) {
        this.urlDisponible = urlDisponible1;
        }
    }


