package design.pattern;

class DBConnection {

    private static DBConnection mySQlConnection;

    @Override
    public String toString() {
        return super.toString();
    }

    private int port;
    private String database;

    private DBConnection() throws InterruptedException {
        Thread.sleep(2000l);
        this.port = 8888;
        this.database = "mysql";
    }

    static DBConnection getInstance() throws InterruptedException {
        if (mySQlConnection == null)
            mySQlConnection = new DBConnection();
        return mySQlConnection;
    }


}

public class SingletonExample {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(DBConnection.getInstance());
        System.out.println(DBConnection.getInstance());
        System.out.println(DBConnection.getInstance());
    }

}
