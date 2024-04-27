package citas_pacientes;

import java.sql.Date;
import java.util.LinkedList;

public class agg_docs {
    public LinkedList<doctores> agg(){
        LinkedList<doctores> listDoc = new LinkedList<>();
        LinkedList<Date> disp_doc = new LinkedList<>();
        doctores doc1 = new doctores("Dr. Alejandro Garcia", disp_doc, "Activo");
        doctores doc2 = new doctores("Dr. Santiago Martínez", disp_doc, "Inactivo");
        doctores doc3 = new doctores("Dra. Valeria Ramírez", disp_doc, "Activo");
        doctores doc4 = new doctores("Dra. Paula Gómez", disp_doc, "Activo");
        for (int i = 5; i < 12; i++) {
            for (int j = 0; j < 31; j++) {
                String iString = String.valueOf(i);
                String jString = String.valueOf(j);
                if ((i == 6 || i == 9 || i == 11) && (j == 31)) {
                }else{
                    Date cadenaFecha = Date.valueOf(iString+"-"+jString+"-2024");
                    disp_doc.add(cadenaFecha);
                }
            }
        }
        doc1.setDisp_doc(disp_doc);
        listDoc.add(doc1);
        listDoc.add(doc2);
        listDoc.add(doc3);
        listDoc.add(doc4);
        return listDoc;
    }
}
