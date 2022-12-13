package enums;

import java.util.Locale;

public enum Pos {

    TOP,
    BOTTOM;

    @Override
    public String toString() {
        return this.name().toLowerCase(Locale.ROOT);
    }
}
