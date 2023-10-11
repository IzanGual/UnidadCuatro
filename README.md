import java.util.Scanner;

public class UnidadCuatro{
    public static void main(String[] args) {
    //ej1();
    //ej2();
    //ej3();
    //ej4();
    //ej5();
    //ej6();
    //ej7();
    //ej8();
    //ej9();
    //ej10();
    //ej11();
    //ej12();
    //ej13();
    //ej14();
    //ej15();
    //ej16();
    //ej17();
    //ej18();
    }    

//EJERCICIOS NIVEL PADAWAN

    public static void ej1(){
    System.out.println("Buenos días");
    }

    public static void ej2(){
        int lado = 5;
            int area = 0;
            area = lado * lado;

        System.out.println("El área de un cadrado cuyo lado es 5 es "+area+"");
    }

    public static void ej3(){
            System.out.println("Introduce el lado del cuadrádo del cual quieras calcular el área");
        Scanner input = new Scanner(System.in); 
        int lado = 0;
        int area = 0;
            lado = input.nextInt();
            area = lado * lado;  
       
        System.out.println("El área de un cadrado cuyo lado sea "+lado+" es "+area+"");
    }

    public static void ej4(){
        int x = 0;
        int y = 0;
        int suma = 0;
        int resta = 0;
        int producto = 0;
        int division = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Dame x");
        x = input.nextInt();
        System.out.println("Dame y");
        y = input.nextInt();
        suma = x + y;
        System.out.println("La suma de "+x+" + "+y+" es igual a "+suma+". ");
        resta = x - y;
        System.out.println("La resta de "+x+" - "+y+" es igual a "+resta+". ");
        producto = x * y;
        System.out.println("El producto de "+x+" * "+y+" es igual a "+producto+". ");
        division = x / y;
        System.out.println("La división de "+x+" / "+y+" es igual a "+division+". ");
    }

    public static void ej5(){

        Scanner input = new Scanner(System.in);
        double radio = 0;
        double diametro = 0;
        double longitud = 0;
        double area = 0;
        double volumen = 0;
   
        System.out.println("Introduce el número que corresponda a la longitd de el radio de tú circinferencia");

        radio = input.nextInt();
        diametro = radio * 2;
        longitud = diametro * Math.PI;
        System.out.println("La longitud de la circunferencia es "+longitud+"");

    
        area = Math.PI * Math.pow(radio,2);
        System.out.println("El área del circulo es "+area+"");

        volumen = (4.0/3) * Math.PI * Math.pow(radio, 3);
        System.out.println("El volumen del circulo es "+volumen+"");
    }

    public static void ej6(){
        Scanner input = new Scanner(System.in);
        double precio = 0;
        double precioventa = 0;
        double porcentaje = 0;

        System.out.println("Introduce el precio de el articulo");
        precio = input.nextDouble();

        System.out.println("Introduce el precio de venta real del articulo");
        precioventa = input.nextDouble();

        porcentaje = (100 * precioventa) / precio;
        System.out.println("El porcentaje de descuento realizado es del "+porcentaje+"%");

    }

    public static void ej7(){
        Scanner input = new Scanner(System.in);
        double distanciamillas = 0;
        double milla = 1852;
        double distanciametros = 0;
        
        System.out.println("Introduce la distncia en millas que quieres transformar a metros");
        distanciamillas = input.nextDouble();

        distanciametros = milla * distanciamillas;
        System.out.println(""+distanciamillas+" millas marinas esquivalen a "+distanciametros+" metros");

    }

    public static void ej8(){
        Scanner input = new Scanner(System.in);
        int edad = 0;
        System.out.println("Dime tu edad");
        edad = input.nextInt();

        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }

        else {
            System.out.println("Vuelve a introducir tu edad");
        }
    }

    public static void ej9(){
          Scanner input = new Scanner(System.in);
            int edad = 0;
            System.out.println("Dime tu edad");
            edad = input.nextInt();

        if (edad >= 18){
            System.out.println("eres mayor de edad");
        }

        else {
            System.out.println("eres menor de edad");
        }
    }

