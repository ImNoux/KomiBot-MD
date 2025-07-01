import java.util.Scanner;

public class MenuOpciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Sumar y calcular el promedio de 3 números");
            System.out.println("2. Verificar calificación de un alumno");
            System.out.println("3. Mostrar el número mayor entre dos números");
            System.out.println("4. Ordenar dos números enteros");
            System.out.println("5. Realizar operaciones básicas");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Sumar y calcular el promedio de 3 números
                    System.out.print("Ingrese el primer número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2 = scanner.nextDouble();
                    System.out.print("Ingrese el tercer número: ");
                    double num3 = scanner.nextDouble();
                    double suma = num1 + num2 + num3;
                    double promedio = suma / 3;
                    System.out.println("La suma es: " + suma);
                    System.out.println("El promedio es: " + promedio);
                    break;

                case 2:
                    // Verificar calificación de un alumno
                    System.out.print("Ingrese la calificación del alumno: ");
                    double calificacion = scanner.nextDouble();
                    if (calificacion < 7) {
                        System.out.println("Reprobado");
                    } else {
                        System.out.println("Aprobado");
                    }
                    break;

                case 3:
                    // Mostrar el número mayor entre dos números
                    System.out.print("Ingrese el primer número: ");
                    double numA = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double numB = scanner.nextDouble();
                    double mayor = (numA > numB) ? numA : numB;
                    System.out.println("El número mayor es: " + mayor);
                    break;

                case 4:
                    // Ordenar dos números enteros
                    System.out.print("Ingrese el primer número entero: ");
                    int entero1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número entero: ");
                    int entero2 = scanner.nextInt();
                    if (entero1 > entero2) {
                        System.out.println("Orden: " + entero2 + ", " + entero1);
                    } else {
                        System.out.println("Orden: " + entero1 + ", " + entero2);
                    }
                    break;

                case 5:
                    // Realizar operaciones básicas
                    System.out.print("Ingrese el primer número: ");
                    double numX = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double numY = scanner.nextDouble();
                    System.out.println("Seleccione la operación: 1. Suma, 2. Producto, 3. División");
                    int operacion = scanner.nextInt();
                    double resultado;
                    switch (operacion) {
                        case 1:
                            resultado = numX + numY;
                            System.out.println("Resultado de la suma: " + resultado);
                            break;
                        case 2:
                            resultado = numX * numY;
                            System.out.println("Resultado del producto: " + resultado);
                            break;
                        case 3:
                            if (numY != 0) {
                                resultado = numX / numY;
                                System.out.println("Resultado de la división: " + resultado);
                            } else {
                                System.out.println("Error: División por cero.");
                            }
                            break;
                        default:
                            System.out.println("Opción no válida. Resultado: 0");
                            break;
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
            System.out.println();
        } while (opcion != 0);

        scanner.close();
    }
                              }
