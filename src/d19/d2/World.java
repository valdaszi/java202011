package d19.d2;

import java.util.Random;

public class World {

    public static void main(String[] args) {
        // Man.skaitliukas = 10000; - klaida nes private

        World world = new World();
        world.genesis();
        System.out.println("Viso sukurta zmoniu = " + Man.getSkaitliukas());
    }

    private void genesis() {
        Random random = new Random();
        // imituojame nezinoma skaiciu zmoniu sukurimo
        for (int i = 0; i < random.nextInt(10000); i++) {
            new Man();
        }
    }
}
