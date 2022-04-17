package enums;

import java.util.Locale;

public enum PrefsInvitations {
    MEMBERS,
    ADMINS;

    @Override
    public String toString(){
        return this.name().toLowerCase(Locale.ROOT);
    }
}
