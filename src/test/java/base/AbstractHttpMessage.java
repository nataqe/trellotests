package base;

import helpers.ResourceBundleHelper;

import java.util.*;

public abstract class AbstractHttpMessage {

    private String headerAuthValue;

    private AbstractHttpMessage(ResourceBundle rb) {
        headerAuthValue = "OAuth oauth_consumer_key=\""
                + ResourceBundleHelper.getResourceBundleKey(rb, "API_KEY")
                + "\", oauth_token=\""
                + ResourceBundleHelper.getResourceBundleKey(rb, "TOKEN") + "\"";
    }

    public AbstractHttpMessage() {
        this(ResourceBundleHelper.getResourceBundle("application"));
    }

    public String getHeaderAuthValue() {
        return headerAuthValue;
    }
}
