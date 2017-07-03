
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        HashMap<String,String> hashmap = new HashMap<String,String>();
        hashmap.put("matti", "mage");
        hashmap.put("mikael", "mixu");
        hashmap.put("arto", "arppa");
        
        String name = hashmap.get("mikael");
        System.out.println(name);
    }

}
