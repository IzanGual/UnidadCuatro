import java.util.Scanner;

public class UnidadCinco{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\033[34m Introduce el número del ejercicio que desees corregir");
        int e = input.nextInt();

    if(e == 1){
         ej1();
    }

    if(e == 2){
         ej2();
    }

    if(e == 3){
         ej3();
    }

      if(e == 4){
         ej4();
    }

    if(e == 5){
         ej5();
    }

      if(e == 6){
         ej6();
    }

     if(e == 7){
         ej7();
    }

     if(e == 8){
         ej8();
    }

    if(e == 9){
         ej9();
    }

      if(e == 10){
         ej10();
    }

     /*if(e == 11){
         ej11();
    }

     if(e == 12){
         ej12();
    }

     if(e == 13){
         ej13();
    }

     if(e == 14){
         ej14();
    }

     if(e == 15){
         ej15();
    }

     if(e == 16){
         ej16();
    }

     if(e == 17){
         ej17();
    }

     if(e == 18){
         ej18();
    }

     if(e > 18){
         System.out.println("Ese ejercició NO existe");;
    }*/

}

//NIVEL PADAWAN

public static void ej1(){
System.out.println("\033[35mEjercicio 1");
System.out.println("\033[37m");


    for (int i = 1; i <= 20; i++){
        System.out.println(i);
    }   
}

public static void ej2(){
System.out.println("\033[35mEjercicio 2");
System.out.println("\033[37m");

    
    for (int i = 2; i <= 200; i = i + 2){
        System.out.println(i);    
    }
}

public static void ej3(){
System.out.println("\033[35mEjercicio 3");
System.out.println("\033[37m");


    for (int i = 1; i <= 200; i++){
        if(i % 2 == 0){
            System.out.println(i);
        }
    }   
}

public static void ej4(){
System.out.println("\033[35mEjercicio 4");
System.out.println("\033[37m");


    System.out.println("Introduce el número asta el que quieres contar. "); 
    Scanner input = new Scanner (System.in);
        int cont = input.nextInt();
    for (int i = 1; i <= cont; i++){
        System.out.println(i);
    }
}

//NIVEL JEDI

public static void ej5(){
System.out.println("\033[35mEjercicio 5");
System.out.println("\033[37m");


    System.out.println("Introduce el número del cual quieras su factorial");
    Scanner input  = new Scanner (System.in);
    int num = input.nextInt();  
    int r = 1;
    for (int i = 0; i < num; i++){
        r = r * (num - i);
    }
    System.out.println(r);
}

public static void ej6(){
System.out.println("\033[35mEjercicio 6");
System.out.println("\033[37m");


    int n = 0;
    boolean boo;
    boo = false;
        System.out.println("Introduce 10 números");
        Scanner input  = new Scanner (System.in);

    for (int i = 1; i <= 10; i++){
        n = input.nextInt();
        if(n < 0){
            boo = true;
        }

        }
        if (boo == true){
            System.out.println("Has introducido al menos un número negativo");
    } 
}

public static void ej7(){
System.out.println("\033[35mEjercicio 7");
System.out.println("\033[37m");


    Scanner input = new Scanner(System.in);
    int z = 0;
    int negativo = 0;
    int positivo = 0;

    System.out.println("Introduce 10 números y te dire cuantos número positivos y cuentos negativos has introducido");

    for (int i = 1; i <= 10; i++){
        z = input.nextInt();
        if (z < 0){ 
            negativo++;
        }
        else{
            positivo++;
        }
    } 
    System.out.println("Has introducido "+positivo+" números positivos y "+negativo+" números negativos");
}

public static void ej8(){
System.out.println("\033[35mEjercicio 8");
System.out.println("\033[37m");
    
    Scanner input = new Scanner(System.in);
    int z = 1;
    int negativo = 0;
    int positivo = 0;
    boolean boo = false;

    System.out.println("Introduce la cantidad de  números que desees y te dire cuantos número positivos y cuentos negativos has introducido");
    
    while (z != 0){
        z = input.nextInt();
        if (z < 0){ 
            negativo++;
            boo = true;}
        else{
            positivo++;
        }
    }
        if (boo == true){System.out.println("Has introducido al menos un número negativo");}
        System.out.println("Has introducido "+positivo+" números positivos y "+negativo+" números negativos");
}

public static void ej9(){
System.out.println("\033[35mEjercicio 9");
System.out.println("\033[37m");

    int suma = 0;
    int multi = 1;

        for (int i = 1; i < 11; i++){

            suma = suma + i;
            multi = multi * i;
        }  
    System.out.println("La suma de los 10 primero número naturales es "+suma+"");
    System.out.println("El producto de los 10 primero números naturales es "+multi+"");
}

//NIVEL MAESTRO JEDI

public static void ej10(){
System.out.println("\033[35mEjercicio 1");
System.out.println("\033[37m");

Scanner input = new Scanner(System.in);
int z = 0;
boolean boo = false;

z = input.nextInt();
while (z > 0 && z < 10){
    //for (int i = 1; z == -1 ; i++){
        if (z == 10){
            boo = true;
        }
        if (z == -1){
            break;
        }   
    }
    if(boo == true){
        System.out.println("Introduciste al menos una nota con el valor 10");
    }  
} ARREGLAR

}


