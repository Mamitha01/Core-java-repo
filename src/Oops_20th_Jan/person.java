package src.Oops_20th_Jan;

public class person {
    public String getName(){
        return name;

    }

    public person(String name, Integer age){
        this.name =name;
        this.age = age;

    }

    public void setName(String name){
        this.name = name;

    }

    public Integer getAge(){
        return age;

    }

    public void setAge(Integer age){
        this.age = age;
    }

    private String name;
    private Integer age;
}