//EJERCICIOS NIVEL JEDI

    public static void ej10(){
        int x = 0;
        int y = 0;
        int suma = 0;
        int resta = 0;
        int producto = 0;
        int division = 0;
        
            Scanner input = new Scanner(System.in);
            
            System.out.println("Dame x");
            x = input.nextInt();
            
            System.out.println("Dame y");
            y = input.nextInt();
            if (y == 0 || x == 0){
                    suma = x + y;
                    System.out.println("La suma de "+x+" + "+y+" es igual a "+suma+". ");
                    resta = x - y;
                    System.out.println("La resta de "+x+" - "+y+" es igual a "+resta+". ");
                    producto = x * y;
                    System.out.println("El producto de "+x+" * "+y+" es igual a "+producto+". ");

                    System.out.println("La división de "+x+" / "+y+" no es posible ya que y es igual a 0");
            }
                   
            else{
                    suma = x + y;
                    System.out.println("La suma de "+x+" + "+y+" es igual a "+suma+". ");
                    resta = x - y;
                    System.out.println("La resta de "+x+" - "+y+" es igual a "+resta+". ");
                    producto = x * y;
                    System.out.println("El producto de "+x+" * "+y+" es igual a "+producto+". ");
                    division = x / y;
                    System.out.println("La división de "+x+" / "+y+" es igual a "+division+". ");
            }
        }


        public static void ej11(){
            Scanner input = new Scanner(System.in);
            double uno = 0;
            double dos = 0;

            System.out.println("Introduce el primer número");
            uno = input.nextDouble();

            System.out.println("Introduce el segundo número");
            dos = input.nextDouble();

            if(uno > dos){
                System.out.println(""+uno+" es mayor que "+dos+"");
            }

            else{
                System.out.println(""+dos+" es mayor que "+uno+"");
            }
        }

        public static void ej12(){
            Scanner input = new Scanner(System.in);
            double numero = 0;

            System.out.println("Introduce un número y te dire si es positivo o negativo."); 
            numero = input.nextDouble();

            if(numero >= 0){
               System.out.println("Tu número es positivo"); 
            }
            
            else{
                System.out.println("Tu númro es negativo");
            }
        
        }

        public static void ej13(){
            Scanner input = new Scanner(System.in);
            double uno = 0;
            double dos = 0;

            System.out.println("Introduce el primer número");
            uno = input.nextDouble();

            System.out.println("Introduce el segundo número");
            dos = input.nextDouble();

            if(uno < dos){
                System.out.println(""+uno+"  "+dos+"");
            }

            else{
                System.out.println(""+dos+"  "+uno+"");
            }
        
        }

        public static void ej14(){
            Scanner input = new Scanner(System.in);
            double uno = 0;
            double dos = 0;

            System.out.println("Introduce el primer número");
            uno = input.nextDouble();

            System.out.println("Introduce el segundo número");
            dos = input.nextDouble();

            if(uno == dos){
                System.out.println("Son iguales");
            }

            else{
                if(uno > dos){
                    System.out.println(""+uno+" es mayor que "+dos+"");
                }

                 else{
                    System.out.println(""+dos+" es mayor que "+uno+"");
                }
            }
        }

          public static void ej15(){
            Scanner input = new Scanner(System.in);
            double uno = 0;
            double dos = 0;
            double tres = 0;

            System.out.println("Introduce el primer número");
            uno = input.nextDouble();

            System.out.println("Introduce el segundo número");
            dos = input.nextDouble();

            System.out.println("Introduce el tercer número");
            tres = input.nextDouble();

            if(uno > dos){
                if(uno > tres){
                System.out.println("El número "+uno+" es el mayor");
                }
                else{
                System.out.println("El número "+tres+" es el mayor"); 
                }
            }

            else{
                if(dos > tres){
                    System.out.println("El número "+dos+" es el mayor");
                }

                 else{
                    System.out.println("El número "+tres+" es el mayor");
                }
            }
        }


//EJERCICIOS NIVEL MAESTRO JEDI

        public static void ej16(){
            Scanner input = new Scanner(System.in);
            double nota = 0;
            System.out.println("Escribe una calificación del 1 al 10");
            nota = input.nextDouble();
            if(nota >= 0 & nota <3){
                System.out.println("Muy Deficiente.");
            }
            
            if(nota >= 3 & nota <5){
                System.out.println("Insuficiente.");
            }

            if(nota >= 5 & nota <6){
                System.out.println("Bien.");
            }

            if(nota >= 6 & nota <9){
                System.out.println("Notable.");
            }

            if(nota >= 9 & nota <10){
                System.out.println("Sobresaliente.");
            }
        }

        public static void ej17(){
            Scanner input = new Scanner(System.in);
                int horas = 0;
                int minutos = 0;
                int segundos = 0;
            System.out.println("Introduce las horas de 0 a 23 ");
                horas = input.nextInt();
    
            System.out.println("Introduce los minutos de 0 a 59 ");
                minutos = input.nextInt();
    
            System.out.println("Introduce los segundos de 0 a 59 ");
                segundos = input.nextInt();
    
                segundos++;
    
            if (segundos > 59) {
                segundos = 0;
                minutos++;
            }
    
            if (minutos > 59) {
                minutos = 0;
                horas++;
            }
    
            if (horas > 24) {
                horas = 0;
            }
    
            System.out.println("Son las " + horas + ":" + minutos + ":" + segundos + "");
        }

        public static void ej18() {

    // Variables que han ido surgiendo
            Scanner input = new Scanner(System.in);
            double salarioNeto = 0;
            double tasas = 0;
            double horasextra = 0;

    // Pedir datos
            System.out.println("Introduce tu nombre: ");
            String nombre = input.nextLine();
    
            System.out.println("Introduce el número de horas trabajadas: ");
            double horasTrabajadas = input.nextDouble();
    
            System.out.println("Introduce la tarifa por hora: ");
            double tarifaPorHora = input.nextDouble();
            
            System.out.println("Tu nombre: "+nombre+"");

    // Salario bruto
            double salarioBruto = 0;
    
            if (horasTrabajadas <= 35) {
                salarioBruto = horasTrabajadas * tarifaPorHora;
            }
    
            else {   
                horasextra = horasTrabajadas - 35; 
                salarioBruto = horasextra * (tarifaPorHora * 1.5);
                double trenta = 35 * tarifaPorHora;
                salarioBruto = salarioBruto + trenta;
            }
            System.out.println("Tu Salario bruto: "+salarioBruto+"€");
            
    // Tasas impuestos
            if(salarioBruto < 500){
                salarioNeto = salarioBruto;
            System.out.println("Tu tasas: 0€");
            }

            if(salarioBruto > 500 & salarioBruto < 900){
                salarioNeto= salarioBruto - 500;
                salarioNeto = salarioNeto * 0.75;
                salarioNeto = salarioNeto+ 500;
            System.out.println("Tu nombre: "+nombre+"");
                tasas = salarioBruto - salarioNeto;
            System.out.println("Tu tasas: "+tasas+"€");
            }
 
            if(salarioBruto > 900){
                salarioNeto = salarioBruto - 900;
                salarioNeto = salarioNeto * 0.55;
                salarioNeto = salarioNeto + 500 + 300;
                tasas = salarioBruto - salarioNeto;
            System.out.println("Tu tasas: "+tasas+"€");
            }
            
            System.out.println("Tu salario neto es: "+salarioNeto+"€");
            
        }
}

