import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] testArr = {1, 15, -13, 12, 60, 132, 1, -13};

//        differenceBiggestSmallest(testArr);
//        calculateSmallestAndNextSmallest(testArr);
        resolveEquation(15, 20);
    }


    public static void differenceBiggestSmallest(int[] arr) {

        // 1. Encontrar el mayor de los números del array
        //  1.1 Recorro el array
        //  1.2 Para cada item comparo con el anterior
        //  1.3 De la comparación me quedaré con el mayor
        // 2. Encontrar el menor de los números del array
        //  2.1 Recorro el array
        //  2.2 Para cada item comparo con el anterior
        //  2.3 De la comparación me quedaré con el menor
        // 3. Calcular la diferencia

        int mayor = arr[0];
        int menor = arr[0];
        for (int i = 1; i <= arr.length-1; i++) {
            if (mayor < arr[i]) {
                mayor = arr[i];
            }
            if (menor > arr[i]) {
                menor = arr[i];
            }
        }

        System.out.println("La diferencia entre el mayor y el menor es " + (mayor - menor));

    }

    public static void calculateSmallestAndNextSmallest(int[] arr) {
        //1. Encontrar el elemento más pequeño del array.
        //  1.1 Recorro el array
        //  1.2 Para cada item comparo con el anterior
        //  1.3 De la comparación me quedaré con el menor
        //2. Encontrar el siguiente elemento más pequeño, que sea mayor que el primero.
        //  2.1 Recorro el array
        //  2.2 Para cada item comparo con el anterior y también con el más pequeño
        //  2.3 De la comparación me quedaré con el menor si es mayor que el más pequeño.
        int menor = arr[0];
        int siguienteMenor = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (menor > arr[i]) {
                menor = arr[i];
            }
            if (arr[i] > menor && arr[i] < siguienteMenor){
                siguienteMenor = arr[i];
            }
        }

        System.out.println("El más pequeño es " + menor + " el siguiente más pequeño es " + siguienteMenor);
    }

    /* x22 + (4y/5 -x)22 */
    public static void resolveEquation(double x, double y) {
        // 1. calcular cuadrado x
        // 2. calcular 4 * y
        // 3. calcular resultado paso 2 / 5 - x
        // 5. cacular resultado paso 4 al cuadrado
        // 6. sumar r. paso 1 + resultado p 5

//        double cuadradoX = Math.pow(x, 2);
//        double cuatroY = 4*y;
//        double cuatroYDiv5MenosX = cuatroY /5-x;
//        double cuadrado2parte = Math.pow(cuatroYDiv5MenosX, 2);
//        double resultado = cuadradoX + cuadrado2parte;

        double resultado = Math.pow(x,2) + Math.pow((4*y/5 -x), 2);


        System.out.println(resultado);
    }
}
