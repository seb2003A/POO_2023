package excercise;

public class Person {

    private String name;
    private String document  ;
    private String city = "Colombia";
public Person(){
    
}

//parametrizado
public Person(String name, String document, String city){
    this.name = name;
    this.document = document;
    this.city= city;
}
    public String getCity() {
        return city;

    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
