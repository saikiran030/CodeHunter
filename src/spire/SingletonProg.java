package spire;

class JdbcConnExam{
    static JdbcConnExam jcm=null;
    private JdbcConnExam(){
    }

    synchronized public static JdbcConnExam getJDBCConnObj(){
        if(jcm==null)
            jcm=new JdbcConnExam();
        return jcm;
    }

}

public class SingletonProg {
    public static void main(String[] args) {
        JdbcConnExam.getJDBCConnObj();
    }
}
