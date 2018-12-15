public class MarsApplication1 {
    public static void main(String[] args) {
        MarsRobot1 spirit = new MarsRobot1("Spirit");
        MarsRobot1 opportunity = new MarsRobot1("Opportunity",-10);



        System.out.println("Robot spirit:");
        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;
        spirit.showAttributes();
        spirit.checkStatus();
        System.out.println();

        System.out.println("Robot opportunity:");
        opportunity.status = "eksploracja";
        opportunity.speed = 2;
        //opportunity.temperature = -60;
        opportunity.showAttributes();
        opportunity.checkStatus();
        System.out.println();

        System.out.println("Zwiększenie prędkości robota spirit do 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        spirit.checkStatus();
        System.out.println();

        System.out.println("Zwiększenie prędkości oppotrunity spirit do 4.");
        opportunity.speed = 4;
        opportunity.showAttributes();
        opportunity.checkStatus();
        System.out.println();

        System.out.println("Spadek temperatury w obszarze działania robota spirit na -90");
        spirit.temperature = -90;
        spirit.showAttributes();
        spirit.checkStatus();
        System.out.println();

        System.out.println("Spadek temperatury w obszarze działania robota opportunity na -95");
        opportunity.temperature = -95;
        opportunity.showAttributes();
        opportunity.checkStatus();
        System.out.println();

        System.out.println("sprawdzenie temperatury dla robota spirit");
        spirit.checkTemperature();
        spirit.showAttributes();
        spirit.checkStatus();
        System.out.println();

        System.out.println("sprawdzenie temperatury dla robota opportunity");
        opportunity.checkTemperature();
        opportunity.showAttributes();
        opportunity.checkStatus();
        System.out.println();


    }
}
