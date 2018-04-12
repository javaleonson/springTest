package test.proxy;

public class Host implements Rents {
    private String houseAddr;

    public void setHouseAddr(String houseAddr) {
        this.houseAddr = houseAddr;
    }

    public void rent(){
        System.out.println("rent "+houseAddr);
    }
}
