public class Hospital {
    int hospitalId;
    String hospitalName;
    int patients;

   
        Hospital() 
        {
        this.hospitalId = 0;
        this.hospitalName = "Not Given";
        this.patients = 0;
      }

  
    Hospital(int hospitalId, String hospitalName, int patients) 
    {
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
        this.patients = patients;
    }

    
    void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    void setPatients(int patients) {
        this.patients = patients;
    }

    
    int getHospitalId() {
        return hospitalId;
    }

    String getHospitalName() {
        return hospitalName;
    }

    int getPatients() {
        return patients;
    }

    int TotalPatients() {
        return patients;
    }

    void display() {
        System.out.println();
        System.out.println("Hospital ID: " + this.hospitalId);
        System.out.println("Hospital Name: " + this.hospitalName);
        System.out.println("Patients: " + this.patients);
    }
}//class hospital ends here

class Doctor extends Hospital {
    int doctorPatients;

        Doctor() {
        super();
        this.doctorPatients = 0;
    }

    
    Doctor(int hospitalId, String hospitalName, int patients, int doctorPatients) 
    {
        super(hospitalId, hospitalName, patients);
        this.doctorPatients = doctorPatients;
    }

    void setDoctorPatients(int doctorPatients) {
        this.doctorPatients = doctorPatients;
    }

    int getDoctorPatients() {
        return doctorPatients;
    }

    int TotalPatients() {
        return getPatients() + doctorPatients;
    }

    void display() {
        super.display();
        System.out.println("Doctor's Patients: " + this.doctorPatients);
    }
}//class doctorPatients ends here

class Surgeon extends Hospital {
    int surgeryPatients;

        Surgeon() {
        super();
        this.surgeryPatients = 0;
    }

 
    Surgeon(int hospitalId, String hospitalName, int patients, int surgeryPatients) {
        super(hospitalId, hospitalName, patients);
        this.surgeryPatients = surgeryPatients;
    }

    void setSurgeryPatients(int surgeryPatients) {
        this.surgeryPatients = surgeryPatients;
    }

    int getSurgeryPatients() {
        return surgeryPatients;
    }

    int TotalPatients() {
        return getPatients() + surgeryPatients;
    }

    void display() {
        super.display();
        System.out.println("Surgery Patients: " + this.surgeryPatients);
    }
}//class surgeon ends here

class TestHospital {
    public static void main(String[] args) {

        Hospital h = new Hospital(101, "Yashoda Hospital", 150);
        h.display();
        System.out.println("Total Patients: " + h.TotalPatients());

        h = new Doctor(102, "Hardik Hospital", 100, 40);
        h.display();
        System.out.println("Total Patients: " + h.TotalPatients());

        h = new Surgeon(103, "Government Hospital", 200, 60);
        h.display();
        System.out.println("Total Patients: " + h.TotalPatients());
    }
}//class test ends here


