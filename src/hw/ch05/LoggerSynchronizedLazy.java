package hw.ch05;

public class LoggerSynchronizedLazy {
    private static final LoggerSynchronizedLazy instance=new LoggerSynchronizedLazy();

    private StringBuilder logBuffer;

    private LoggerSynchronizedLazy(){
        System.out.println("[LoggerSynchronizedLazy] 인스턴스를 생성했습니다.");
        logBuffer=new StringBuilder();
        slowdown();
    }

    public static synchronized LoggerSynchronizedLazy getInstance(){
        return instance;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }

    public void log(String message){
        logBuffer.append("[").append(System.currentTimeMillis()).append("]").append(message).append("\n");
        System.out.println("[LoggerSynchronizedLazy]"+message);    
    }

    public String getLog(){
        return logBuffer.toString();
    }
}
