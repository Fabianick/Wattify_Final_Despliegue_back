package pe.edu.upc.aaw.wattify.serviceinterfaces;
import pe.edu.upc.aaw.wattify.entities.Metodo_de_Pago;
import pe.edu.upc.aaw.wattify.entities.Role;

import java.time.LocalDate;
import java.util.List;

public interface IMetododePagoService {
    public void insert(Metodo_de_Pago metodo_de_pago);
    public List<Metodo_de_Pago> list();
    public void delete(int id_MetodoPago);
    public Metodo_de_Pago listarId(int Metodo_de_Pago);


}
