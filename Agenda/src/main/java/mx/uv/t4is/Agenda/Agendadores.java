package mx.uv.t4is.Agenda;

public class Agendadores {
    private String Fecha;
    private String HorarioInicio ;
    private String Descripcion; 
    private int id;
    public String getFecha() {
        return Fecha;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }
    public String getHorarioInicio() {
        return HorarioInicio;
    }
    public void setHorarioInicio(String horarioInicio) {
        this.HorarioInicio = horarioInicio;
    }
    public void setFecha(String fecha) {
        this.Fecha = fecha;
    } 
}
