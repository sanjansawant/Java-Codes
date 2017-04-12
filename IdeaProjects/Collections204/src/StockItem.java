/**
 * Created by sanja on 1/31/2017.
 */
public class StockItem implements Comparable<StockItem> {
    private final String name;
    private final double price;
    private int quantity;
    public int reserved=0;


    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity=0;
    }

    public StockItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public int reserve(int quantity){

        if(getQuantity()>=quantity){

            this.reserved=quantity;
            return this.reserved;
        }
        return 0;

    }

    public int unreserve(int quantity){

        if(this.reserved>=quantity){

            this.reserved=this.reserved-quantity;

            return this.quantity;
        }

        return 0;

    }

    public int finaliseStock(int quantity){

        if(getQuantity()>=quantity){

            this.reserved=quantity;
            return this.reserved;
        }
        return 0;


    }




    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {

        return quantity;
    }

    public int adjustQuantity(int quantity) {
        int newQuantity = this.quantity + quantity;
        if (newQuantity >= 0) {
            this.quantity = newQuantity;
            return quantity;
        }
        return 0;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "StockItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }



    @Override
    public boolean equals(Object obj){
        System.out.println("equals() am called");
        if(this==obj){
            return true;
        }

        if(obj==null||obj.getClass()!=this.getClass()){
            return false;
        }

        String name1=(((StockItem)obj).getName());
        return this.name.equals(name1);
    }

    @Override
    public int hashCode(){
        System.out.println("hashcode am called");
        return this.name.hashCode()+31;
    }


    @Override
    public int compareTo(StockItem item){
        if(this==item){
            return 0;
        }

        if(item!=null) {
            System.out.println("am called the comapre");
            return this.name.compareTo(item.getName());
        }
        throw new NullPointerException();
    }



}
