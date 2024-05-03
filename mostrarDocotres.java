import java.util.LinkedList;

public class mostrarDocotres {
    public void mostrar(LinkedList<doctores> list_docs){
        String candena = " ";
    for (doctores doctores : list_docs) {
        candena = "[" + doctores.getName_doc() + "]["+ doctores.getState() + "][" + doctores.getDisp_doc() + "]";
    }
        System.out.println(candena);
    }
}
