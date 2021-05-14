/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_rafaelajuria;


import java.util.Scanner;

/**
 *
 * @author rajur
 */
public class Acciones {
    static Scanner read = new Scanner(System.in);
    
    public static void AgregarDesarrollador()
    {
        System.out.print("Ingrese el numero de Empleado: ");
        int EmployeeID = read.nextInt();
        System.out.print("Ingrese el nombre completo: ");
        read.next();
        String Nombre = read.nextLine();
        String[] NombreArray = Nombre.split(" ");
        System.out.print("Ingrese los años de contrato: ");
        int AñosDeContrato = read.nextInt();
        System.out.print("Ingrese la cantidad de proyectos en los que ha participado: ");
        int NumProyectos = read.nextInt();
        System.out.print("Ingrese la cantidad de años de experiencia que tiene el empleado: ");
        int AñosExperiencia = read.nextInt();
        System.out.print("Ingrese la cantidad de horas  que trabaja el empleado: ");
        int HorasTrabajadas = read.nextInt();
        System.out.print("Ingrese el lenguaje preferido:");
        String LenguajePreferido=read.next();
        String Username = NombreArray[0]+"."+NombreArray[1];
        System.out.println("Nombre de Usuario: "+Username);
        String Password = "EmpleadoNuevoGBX";
            System.out.println("Contraseña establecida");
        Main.Desarrolladores.add(new Desarrollador(AñosExperiencia,LenguajePreferido,HorasTrabajadas,EmployeeID,NombreArray[0],NombreArray[1],AñosDeContrato,NumProyectos,Username,Password));
        Main.Desarrolladores.get(Main.Desarrolladores.size()-1).setSueldoMensual(Main.Desarrolladores.get(Main.Desarrolladores.size()-1).CalcularSalario());
                
    }
    
}
