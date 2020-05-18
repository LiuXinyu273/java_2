import Transport.Airship;

public class Main {
    public static void main(String[] args) {
        Person person1=new Person();//new一个人
        person1.setId("201902177");
        person1.setP_Age(18);
        person1.setP_Name("小宇");
        person1.setP_Sex(" 男");
        //初始化任务信息
        Airship airship=new Airship();
        airship.setTransport_name("飞船");
        airship.setOwnership("小宇");
        airship.setPrice("2000万");
        airship.setGpsPosition("东北");
        //初始化飞船信息
        System.out.println("Id:"+person1.getId()+" 姓名："+person1.getP_Name());
        System.out.println("年龄："+ person1.getP_Age()+" 性别："+person1.getP_Sex());

        person1.driveTransport(airship);//驾驶;

    }
}