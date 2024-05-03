

import java.sql.Date;
import java.util.LinkedList;

public class doctores {
    private String name_doc;
    private LinkedList<Date> disp_doc;
    private String state;
    public doctores(String name_doc, LinkedList<Date> disp_doc, String state) {
        this.name_doc = name_doc;
        this.disp_doc = disp_doc;
        this.state = state;
    }
    public String getName_doc() {
        return name_doc;
    }
    public void setName_doc(String name_doc) {
        this.name_doc = name_doc;
    }
    public LinkedList<Date> getDisp_doc() {
        return disp_doc;
    }
    public void setDisp_doc(LinkedList<Date> disp_doc) {
        this.disp_doc = disp_doc;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    

}
