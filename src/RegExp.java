import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {

    /**
     * Get IP address from text.
     *
     * @param text text to parse
     * @return String with IP address
     */
    public static String getIpAddress(String text) {
        // TODO fill in code here for extracting IP address using Regular Expression
        Pattern pattern = Pattern.compile("(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");
        Matcher matcher = pattern.matcher(text);

        String ipAddress = "";
        while (matcher.find()) {
            ipAddress = matcher.group();
            System.out.println(ipAddress);
        }
        return ipAddress;
    }
}