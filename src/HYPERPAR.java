public class HYPERPAR {
    /**
     * Verifica si todos los dígitos de un número son pares.
     *
     * @param numero El número a verificar.
     * @return true si todos los dígitos son pares, false de lo contrario.
     */
    public static boolean Hyperpar(long numero) {
        /* Un número se considera hyperpar cuando todos sus dígitos son pares.
        Ejemplo:
        24680 es hyperpar
        2568 no es hyperpar*/

        if (numero == 0) {
            return true;
        }

        long digit;
        boolean hyperpar = true;

        while (numero > 0 && hyperpar) {
            digit = numero % 10; // Extraer el último dígito del número
            if (digit % 2 != 0) { // Verificar si el dígito extraído es impar
                hyperpar = false; // El número ya no es hyperpar, se establece hyperpar en false
            }
            numero /= 10; // Eliminar el último dígito avanzando hacia la siguiente posición decimal
        }

        /**
         * // Extraer el último dígito del número
         * // Verificar si el dígito extraído es impar
         * // El número ya no es hyperpar, se establece hyperpar en false
         * // Eliminar el último dígito avanzando hacia la siguiente posición decimal
         */

        return hyperpar;
    }
}
