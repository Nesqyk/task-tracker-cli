import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class TaskMain 
{
    public static void main(String[] args) {
        
    }

    static void loadDatabase()
    {
        String path = "./task.json";
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) 
        {
            StringBuilder sb = new StringBuilder();
            String line;

            while((line = br.readLine()) != null)
            {
                sb.append(line);   
            }
        } catch(IOException io) 
        {
            io.printStackTrace();
        }
    }

    static void write()
    {   
    }
}