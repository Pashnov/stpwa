package khpi.lab1.log;

public class FileLogger implements Logger {

    @Override
    public void debug(String msg) {
        System.out.println(this.getClass().getSimpleName()+"#debug, msg" + msg);
    }

    @Override
    public void info(String msg) {
        System.out.println(this.getClass().getSimpleName()+"#info, msg" + msg);
    }

    @Override
    public void warn(String msg) {
        System.out.println(this.getClass().getSimpleName()+"#warn, msg" + msg);
    }

}
