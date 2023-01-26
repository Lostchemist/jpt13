public class Arrays {
    public static void main(String[] args) {
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        System.out.println(cars[0]);
//
//
//        cars[0] = null;
//
//        System.out.println(cars.length);
//
//        System.out.println(cars[0]);
//
//
//        cars[0] = "Mercedes";
//        System.out.println(cars[0]);

        dowhileloop();
    }


    public static void forloop() {
        String[] names = {"Cristina", "Paul", "Maria", "John"};

        System.out.println("==== For ====");
        for (int i=0; i< names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public static void foreachloop() {
        String[] names = {"Cristina", "Paul", "Maria", "John"};

        System.out.println("==== Foreach ====");
        for (String name : names) {
            String cris = names[0];
            if (cris.equals(name)) {
                System.out.println("Hay dos Cristinas");
            }

            System.out.println(name);
        }
    }

    public static void whileloop() {
        String[] names = {"Cristina", "Paul", "Maria", "John"};
        System.out.println("==== While ====");
        int i =0;
        while(i < names.length) {
            System.out.println(names[i++]);
        }
    }

    public static void dowhileloop() {
        String[] names = {"Cristina", "Paul", "Maria", "John"};
        System.out.println("==== Do while ====");
        int i = 3;
        do {
            System.out.println(names[i--]);
        } while(i >= 0);
    }

    public static void updateArray () {
        int[] array = {5, 4, 3, 2, 1};

//        int primeraPos = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (i == array.length -1) {
//                array[i] = array[i] * primeraPos;
//            } else {
//                array[i] = array[i] * array[i+1];
//            }
//        }
//

        int ultimaPos = array[0] * array[array.length-1];
        for (int i = 0; i < array.length-1; i++) {
            array[i] = array[i] * array[i+1];
        }

        array[array.length-1] = ultimaPos;

    }

    public static void invertArray() {
        int[] array = {5, 4, 3, 2, 1};
        int[] result = new int[array.length];

        int i = 0;
//        int j = array.length -1;
        while(i < array.length) {
            result[array.length-1 - i] = array[i];
            i++;
//            j--;
        }

        /*
            i = 0
            array.length -1 = 4
            array.legnth -1 - i = 4 output[4] = array[0]

            i = 1
            array.legnth -1 - i = 3 output[3] = array[1]



         */



    }


}
