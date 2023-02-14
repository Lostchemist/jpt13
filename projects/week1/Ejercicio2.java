public class Ejercicio2 {
    public static void main(String[] args) {

        String productName = "  Super duper mega chulis zapas  ";
        String date = " 2023-01-25";

//        String productoFinal = productFormatter(productName, date);

        System.out.println(productFormatter(productName, date));
    }

    public static String productFormatter(String productName, String date ) {
        return productName.concat(date).trim().replace(" ", "_").toUpperCase();

//        String resultado = productName.trim();
//        resultado = resultado.replace(" ", "_");
//        resultado = resultado.concat(date);
//        resultado = resultado.toUpperCase();
//
//        return resultado;
    }


}
