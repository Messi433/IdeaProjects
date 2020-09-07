package demo.part1;

/**
 * @Classname Demo7
 * @Description TODO
 * @Date 2020/8/5 17:31
 * @Author 曹珂
 */
public class Demo7 {
    private Thread monitor;

    //启动监控线程
    /*public void start() {
        monitor = new Thread(() -> {
            while (true) {
                Thread current = Thread.currentThread();
                if (current.isInterrupted()) {
                    Log.debug("料理后事");
                    break;
                    try {
                        Thread.sleep(1000); //情况1
                        log.debug("执行监控记录"); //情况2
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        //重新设置打断标记(因为sleep状态下打断会重置标记状态)
                        current.interrupt();
                    }
                }
            }
        });
        monitor.start();
    }*/
    //停止监控线程
    public void stop(){
        monitor.interrupt();
    }
}
