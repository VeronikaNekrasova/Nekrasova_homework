package homework_1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Application {

     public static void main(String[] args) {
     Kotik djery=new Kotik ("Джери",6,4,"Мяу");
     Kotik tom=new Kotik();
     tom.setPrettiness(9);
     tom.setWeight(6);
     tom.setName("Том");
     tom.setMeow("Мяу");

     if (djery.getMeow().equals(tom.getMeow())){
     System.out.println("Котики мяукают одинакого!");
     } else {
              System.out.println("Котики мяукают по-разному!");
            }
     System.out.println("Имя кота:" + tom.getName());
     System.out.println("Он весит: "+ tom.getWeight());
     tom.liveAnotherDay();
     
     Kotik.catCount();
    }


}

