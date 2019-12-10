import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

import org.json.JSONObject;

public class Main {

    public static void main(String[] args) {


        try {
            String contents = new String (Files.readAllBytes(Paths.get("SI1.json")));
            JSONObject jsonObject = new JSONObject(contents);

            Iterator < String> keys = jsonObject.keys();

            while (keys.hasNext())
            {
                String key = keys.next();
                if (jsonObject.get(key) instanceof JSONObject)
                {
                    System.out.println( key.toString());
                }
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
