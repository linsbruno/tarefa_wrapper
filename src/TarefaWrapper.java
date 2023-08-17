public class TarefaWrapper {

    public static void main (String[] args) {
        int numero = 10;
        long numeroMaior = 1000L;
        double numeroDecimal = 10.5;
        boolean logico = true;
        float numeroDecimal2 =5.5F;
        short numeroPequeno = 2;
        byte umBit = 1;
        char caracter = 'a';

        Integer valorNumero = Integer.valueOf(numero);
        Long valorNumeroMaior = Long.valueOf(numeroMaior);
        Double valorNumeroDecimal = Double.valueOf(numeroDecimal);
        Boolean valorLogico = Boolean.valueOf(logico);
        Float valorNumeroDecimal2 = Float.valueOf(numeroDecimal2);
        Short valorNumeroPequeno = Short.valueOf(numeroPequeno);
        Byte valorByte = Byte.valueOf(umBit);
        Character valorCaracter = Character.valueOf(caracter);

        System.out.println(valorNumero);
        System.out.println(valorNumeroMaior);
        System.out.println(valorNumeroDecimal);
        System.out.println(valorLogico);
        System.out.println(valorNumeroDecimal2);
        System.out.println(valorNumeroPequeno);
        System.out.println(valorByte);
        System.out.println(valorCaracter);

    }

}
