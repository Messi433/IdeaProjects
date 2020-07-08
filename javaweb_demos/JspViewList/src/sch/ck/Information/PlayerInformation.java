package sch.ck.Information;
public class PlayerInformation {
    private int id=0;
    private String name="";
    private String city="";
    private int price =0;
    private int count= 0;
    public  PlayerInformation()
    {

    }
    public void setId(int id)
    {

        this.id = id;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public void setName(String name)
    {

        this.name = name;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public int getCount()
    {
        return count;
    }

    public int getPrice()
    {
        return price;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getCity()
    {
        return city;
    }
}
