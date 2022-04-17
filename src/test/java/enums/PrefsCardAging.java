package enums;

import java.util.Locale;

public enum PrefsCardAging {
    PIRATE,
    REGULAR;

    @Override
    public String toString(){
        return this.name().toLowerCase(Locale.ROOT);
    }
}
