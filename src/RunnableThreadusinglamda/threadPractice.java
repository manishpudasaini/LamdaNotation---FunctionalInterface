package RunnableThreadusinglamda;

public class threadPractice {
    public static void main(String[] args) {
        Runnable runnable1 = () -> {

                try {
                    for (int i=1;i<=7;i++){
                        System.out.println("Value of thread 1= "+ i);
                        Thread.sleep(1000);
                    }

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

        };

        Thread thread = new Thread(runnable1);
        thread.setName("manish");
        thread.start();

        Runnable runnable2 = () -> {

            try {
                for (int i=1;i<=7;i++){
                    System.out.println("Value of thread 2= "+ i*2);
                    Thread.sleep(2000);
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        };

        Thread thread1 = new Thread(runnable2);
        thread1.setName("ezio");
        thread1.start();


    }

}
