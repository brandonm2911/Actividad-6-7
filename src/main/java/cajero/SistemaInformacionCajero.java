package cajero;

import java.util.Scanner;

public class SistemaInformacionCajero {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String usuarioBanco = "BancoDeLaRepublicaColombiana", contrasenaBanco = "Nadi3PodraDesc1frarl0";
        double saldoBanco = 30000, saldoCuentasCorrientes = 2000;
        int opc;
        boolean banderaUsuario = false, banderaBanco = false;
        do {
            banderaUsuario = false; banderaBanco = false;
            saldoCuentasCorrientes = 2000;
            System.out.print("Ingrese el usuario: ");
            String usuario = scanner.nextLine();
            System.out.print("Ingrese la contraseña: ");
            String contraseña = scanner.nextLine();
            if (usuario.equals("Usiario1") || usuario.equals("Usuario2") || usuario.equals("Usuario3")) {
                System.out.println("hola");
                if (contraseña.equals("clave1") || contraseña.equals("clave2") || contraseña.equals("clave3")) {
                    banderaUsuario = true;
                    System.out.println("hola");
                }
            }
            if (usuario.equals(usuarioBanco)) {
                if (contraseña.equals(contrasenaBanco)) {
                    banderaBanco = true;
                }
            }
            if (banderaUsuario) {
                do {
                    System.out.println("1. Consultar saldo.");
                    System.out.println("2. Retirar dinero");
                    System.out.println("3. Salir.");
                    System.out.print("Ingrese una opcion por favor: ");
                    opc = scanner.nextInt();
                    if (opc == 1) {
                        System.out.println("El saldo de la cuenta actual es: " + saldoCuentasCorrientes);
                    } else if (opc == 2) {
                        if (saldoCuentasCorrientes > 0) {
                            double retirar_saldo = 0;
                            do{
                            System.out.print("Ingrese el monto que desea retirar: ");
                            retirar_saldo = scanner.nextDouble();
                            if(retirar_saldo < 0){
                                System.out.println("La cantidad de dinero a retirar debe ser positiva");
                            }
                            }while(retirar_saldo < 0);
                            if (retirar_saldo > saldoBanco) {
                                System.out.println("El cajero no tiene esa cantidad de dinero");
                            } else if (saldoCuentasCorrientes - retirar_saldo < 0) {
                                System.out.println("No tienes esa cantidad de dinero");
                            }else{
                                saldoCuentasCorrientes -=  retirar_saldo;
                            }
                        }
                    } else if(opc == 3){
                        System.out.println("Gracias por utilizar el cajero :D");
                        break;
                    }else{
                        System.out.println("Opcion incorrecta");
                    }
                } while (opc != 3);
            } else {
                System.out.println("Contraseña incorrecta");
            }
            if (banderaBanco) {
                do {
                    System.out.println("1. Consultar saldo.");
                    System.out.println("2. Ingresar dinero");
                    System.out.println("3. Salir.");
                    System.out.print("Ingrese una opcion por favor: ");
                    opc = scanner.nextInt();
                    if (opc == 1) {
                        System.out.println("El saldo actual del cajero es: " + saldoBanco);
                    } else if (opc == 2) {
                        System.out.print("Ingrese el saldo a agregar: ");
                        double añadir_saldo = scanner.nextDouble();
                        saldoBanco += añadir_saldo;
                    }
                } while (opc != 3);
            } else {
                System.out.println("Contraseña incorrecta");
            }
            scanner.nextLine();
        } while (true);
    }
}


