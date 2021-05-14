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
public class Desarrollador extends Empleado {
    int AñosDeExeriencia;
    String LenguajePreferido;
    int HorasDeTrabajoDiarias;

    public Desarrollador(int AñosDeExeriencia, String LenguajePreferido, int HorasDeTrabajoDiarias, int EmployeeID, String Nombre, String Apellido, int AñosDeContrato, int NumProyectos, String Username, String Password) {
        super(EmployeeID, Nombre, Apellido, AñosDeContrato, NumProyectos, Username, Password);
        this.AñosDeExeriencia = AñosDeExeriencia;
        this.LenguajePreferido = LenguajePreferido;
        this.HorasDeTrabajoDiarias = HorasDeTrabajoDiarias;
    }

    

    public int getAñosDeExeriencia() {
        return AñosDeExeriencia;
    }

    public void setAñosDeExeriencia(int AñosDeExeriencia) {
        this.AñosDeExeriencia = AñosDeExeriencia;
    }

    public String getLenguajePreferido() {
        return LenguajePreferido;
    }

    public void setLenguajePreferido(String LenguajePreferido) {
        this.LenguajePreferido = LenguajePreferido;
    }

    public int getHorasDeTrabajoDiarias() {
        return HorasDeTrabajoDiarias;
    }

    public void setHorasDeTrabajoDiarias(int HorasDeTrabajoDiarias) {
        this.HorasDeTrabajoDiarias = HorasDeTrabajoDiarias;
    }

    @Override
    public String toString() {
        return super.toString() +" Desarrollador{" + "A\u00f1osDeExeriencia=" + AñosDeExeriencia + ", LenguajePreferido=" + LenguajePreferido + ", HorasDeTrabajoDiarias=" + HorasDeTrabajoDiarias + '}';
    }

    @Override
    public double CalcularSalario() {
        double SueldoCalculado=(super.getNumProyectos()*115000*2)/(super.getNumProyectos()+super.getAñosDeContrato());
        return SueldoCalculado;
    }
    
    
    
    
}
