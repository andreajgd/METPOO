import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class AspectRatio {

    public static int mcd(int a, int b) {
        if (b == 0) return a;
        return mcd(b, a % b);
    }

    public static void main(String[] args) {
        String urlImagen = "https://images.unsplash.com/photo-1689308271305-58e75832289b?fm=jpg&q=60&w=3000&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D";

        try {
            BufferedImage imagen = ImageIO.read(new URL(urlImagen));

            if (imagen == null) {
                System.out.println("No se pudo leer la imagen.");
                return;
            }

            int ancho = imagen.getWidth();
            int alto = imagen.getHeight();

            System.out.println("Resolución: " + ancho + " x " + alto);

            int divisor = mcd(ancho, alto);

            int ratioAncho = ancho / divisor;
            int ratioAlto = alto / divisor;

            System.out.println("Aspect Ratio: " + ratioAncho + ":" + ratioAlto);

        } catch (IOException e) {
            System.out.println("Error al leer la imagen: " + e.getMessage());
        }
    }
}
