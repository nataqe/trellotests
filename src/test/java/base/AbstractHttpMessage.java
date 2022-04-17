package base;

import java.util.ResourceBundle;

public abstract class AbstractHttpMessage {

    private String headerAuthValue;
    private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle("application");

    private AbstractHttpMessage(ResourceBundle rb) {
        headerAuthValue = "OAuth oauth_consumer_key=\""
                + rb.getString("API_KEY")
                + "\", oauth_token=\""
                + rb.getString("TOKEN") + "\"";
    }

    public AbstractHttpMessage() {
        this(RESOURCE_BUNDLE);
    }

    public String getHeaderAuthValue() {
        return headerAuthValue;
    }    
}
