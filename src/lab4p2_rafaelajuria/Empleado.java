/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_rafaelajuria;

/**
 *
 * @author rajur
 */
public abstract class Empleado {
    int EmployeeID;
    String Nombre;
    String Apellido;
    int AñosDeContrato;
    int NumProyectos;
    double SueldoMensual;
    String Username;
    String Password;

    public Empleado(int EmployeeID, String Nombre, String Apellido, int AñosDeContrato, int NumProyectos, String Username, String Password) {
        this.EmployeeID = EmployeeID;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.AñosDeContrato = AñosDeContrato;
        this.NumProyectos = NumProyectos;
        this.SueldoMensual = 0;
        this.Username=Username;
        this.Password = Password;
    }
    public abstract double CalcularSalario();

    public Empleado() {
        this.SueldoMensual=0;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getAñosDeContrato() {
        return AñosDeContrato;
    }

    public void setAñosDeContrato(int AñosDeContrato) {
        this.AñosDeContrato = AñosDeContrato;
    }

    public int getNumProyectos() {
        return NumProyectos;
    }

    public void setNumProyectos(int NumProyectos) {
        this.NumProyectos = NumProyectos;
    }

    public double getSueldoMensual() {
        return SueldoMensual;
    }

    public void setSueldoMensual(double SueldoMensual) {
        this.SueldoMensual = SueldoMensual;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "Empleado{" + "EmployeeID=" + EmployeeID + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", A\u00f1osDeContrato=" + AñosDeContrato + ", NumProyectos=" + NumProyectos + ", SueldoMensual=" + SueldoMensual + ", Username=" + Username + ", Password=" + Password + '}';
    }
    
    
    
    
    
}
