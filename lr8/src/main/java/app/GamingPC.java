package app;
class GamingPC extends Computer {
    String videoCard;

    GamingPC(String processor, double ram, int storage, String videoCard) {
        super(processor, ram, storage);
        this.videoCard = videoCard;
    }

    void getPerfomance() {
        System.out.println("Высокая производительность");
    }

    void playGame() {
        System.out.println("Игры это не круто");
    }
}
