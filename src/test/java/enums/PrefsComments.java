package enums;

import java.util.Locale;

public enum PrefsComments {
    DISABLED,
    MEMBERS,
    OBSERVERS,
    ORG,
    PUBLIC;

    @Override
    public String toString(){
        return this.name().toLowerCase(Locale.ROOT);
    }
}
