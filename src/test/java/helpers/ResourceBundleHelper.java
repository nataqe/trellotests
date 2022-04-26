package helpers;

import base.AbstractHttpMessage;
import org.slf4j.Logger;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import static org.slf4j.LoggerFactory.getLogger;

public class ResourceBundleHelper {

    private static final Logger LOGGER = getLogger(AbstractHttpMessage.class);

    public static ResourceBundle getResourceBundle(String baseName) {
        try {
            return ResourceBundle.getBundle(baseName);
        } catch (MissingResourceException e) {
            LOGGER.warn(baseName + " property was not found.");
            return null;
        }
    }

    public static String getResourceBundleKey(ResourceBundle rb, String key) {
        String value;
        if ((rb == null) || !(rb.containsKey(key))) {
            value = System.getenv(key);
        } else {
            value = rb.getString(key);
        }
        if (value == null) {
            LOGGER.error(key + " is empty!");
            throw new IllegalArgumentException();
        }
        return value;
    }
}
