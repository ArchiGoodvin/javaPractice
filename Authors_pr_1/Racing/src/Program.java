import java.util.Scanner;

/**
 * Created by User on 01.07.2015.
 */
public class Program {
    Car[] cars = new Car[2];
    public int carTale = 0;
    public int traktorTale = 0;
    Traktor[] traktors = new Traktor[2];
   public static void main(String... args){
       new Program().allActions();
   }
    private void allActions(){
        input();
        process();
        output();

    }


    private void input() {
        String object = inputString("Add a new Car or a new Traktor ? ");
        createObject(object);

    }

    private void createObject(String object) {
        String name = inputString("Enter the name of the car");
        String color = inputString("What color will your car be?");
        String model = inputString("What model?") ;
    if(object == "car"){
        cars[carTale] = createCar(name,color,model);
        carTale++;

        }
        else if (object == "traktor"){

    }
        else{

    }


    }

    private Car createCar(String name, String color, String model) {
        Car car = new Car(name,color,model);
        return car;
    }

    private void process() {

    }
    private void output(){

    }
    public String inputString(String message){
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        return scan.next();


    }
}
