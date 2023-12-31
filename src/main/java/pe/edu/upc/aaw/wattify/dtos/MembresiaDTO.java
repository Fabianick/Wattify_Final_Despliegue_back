package pe.edu.upc.aaw.wattify.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MembresiaDTO {
    private int id_Membresia;
    private String tipoMembresia;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private BigDecimal precio;
    private UsersDTO user;

    public int getId_Membresia() {
        return id_Membresia;
    }

    public void setId_Membresia(int id_Membresia) {
        this.id_Membresia = id_Membresia;
    }

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(String tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public UsersDTO getUser() {
        return user;
    }

    public void setUser(UsersDTO user) {
        this.user = user;
    }
}
