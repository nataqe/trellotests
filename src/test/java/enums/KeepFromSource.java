package enums;

import java.util.Locale;

public enum KeepFromSource {
    CARDS,
    NONE;

    @Override
    public String toString(){
        return this.name().toLowerCase(Locale.ROOT);
    }
}
