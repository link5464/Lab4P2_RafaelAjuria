/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_rafaelajuria;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rajur
 */
public class Main {
    static ArrayList<Desarrollador> Desarrolladores = new ArrayList();
    static ArrayList Consultores = new ArrayList();
    static ArrayList Directores = new ArrayList();
    static ArrayList<Proyectos> Proyectos = new ArrayList();
    static Scanner read = new Scanner(System.in);
    static Boolean AdminLogin = false;
    static int UsuarioLogueado;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Acciones.AgregarDesarrollador();
        
    }
    public void Menu()
    {
        System.out.println("Ingrese su rol.");
        System.out.println("0.Salir");
        System.out.println("1.Admin");
        System.out.println("2.Desarrollador");
        System.out.println("3.Consultor");
        System.out.println("4.Director");
        int opcion = read.nextInt();
        switch(opcion)
        {
            case 0:
            {
                System.exit(0);
            }
            case 1:
            {
              System.out.print("Por favor, ingrese su nombre de usuario: ");
              String tUsername=read.next();
              System.out.print("Ingrese la contraseña para "+tUsername+": ");
              String tPassword=read.next();
              if(tUsername.equals("admin") && tPassword.equals("1234"))
              {
                  AdminLogin = true;
                  EyeOfSauron();
              }
              else
              {
                  System.out.println("Nombre de Usuario o contraseña incorrectos. Intente de Nuevo.");
                  Menu();
              }
            }
        }
    }
    public  void EyeOfSauron()
    {
        System.out.println("Ingrese el menu al que desea acceder.");
        System.out.println("0.Cerrar Sesion");
        System.out.println("1.Desarrollador");
        System.out.println("2.Consultor");
        System.out.println("3.Director");
        int opcion = read.nextInt();
        switch(opcion)
        {
            
        }
    }
    public void MenuDesarrollador()
    {
        System.out.println("Ingrese el menu al que desea acceder.");
        System.out.println("0.Cerrar Sesion");
        System.out.println("1.Ver Informacion");
        System.out.println("2.Eliminar Cuenta");
        System.out.println("3.Ver Proyectos");
        int opcion = read.nextInt();
        switch(opcion)
        {
            
        }  
    }
    public void MenuConsultor()
    {
        
    }
    
}
