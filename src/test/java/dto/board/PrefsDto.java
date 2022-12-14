package dto.board;

public class PrefsDto {
    private String permissionLevel;
    private boolean hideVotes;
    private String voting;
    private String comments;
    private String invitations;
    private boolean selfJoin;
    private boolean cardCovers;
    private String cardAging;
    private boolean calendarFeedEnabled;
    private Object hiddenPluginBoardButtons;
    private String background;
    private String backgroundColor;
    private String backgroundImage;
    private String backgroundImageScaled;
    private boolean backgroundTile;
    private String backgroundBrightness;
    private String backgroundBottomColor;
    private String backgroundTopColor;
    private boolean canBePublic;
    private boolean canBeEnterprise;
    private boolean canBeOrg;
    private boolean canBePrivate;
    private boolean canInvite;
    private boolean isTemplate;
    private Object switcherViews;

    public Object getSwitcherViews() {
        return switcherViews;
    }

    public PrefsDto setSwitcherViews(Object switcherViews) {
        this.switcherViews = switcherViews;
        return this;
    }

    public boolean getIsTemplate() {
        return isTemplate;
    }

    public PrefsDto setIsTemplate(boolean isTemplate) {
        this.isTemplate = isTemplate;
        return this;
    }

    public String getPermissionLevel() {
        return permissionLevel;
    }

    public PrefsDto setPermissionLevel(String permissionLevel) {
        this.permissionLevel = permissionLevel;
        return this;
    }

    public boolean isHideVotes() {
        return hideVotes;
    }

    public PrefsDto setHideVotes(boolean hideVotes) {
        this.hideVotes = hideVotes;
        return this;
    }

    public String getVoting() {
        return voting;
    }

    public PrefsDto setVoting(String voting) {
        this.voting = voting;
        return this;
    }

    public String getComments() {
        return comments;
    }

    public PrefsDto setComments(String comments) {
        this.comments = comments;
        return this;
    }

    public String getInvitations() {
        return invitations;
    }

    public PrefsDto setInvitations(String invitations) {
        this.invitations = invitations;
        return this;
    }

    public boolean isSelfJoin() {
        return selfJoin;
    }

    public PrefsDto setSelfJoin(boolean selfJoin) {
        this.selfJoin = selfJoin;
        return this;
    }

    public boolean isCardCovers() {
        return cardCovers;
    }

    public PrefsDto setCardCovers(boolean cardCovers) {
        this.cardCovers = cardCovers;
        return this;
    }

    public String getCardAging() {
        return cardAging;
    }

    public PrefsDto setCardAging(String cardAging) {
        this.cardAging = cardAging;
        return this;
    }

    public boolean isCalendarFeedEnabled() {
        return calendarFeedEnabled;
    }

    public PrefsDto setCalendarFeedEnabled(boolean calendarFeedEnabled) {
        this.calendarFeedEnabled = calendarFeedEnabled;
        return this;
    }

    public Object getHiddenPluginBoardButtons() {
        return hiddenPluginBoardButtons;
    }

    public PrefsDto setHiddenPluginBoardButtons(Object hiddenPluginBoardButtons) {
        this.hiddenPluginBoardButtons = hiddenPluginBoardButtons;
        return this;
    }

    public String getBackground() {
        return background;
    }

    public PrefsDto setBackground(String background) {
        this.background = background;
        return this;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public PrefsDto setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public PrefsDto setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
        return this;
    }

    public String getBackgroundImageScaled() {
        return backgroundImageScaled;
    }

    public PrefsDto setBackgroundImageScaled(String backgroundImageScaled) {
        this.backgroundImageScaled = backgroundImageScaled;
        return this;
    }

    public boolean isBackgroundTile() {
        return backgroundTile;
    }

    public PrefsDto setBackgroundTile(boolean backgroundTile) {
        this.backgroundTile = backgroundTile;
        return this;
    }

    public String getBackgroundBrightness() {
        return backgroundBrightness;
    }

    public PrefsDto setBackgroundBrightness(String backgroundBrightness) {
        this.backgroundBrightness = backgroundBrightness;
        return this;
    }

    public String getBackgroundBottomColor() {
        return backgroundBottomColor;
    }

    public PrefsDto setBackgroundBottomColor(String backgroundBottomColor) {
        this.backgroundBottomColor = backgroundBottomColor;
        return this;
    }

    public String getBackgroundTopColor() {
        return backgroundTopColor;
    }

    public PrefsDto setBackgroundTopColor(String backgroundTopColor) {
        this.backgroundTopColor = backgroundTopColor;
        return this;
    }

    public boolean isCanBePublic() {
        return canBePublic;
    }

    public PrefsDto setCanBePublic(boolean canBePublic) {
        this.canBePublic = canBePublic;
        return this;
    }

    public boolean isCanBeEnterprise() {
        return canBeEnterprise;
    }

    public PrefsDto setCanBeEnterprise(boolean canBeEnterprise) {
        this.canBeEnterprise = canBeEnterprise;
        return this;
    }

    public boolean isCanBeOrg() {
        return canBeOrg;
    }

    public PrefsDto setCanBeOrg(boolean canBeOrg) {
        this.canBeOrg = canBeOrg;
        return this;
    }

    public boolean isCanBePrivate() {
        return canBePrivate;
    }

    public PrefsDto setCanBePrivate(boolean canBePrivate) {
        this.canBePrivate = canBePrivate;
        return this;
    }

    public boolean isCanInvite() {
        return canInvite;
    }

    public PrefsDto setCanInvite(boolean canInvite) {
        this.canInvite = canInvite;
        return this;
    }

    @Override
    public String toString() {
        return "PrefsDto{" +
                "permissionLevel='" + permissionLevel + '\'' +
                ", hideVotes=" + hideVotes +
                ", voting='" + voting + '\'' +
                ", comments='" + comments + '\'' +
                ", invitations='" + invitations + '\'' +
                ", selfJoin=" + selfJoin +
                ", cardCovers=" + cardCovers +
                ", cardAging='" + cardAging + '\'' +
                ", calendarFeedEnabled=" + calendarFeedEnabled +
                ", hiddenPluginBoardButtons=" + hiddenPluginBoardButtons +
                ", background='" + background + '\'' +
                ", backgroundColor='" + backgroundColor + '\'' +
                ", backgroundImage='" + backgroundImage + '\'' +
                ", backgroundImageScaled='" + backgroundImageScaled + '\'' +
                ", backgroundTile=" + backgroundTile +
                ", backgroundBrightness='" + backgroundBrightness + '\'' +
                ", backgroundBottomColor='" + backgroundBottomColor + '\'' +
                ", backgroundTopColor='" + backgroundTopColor + '\'' +
                ", canBePublic=" + canBePublic +
                ", canBeEnterprise=" + canBeEnterprise +
                ", canBeOrg=" + canBeOrg +
                ", canBePrivate=" + canBePrivate +
                ", canInvite=" + canInvite +
                ", isTemplate=" + isTemplate +
                '}';
    }
}
