package citas_pacientes;

import java.sql.Date;

public class lista_pacientes {
    private String name;
    private String Rh;
    private int age;
    private Date LastAppointment;
    public lista_pacientes(String name, String Rh, int age, Date LastAppointment) {
        this.name = name;
        this.Rh = Rh;
        this.age = age;
        this.LastAppointment = LastAppointment;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRh() {
        return Rh;
    }
    public void setRh(String rh) {
        Rh = rh;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Date getLastAppointment() {
        return LastAppointment;
    }
    public void setLastAppointment(Date lastAppointment) {
        LastAppointment = lastAppointment;
    }
    
    
}
