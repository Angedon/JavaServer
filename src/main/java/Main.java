import org.json.JSONArray;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Gleb1\\Downloads\\pcs-final-diplom-main\\pcs-final-diplom-main\\pdfs");

        JSONArray ja = new JSONArray();

        Client client = new Client();
        client.startConnection("127.0.0.1", 9898);
        Scanner sc = new Scanner(System.in);
        String response = client.sendMessage(sc.nextLine());
        JSONArray jsonArray = new JSONArray(response);
        System.out.println(jsonArray);
    }
}
