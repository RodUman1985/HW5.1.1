package come.company;

import java.io.Serializable;

public class Stad implements Serializable {
    String st;
    Stat status;
    Stad(String s){
        this.st=s;
        this.status = Stat.��_����������;
    }
    Stad(String s,Stat stat){
        this.st=s;
        this.status = stat;
    }
    @Override
    public String toString() {
        return "{" +
                "�������='" + st + '\'' +
                ", ������='" + status + '\'' +
                '}';
    }
/* @Override
    public String toString() {
        return ( "\n ������� =  \n"+st +"\n ��������� =   \n"+status+""
        );
    }*/
}
