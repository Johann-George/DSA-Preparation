import java.util.TreeMap;
import java.util.Scanner;
import java.util.Map;

public class ProductCatalog {
    
    TreeMap<String,Double> map = new TreeMap<>();
    public static void main(String[] args){

        ProductCatalog pc = new ProductCatalog();
        pc.func();

    }

    public void func(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products:");
        int no = sc.nextInt();
        Double max=0.0;
        for(int i=0;i<no;i++){
            sc.nextLine();
            System.out.println("Enter the product name:");
            String name = sc.nextLine();
            System.out.println("Enter the product price:");
            Double price = sc.nextDouble();
            if(price>max){
                max = price;
            }
            map.put(name,price);
        }
        String ExpensiveProduct = null;
        for(Map.Entry<String,Double> e : map.entrySet()){
            System.out.println("Product name:"+e.getKey()+" Product price:"+e.getValue());
            if(e.getValue()==max){
                ExpensiveProduct = e.getKey();
            }
        } 
        System.out.println("The most expensive product is:");
        System.out.println("Product Name:"+ExpensiveProduct+" Product Price:"+max);
        sc.close();
    }

}

