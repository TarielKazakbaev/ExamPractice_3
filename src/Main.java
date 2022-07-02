import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Circle apple = new Apple();
        Circle tennisBall = new TennisBall();
        Flat book = new Book();
        Flat file = new File();
        Bottle bottleOfWater = new BottleOfWater();
        Bottle cocaCola = new CocaCola();

        HashSet<Items> backPacks1 = new HashSet<>();
        for(int i =0 ; i<20; i++) {
            backPacks1.add(apple);
            backPacks1.add(book);
            backPacks1.add(cocaCola);
        }
        Iterator<Items> it1 = backPacks1.iterator();
        System.out.println("То что поместилось в первый рюкзак: ");
        while(it1.hasNext()){
            System.out.println(it1.next());
        }

        HashSet<Items> backPacks2 = new HashSet<>();
         for(int i=0; i<50; i++){
             backPacks2.add(tennisBall);
             backPacks2.add(file);
             backPacks2.add(bottleOfWater);
         }
        Iterator<Items> it2 = backPacks2.iterator();
        System.out.println("То что поместилось во второй рюкзак: ");
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

        HashSet<Items> backPacks3 = new HashSet<>();
        for(int i=0; i<10; i++){
            backPacks3.add(apple);
            backPacks3.add(tennisBall);
            backPacks3.add(file);
            backPacks3.add(cocaCola);
        }
        Iterator<Items> it3 = backPacks3.iterator();
        System.out.println("То что поместилось в третий рюкзак: ");
        while(it3.hasNext()) {
            System.out.println(it3.next());
        }
    }
}
