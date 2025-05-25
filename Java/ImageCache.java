import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;
import utils.IntegerValidator;

class Image{

    String dest;
    int size;

    public Image(String dest, int size){
        this.dest = dest;
        this.size = size;
    }

}

public class ImageCache {
    
    public static void main(String[] args){

        int cont = 1;
        Scanner sc = new Scanner(System.in);
        //LinkedHashMap to maintain insertion order
        Map<String,Image> map = new LinkedHashMap<>();
        while(cont!=0){
            System.out.println("1.Add an Image\n2.Display list of images");
            System.out.println("Enter the operation you want to perform:");
            int op = IntegerValidator.validateInteger(sc);
            if(op == 1){
                //Input all the image details
                sc.nextLine();
                System.out.println("Enter the name of the image:");
                String name = sc.nextLine();
                System.out.println("Enter the destination:");
                String dest = sc.nextLine();
                System.out.println("Enter the size:");
                int size = IntegerValidator.validateInteger(sc);
                Image img = new Image(dest,size);
                map.put(name,img);
                //Remove the first elements from cache when memory is low
                if(map.size()>5){
                    System.out.println("Memory low");
                    String firstKey = map.keySet().iterator().next();
                    map.remove(firstKey);
                }
            }
            else if(op == 2){
                //Display all the images
                for(Map.Entry<String,Image> display: map.entrySet()){
                    System.out.println("Image Name:"+display.getKey());
                    Image img = display.getValue();
                    System.out.println("Destination:"+img.dest+" Size:"+img.size);
                }
            }
            else{
                System.out.println("Enter a valid input");
            }
            System.out.println("Do you want to continue:(1 for yes/ 0 for no)");
            cont = IntegerValidator.validateInteger(sc);
        }

    }

}
