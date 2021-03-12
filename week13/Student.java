package week13;

public abstract class Student {
    protected String login, department, name;

    public Student() {
        login = "";
        department = "";
        name = "";
    }

    public abstract void setLogin(String login){
        this.login = login;
    }

    public abstract String getLogin(){
        return login;
    }
}