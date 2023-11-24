public class Main {

    public static void main(String[] args) {

      

        SebenEleben my_sebeneleben = new SebenEleben("7/11");
        IceCream my_icecream = new IceCream ("corneto");
        Junkfoods my_junkfoods = new Junkfoods("fishda");
        
        my_sebeneleben.eat();
        my_icecream.tagak();
        my_junkfoods.migo();
        
        System.out.println("----");
        my_sebeneleben.sleep();
        my_icecream.sebenelebenHumans();
        my_junkfoods.sebenelebenHumans();
    }
           
}
    

    