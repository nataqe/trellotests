package enums;

import java.util.Locale;

public enum PowerUps {
    ALL,
    CALENDAR,
    CARDAGING,
    RECAP,
    VOTING;

    @Override
    public String toString(){
        return this.name().toLowerCase(Locale.ROOT);
    }
}
