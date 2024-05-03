
import java.util.LinkedList;

public class main_pacientes {
    public static void main(String[] args) {
        ingreso_pacientes ips = new ingreso_pacientes();
        LinkedList<lista_pacientes> list = ips.pacientes();
        mostrar_lista ml = new mostrar_lista();
        ml.mostrar(list);
        agg_docs ads = new agg_docs();
        LinkedList<doctores> listdoc = ads.agg();
        mostrarDocotres Md = new mostrarDocotres();
        Md.mostrar(listdoc);
    }
}
