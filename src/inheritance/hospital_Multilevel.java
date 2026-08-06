package inheritance;



class Hospital{
     Hospital(){
        System.out.println("Doctor Opening their New Hospital");
    }
}

class Doctor {
     Doctor(){
        System.out.println("Doctor Owner of the Hospital");
    }
}

class Nurse {
     Nurse (){
        System.out.println("Method of Nurse Class");
    }
}

class Patients extends Nurse{
      Patients() {
        System.out.println("Method of Patients Class");
    }

}
public class hospital_Multilevel{
    public static void main(String[]args){
        Nurse Nurse = new Nurse();
    }

}
