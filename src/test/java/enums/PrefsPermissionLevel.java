package enums;

import java.util.Locale;

public enum PrefsPermissionLevel {
    ORG,
    PRIVATE,
    PUBLIC;

    @Override
    public String toString(){
        return this.name().toLowerCase(Locale.ROOT);
    }
}
