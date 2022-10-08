package come.company;

import java.io.Serializable;

public class Stad implements Serializable {
    String st;
    Stat status;
    Stad(String s){
        this.st=s;
        this.status = Stat.не_выполненно;
    }
    Stad(String s,Stat stat){
        this.st=s;
        this.status = stat;
    }
    @Override
    public String toString() {
        return "{" +
                "задание='" + st + '\'' +
                ", статус='" + status + '\'' +
                '}';
    }
/* @Override
    public String toString() {
        return ( "\n задание =  \n"+st +"\n состояние =   \n"+status+""
        );
    }*/
}
