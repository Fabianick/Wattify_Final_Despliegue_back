package pe.edu.upc.aaw.wattify.dtos;

import java.math.BigDecimal;

public class Membresia_X_UsuarioDTO {
    private String tipoMembresia;

    private BigDecimal precioTotal;

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(String tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }



    public BigDecimal getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(BigDecimal precioTotal) {
        this.precioTotal = precioTotal;
    }
}
