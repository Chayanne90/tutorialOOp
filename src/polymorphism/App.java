package polymorphism;

public class App {

    public static void main(String[] args) {
        Plant plant1 = new Plant();
        Tree tree = new Tree();

        Plant plant2 = tree;

        plant2.growing();


    }
}
