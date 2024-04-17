package exercicis_formatmd.exercici_tres;
/**
 * La clase Empleat representa a un empleado y contiene métodos para calcular el salario bruto
 * y neto, así como las excepciones asociadas a ciertas condiciones.
 */
public class Empleat {

    /**
     * Calcula el salario bruto de un empleado en función de su tipo, las ventas mensuales y las horas extra.
     *
     * @param tipusEmpleat el tipo de empleado ("venedor" o "encarregat").
     * @param vendesMes    las ventas mensuales del empleado.
     * @param horesExtra   las horas extra trabajadas.
     * @return el salario bruto calculado.
     * @throws MaException si el tipo de empleado no es válido o si las ventas mensuales o las horas extra son negativas.
     */
    public double calculaSalariBrut(String tipusEmpleat, double vendesMes, int horesExtra) throws MaException {
        if (tipusEmpleat == null || (!tipusEmpleat.equals("venedor") && !tipusEmpleat.equals("encarregat"))) {
            throw new MaException("El tipo de vendedor no es correcto");
        }
        if (vendesMes < 0 || horesExtra < 0) {
            throw new MaException("El valor no puede ser negativo");
        }

        double salariBase = tipusEmpleat.equals("venedor") ? 1000 : 1500;
        double prima = 0;
        if (vendesMes >= 1000 && vendesMes < 2500) {
            prima = 100;
        } else if (vendesMes >= 2500) {
            prima = 200;
        }
        double salariBrut = salariBase + prima + (horesExtra * 18.57);
        return salariBrut;
    }

    /**
     * Calcula el salario neto de un empleado en función de su salario bruto y las retenciones aplicadas.
     *
     * @param salariBrut el salario bruto del empleado.
     * @return el salario neto calculado.
     * @throws MaException si el salario bruto es negativo.
     */
    public double calculaSalariNet(double salariBrut) throws MaException {
        if (salariBrut < 0) {
            throw new MaException("El salario bruto no puede ser negativo");
        }

        double retencio;
        if (salariBrut >= 0 && salariBrut <= 999) {
            retencio = 0;
        } else if (salariBrut >= 1000 && salariBrut <= 1500) {
            retencio = 0.16;
        } else {
            retencio = 0.20;
        }

        double salariNet = salariBrut * (1 - retencio);
        return salariNet;
    }
}

