package enums;

import java.util.Locale;

public enum PrefsBackground {

    BLUE,
    ORANGE,
    GREEN,
    RED,
    PURPLE,
    PINK,
    LIME,
    SKY,
    GREY;

    @Override
    public String toString(){
        return this.name().toLowerCase(Locale.ROOT);
    }
}
