

import java.sql.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class ingreso_pacientes {
    public LinkedList <lista_pacientes> pacientes(){
        boolean bucle = true;
        Scanner in = new Scanner(System.in);
        LinkedList<lista_pacientes> listPatients = new LinkedList<lista_pacientes>();
        lista_pacientes item = new lista_pacientes(null, null, 0, null);
        System.out.println("Ingrese el nombre completo del paciente");
        item.setName(in.nextLine());
        System.out.println("Ingrese el Rh del paciente");
        item.setRh(in.next());
        System.out.println("Ingrese la edad del paciente");
        item.setAge(in.nextInt());
        in.nextLine();
        do{
            try{
                System.out.println("Ingrese cuando fue la ultima cita del paciente (AAAA-MM-DD)");
                item.setLastAppointment(Date.valueOf(in.nextLine()));
                bucle = false;
            }catch(Exception e){
                System.out.println("Porfavor ingresa la fecha en este formato (AAAA-MM-DD)");
                System.out.println("O revisa que la fecha ingresa sea correcta");
            }
        }while(bucle);
        listPatients.add(item);
        return listPatients;
    }
}
