package enums;

import java.util.Locale;

public enum PrefsVoting {
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
