public class MarsRobot1 implements Robot {

    String Name;
    String status;
    int speed;
    float temperature;

    // konstruktoty
    //*******************************************************************************
    public MarsRobot1(String NameIn) {

        Name = NameIn;
    }

    public MarsRobot1(String NameIn, int Temp) {

        Name = NameIn;
        temperature = Temp;
    }
    

    //***********************************************************************************

    public void checkTemperature() {
        if(temperature < -80) {
            status = "Powrót do domu";
            speed = 5;
        }

    }

    public void showAttributes(){
        System.out.println("Status: " + status);
        System.out.println("Predkosc: " + speed);
        System.out.println("Temperatura: " + temperature);
    }

    public void checkStatus(){
        if(status == "eksploracja" ) {
            System.out.println(Name+": Pracuje, nie przeszkadzać");
                    }
        else if(status == "Powrót do domu" ) {
            System.out.println( Name +": Spadam z tąd !!");
        }
        else  System.out.println(Name + ": Status nie rozpoznany");


    }

}