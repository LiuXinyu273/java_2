import Transport.Transport;

public class Person {
    private int P_Age;
    private String p_Sex;
    private String id;
    private String p_Name;

    public Person() {
    }

    public Person(String id) {
        this.id = id;
    }
    //输出交通工具的有关信息
    public void driveTransport(Transport transport){System.out.println("正在驾驶："+transport.getTransport_name()+"  拥有者："+transport.getOwnership());
    System.out.println("当前位置："+transport.getGpsPosition()+" 价格："+transport.getPrice());

    }

    public int getP_Age() {
        return P_Age;
    }

    public void setP_Age(int p_Age) {
        P_Age = p_Age;
    }

    public String getP_Sex() {
        return p_Sex;
    }

    public void setP_Sex(String p_Sex) {
        this.p_Sex = p_Sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getP_Name() {
        return p_Name;
    }

    public void setP_Name(String p_Name) {
        this.p_Name = p_Name;
    }
}
