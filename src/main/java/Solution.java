import java.net.URI;
import java.net.URISyntaxException;

public class Solution {

    public static void main(String[] args) {
        URI uri = URI.create("legacy://authority/path/segment");
        System.out.println("scheme: " + uri.getScheme());
        System.out.println("authority: " + uri.getAuthority());
    }
}
