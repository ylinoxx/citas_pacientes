package citas_pacientes;

import java.util.LinkedList;

public class main_pacientes {
    public static void main(String[] args) {
        ingreso_pacientes ips = new ingreso_pacientes();
        LinkedList<lista_pacientes> list = ips.pacientes();
        mostrar_lista ml = new mostrar_lista();
        ml.mostrar(list);
    }
}