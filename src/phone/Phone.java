package phone;

public class Phone {
    private String color;
    private int ram;
    private String brand;

    public Phone() {
        this.color = "blue";
        this.ram = 8;
        this.brand = "Samsung";
    }

    public Phone(int ram, String brand) {
        this();
        this.ram = ram;
        this.brand = brand;
    }

    public Phone(String color, int ram, String brand) {
        this(ram, brand);
        this.color=color;
    }
    public void phoneParameters(){
        System.out.println(String.format("phone.Phone color is: %s, phone ram is:%d, phone brand is : %s", color, ram, brand));
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("phone.Phone{");
        sb.append("color='").append(color).append('\'');
        sb.append(", ram=").append(ram);
        sb.append(", brand='").append(brand).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
