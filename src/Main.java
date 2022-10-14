public class Main {
    public static void main(String[] args) {
        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        //Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
        System.out.println("If\n");
        int numeroIf = -10;
        if (numeroIf > 0){
            System.out.println("El Numero es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El Numero es negativo");
        }else {
            System.out.println("El Numero es igual a 0");
        }

        System.out.println("------------------------------------------------------");
        //Crea un bucle While, este bucle tendrá que tener como condición que
        // la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        //  -Incrementar el valor de la variable en uno cada vez que se ejecute.
        //  -Mostrarlo por pantalla cada vez que se ejecute.
        System.out.println("While\n");
        int numeroWhile = 0;

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        System.out.println("------------------------------------------------------");
        //Para el bucle Do While, deberás crear la misma estructura que en el While,
        // pero solo se debe ejecutar una vez.
        System.out.println("Do While\n");
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        }while (numeroWhile < 3);
        System.out.println("------------------------------------------------------");
        //Para el bucle For, crea una variable numeroFor,
        // esta variable tendrá como valor 0 y su condición
        // será que la variable sea igual o menor que 3, se
        // irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
        System.out.println("Bucle For\n");

        for (int numeroFor = 0; numeroFor<= 3; numeroFor++){
            System.out.println(numeroFor);
        }
        System.out.println("------------------------------------------------------");
        //Por último, para el Switch, deberás crear la variable estacion, y distintos case para las
        // cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar
        // un mensaje por consola informando de la estación en la que está. También habrá que poner un
        // default para cuando el valor de la variable no sea una estación.
        System.out.println("Switch\n");
        var estacion = "Invierno";

        switch(estacion){
            case "Verano" :
                System.out.println("Verano");
                break;
            case "Invierno" :
                System.out.println("Invierno");
                break;
            case "Otoño" :
                System.out.println("Otoño");
                break;
            case "Primavera" :
                System.out.println("Primavera");
                break;
            default:
                System.out.println("NO es una estación");
        }
    }
}