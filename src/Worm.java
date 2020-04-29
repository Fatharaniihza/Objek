public class Worm {

    String userName;
    int score;
    double length;

    void eatSnack(){
        System.out.println("nom...nom...nom...");
    }

    void eatOthers(Worm worm){
        score += 500;
    }
}
