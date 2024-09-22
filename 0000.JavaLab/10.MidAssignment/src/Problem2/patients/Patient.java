package Problem2.patients;

import Problem2.healthcare.Person;

public class Patient extends Person {
    private String history;
    private String medicines;

    public void setMedicines(String medicines) {
        this.medicines = medicines;
    }

    public String getMedicines() {
        return medicines;
    }
    public String getHistory() {
        return history;
    }
    public void setHistory(String history) {
        this.history = history;
    }

public Patient(int pid, String pname){
        this.setPid(pid);
        this.setPname(pname);

    }
  public Patient(int pid,String pname,String history){
      this.setPid(pid);
      this.setPname(pname);
        this.history = history;
    }

}

