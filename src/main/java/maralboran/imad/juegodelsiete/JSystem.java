/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maralboran.imad.juegodelsiete;

/**
 *
 * @author imad
 */
import java.io.PrintStream;
/**
 * @see https://www.jc-mouse.net/
 * @author mouse
 */
public class JSystem {

    /**
     * Flujo de salida Ejemplo<br>
     * JSystem.out.printColorln(color, texto)<br>
     * JSystem.out.printColor(color, texto)<br>
     * o con color de fondo<br>
     * JSystem.out.printColorln(color de fondo, color, texto)<br>
     * JSystem.out.printColor(color de fondo, color, texto)<br>
     */
    public static Out out = new Out();

    /**
     * Color ANSI para el texto
     */
    public enum Color {
        black("\u001B[30m"),
        red("\u001B[31m"),
        green("\u001B[32m"),
        yellow("\u001B[33m"),
        blue("\u001B[34m"),
        magenta("\u001B[35m"),
        cyan("\u001B[36m"),
        white("\u001B[37m"),
        reset("\u001B[0m");

        private final String value;

        private Color(String value) {
            this.value = value;
        }
        
        /**
         * Retorna el valor cadena de enum
         * @return String
         */
        public String getValue() {
            return value;
        }
    }

    /**
     * Color ANSI para el fondo
     */
    public enum ColorBg {
        black("\u001B[40m"),
        red("\u001B[41m"),
        green("\u001B[42m"),
        yellow("\u001B[43m"),
        blue("\u001B[44m"),
        magenta("\u001B[45m"),
        cyan("\u001B[46m"),
        white("\u001B[47m");

        private final String value;

        private ColorBg(String value) {
            this.value = value;
        }

        /**
         * Retorna el valor cadena de enum
         * @return String
         */
        public String getValue() {
            return value;
        }
    }

    /**
     * Constructor de clase
     */
    public JSystem() {}

    /**
     * Clase que se extiende de PrintStream
     */
    public static final class Out extends PrintStream {

        /**
         * Constrcutor de clase
         */
        public Out() {
            super(System.out);
        }

        /**
         * Metodo para pintar el texto
         *
         * @param c JSystem.COLOR
         * @param x String
         */
        public void printColorln(Color c, String x) {
            super.println(c.getValue() + x + Color.reset.getValue());
        }

        /**
         * Metodo para pintar el texto y su fondo con color
         * 
         * @param bg JSystem.BACKGROUND_COLOR
         * @param c JSystem.COLOR
         * @param x String
         */
        public void printColorln(ColorBg bg, Color c, String x) {
            super.println(bg.getValue() + c.getValue() + x + Color.reset.getValue());
        }

        /**
         * Metodo para pintar el texto
         * 
         * @param c JSystem.COLOR
         * @param x String
         */
        public void printColor(Color c, String x) {
            super.print(c.getValue() + x + Color.reset.getValue());
        }

        /**
         * Metodo para pintar el texto y su fondo con color
         * 
         * @param bg JSystem.BACKGROUND_COLOR
         * @param c JSystem.COLOR
         * @param x String
         */
        public void printColor(ColorBg bg, Color c, String x) {
            super.print(bg.getValue() + c.getValue() + x + Color.reset.getValue());
        }

    }
}