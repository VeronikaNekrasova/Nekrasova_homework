package homework_1;

import java.util.Scanner;

public class Kotik {
        private int prettiness;
        private int weight;
        private String name;
        private String meow;
        private int satiety;
        private String food;
        private boolean catHungry=true;
        private Scanner scanner=new Scanner(System.in);
        static int classObjects=0;

    public static int catCount(){
        classObjects++;
        System.out.println("Создано:"+ classObjects+ " котика.");
        return classObjects;
    }

    public void setFood(String food){
        this.food=food;
    }

    public String getFood(){
        return food;
    }

    public void setSatiety(int satiety){
        this.satiety=satiety;
    }

    public int getSatiety(){
        return satiety;
    }

    public void setPrettiness(int prettiness){
        this.prettiness=prettiness;
    }

    public int getPrettiness(){
        return prettiness;
    }

    public void setWeight(int weight){
        this.weight=weight;
    }

    public int getWeight(){
        return weight;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public String getMeow() {
        return meow;}


    public boolean eat (boolean catHungry) {
        this.catHungry=catHungry;
        int hungryIndicator=(int)(Math.random()*(2+1))-1;
        switch (hungryIndicator){
            case -1:
            case 0:
                System.out.println("Я голоден!");
                break;
            case 1:
                System.out.println("Я сыт");
                break;
        }
        return catHungry;
    }

    public int eat(int value){
        var satiety=value;
        satiety=(int)(Math.random()*(2+1))-1;
        return satiety;}

    public String eat(String food,int value) {
        this.food = food;
        satiety = value;
        if (eat(getSatiety()) <= 0) {
            System.out.println("Котик голоден, его надо покормить");
            System.out.println("Чем будем кормить котика:" + "\n" + "1.дать корм" + "\n" + "2.дать молока" + "\n" + "3.дать вискас");
            food = scanner.nextLine();
            switch (food) {
                case "1.дать корм":
                case "2.дать молока":
                case "3.дать вискас":
                    System.out.println("Вы выбрали: " + food +"." + "\n" + "Котик кушает.");
                    break;
                default:
                    System.out.println("Такой еды нет дома.");
                               }
        }else{
            System.out.println("Котик сын и его не надо кормить.");
        }
        return food;
    }

    public boolean eat(){
        eat(food,satiety);
        return true;
    }

    public boolean play(){
        int catPlay=(int)(Math.random()*2);
        switch(catPlay){
            case 0:
                System.out.println("Котик играет с бантиком");
                break;
            case 1:
                System.out.println("Котик играет с заводной мышкой");
                break;
        }
        return true;
    }

    public boolean sleep () {
        int whereSleep = (int) (Math.random() * 2);
        switch (whereSleep) {
            case 0:
                System.out.println("Котик устал и заснул в домике.");
                break;
            case 1:
                System.out.println("Котик устал и заснул в кровати.");
                break;
        }
        return true;
    }

    public boolean chaseMouse(){
        int catchMouse=(int)(Math.random()*2);
        switch (catchMouse) {
            case 0:
                System.out.println("Котик ловит мышь дома.");
                break;
            case 1:
                System.out.println("Котик ловит мышь на даче.");
                break;
        }
        return true;
    }

    public boolean needScratch(){
        int needScratch=(int)(Math.random()*2);
        switch (needScratch){
            case 0:
                System.out.println("Котик хочет, чтобы его почесали.");
                break;
            case 1:
                System.out.println("Котик не хочет, чтобы его трогали.");
                break;
        }
        return true;
    }

    public void liveAnotherDay() {
        eat();
        for (int i = 0; i < 24; i++) {
            int catToDoToday = (int) (Math.random() * 5 + 1);
            switch (catToDoToday) {
                case 1:
                    break;
                case 2:
                    System.out.println(i + " час " + play());
                    break;
                case 3:
                    System.out.println(i + " час " + sleep());
                    break;
                case 4:
                    System.out.println(i + " час " + chaseMouse());
                    break;
                case 5:
                    System.out.println(i + " час " + needScratch());
                    break;
            }
        }
    }
    public Kotik(String name, int weight, int prettiness, String meow){
        this.name = name;
        this.weight = weight;
        this.prettiness = prettiness;
        this.meow = meow;}

    }

}





