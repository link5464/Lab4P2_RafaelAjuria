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
public class Proyectos {
    int ID;
    String EmpresaSolicitante;
    String Descripcion;
    int Duracion;
    String Estado;
    String[] DirectoresAsignados = new String[2];
    String[] DesarrolladoresAsignados = new String[5];
    String[] ConsultoresAsignados = new String[3];

    public Proyectos(int ID, String EmpresaSolicitante, String Descripcion, int Duracion, String Estado) {
        this.ID = ID;
        this.EmpresaSolicitante = EmpresaSolicitante;
        this.Descripcion = Descripcion;
        this.Duracion = Duracion;
        this.Estado = Estado;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmpresaSolicitante() {
        return EmpresaSolicitante;
    }

    public void setEmpresaSolicitante(String EmpresaSolicitante) {
        this.EmpresaSolicitante = EmpresaSolicitante;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        if(Estado.equals("Iniciado") || Estado.equals("Desarrollo") || Estado.equals("Terminado"))
           this.Estado = Estado;
        else
        {
            System.out.println("Estado no valido. Intente de Nuevo.");
        }
            
    }

    public String[] getDirectoresAsignados() {
        return DirectoresAsignados;
    }

    public void setDirectoresAsignados(String[] DirectoresAsignados) {
        this.DirectoresAsignados = DirectoresAsignados;
    }

    public String[] getDesarrolladoresAsignados() {
        return DesarrolladoresAsignados;
    }

    public void setDesarrolladoresAsignados(String[] DesarrolladoresAsignados) {
        this.DesarrolladoresAsignados = DesarrolladoresAsignados;
    }

    public String[] getConsultoresAsignados() {
        return ConsultoresAsignados;
    }

    public void setConsultoresAsignados(String[] ConsultoresAsignados) {
        this.ConsultoresAsignados = ConsultoresAsignados;
    }

    @Override
    public String toString() {
        return "Proyectos{" + "ID=" + ID + ", EmpresaSolicitante=" + EmpresaSolicitante + ", Descripcion=" + Descripcion + ", Duracion=" + Duracion + ", Estado=" + Estado + ", DirectoresAsignados=" + DirectoresAsignados + ", DesarrolladoresAsignados=" + DesarrolladoresAsignados + ", ConsultoresAsignados=" + ConsultoresAsignados + '}';
    }
    
    
}
