class Loader implements Runnable {
    public void run() {
        System.out.println("Hello Lu");
    }
}

class MyJavaClass {
    public static void main(String[] args) {
        Thread t = new Thread(new Loader());
        t.start();
    }
}
