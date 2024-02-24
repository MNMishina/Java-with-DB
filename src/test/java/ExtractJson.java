import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ExtractJson {
    public static void main(String[] args) throws IOException {
    // Json has the response of API
        ObjectMapper om = new ObjectMapper();
        CustomerDetailsJmeter cdj = om.readValue(new File("C:\\Users\\mmishina\\IdeaProjects\\Java-with-DB\\customerInfo0.json"),
                CustomerDetailsJmeter.class);
        System.out.println(cdj.getCourseName());
        cdj.getStudentName();
        //  validate if records in Web table are correct or not
    }
}
