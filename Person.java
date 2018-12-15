
public class Person
{
    private String name;
    private String nummer;

    public Person(String name_, String nummer_){
        name = name_;
        nummer = nummer_;     
    }
    
    public boolean istKleiner(Person person2)
    {
        return name.compareTo(person2.name) < 0;
    }

    public String getName()
    {
        return name;
    }
    
    public String getNummer()
    {
        return nummer;
    }
    
    public String datenGeben()
    {
        return name + " | " + nummer;
    }
    
    
}
