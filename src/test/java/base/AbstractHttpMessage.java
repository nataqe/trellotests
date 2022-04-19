package base;

import java.util.ResourceBundle;

public abstract class AbstractHttpMessage {

    private String headerAuthValue;
    private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle("application");
    private String apiKey;
    private String token;

    private AbstractHttpMessage(ResourceBundle rb) {
        if (rb.keySet().size() == 0) {
            apiKey = System.getenv("API_KEY");
            token = System.getenv("TOKEN");
        } else {
            apiKey = rb.getString("API_KEY");
            token = rb.getString("TOKEN");
        }
        headerAuthValue = "OAuth oauth_consumer_key=\""
                + apiKey
                + "\", oauth_token=\""
                + token + "\"";
    }

    public AbstractHttpMessage() {
        this(RESOURCE_BUNDLE);
    }

    public String getHeaderAuthValue() {
        return headerAuthValue;
    }
}
