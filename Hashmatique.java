import java.util.HashMap;
import java.util.Set;
public class Hashmatique{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("All too well","I walked through the door with you, the air was cold But something 'bout it felt like home somehow");
        trackList.put("Say you won't let go","Until we're grey and old Just say you won't let go");
        trackList.put("No other","There's no one like you, Even if I look around it's just like that");
        trackList.put("Primeras veces","Yo sé que lo nuestro va ligero de equipaje Que no es tan alto su kilometraje");

        System.out.println(trackList);

        System.out.println(trackList.get("Primeras veces"));
    }
}