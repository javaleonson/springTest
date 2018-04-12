package test.proxy;

public class StaticProxy {
    private Rents rents;

    public void setRents(Rents rents) {
        this.rents = rents;
    }

    public Rents getRents() {
        return rents;
    }

    public void rentP(){
        System.out.println("看房");
        rents.rent();
        System.out.println("缴费");
    }
}
