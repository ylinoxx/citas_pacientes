package citas_pacientes;

import java.util.LinkedList;

public class mostrar_lista {
    public void mostrar(LinkedList<lista_pacientes> list){
        String candena = " ";
        for (lista_pacientes lista_pacientes : list) {
            candena = "[" + lista_pacientes.getName() + "]["+ lista_pacientes.getRh() + "][" + lista_pacientes.getAge() + "][" + lista_pacientes.getLastAppointment() + "]"; 
        }
        System.out.println(candena);
    }
}
