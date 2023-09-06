package source;
import java.time.LocalDate;

public class Tarea {
    private String descripcion;
    private int prioridad;
    private boolean completa;
    private final LocalDate fechaLimite;
    private LocalDate recordatorio;

    public Tarea(String descripcion, int prioridad, LocalDate fechaLimite){
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaLimite = fechaLimite;
        this.completa = false;
        this.recordatorio = null;
    }

    public void setRecordatorio (LocalDate recordatorio){
        this.recordatorio = recordatorio;
    }
    public void modificarDescripcion(String nuevaDescripcion){
        this.descripcion = nuevaDescripcion;
    }

    public void cambiarPrioridad(int nuevaPrioridad){
        this.prioridad = nuevaPrioridad;
    }

    public int getPrioridad(){
        return prioridad;
    }

    public void marcarComoCompleta(){
        this.completa = true;
    }

    public LocalDate getFechaRecordatorio(){
        return recordatorio;
    }
    public boolean estaVencida(){
        return !completa && LocalDate.now().isAfter(fechaLimite);
    }

    public LocalDate getFechaLimite(){return fechaLimite;}
    public boolean estaCompleta(){
        return completa;
    }

    public String getDescripcion() {return descripcion;}
    public String mostrarTarea(){
        if (estaCompleta()){
            return "(COMPLETA) " + descripcion;
        } else if (estaVencida()) {
            return "(VENCIDA)" + descripcion;
        } else {
            String esp = "";
            LocalDate hoy = LocalDate.now();

            if(recordatorio != null && recordatorio.isAfter(hoy)){
                esp = "(POR VENCER)";
            }
            return esp + descripcion;
        }
    }
}
