package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import enums.*;

public class BoardPutRequestDto {

    @JsonProperty("name")
    private String name;

    @JsonProperty("desc")
    private String desc;

    @JsonProperty("idOrganization")
    private String idOrganization;

    @JsonProperty("closed")
    private boolean closed;

    @JsonProperty("subscribed")
    private String subscribed;

    @JsonProperty("prefs/permissionLevel")
    private String prefsPermissionLevel;

    @JsonProperty("prefs/selfJoin")
    private boolean prefsSelfJoin;

    @JsonProperty("prefs/cardCovers")
    private boolean prefsCardCovers;

    @JsonProperty("prefs/hideVotes")
    private boolean prefsHideVotes;

    @JsonProperty("prefs/invitations")
    private String prefsInvitations;

    @JsonProperty("prefs/voting")
    private String prefsVoting;

    @JsonProperty("prefs/comments")
    private String prefsComments;

    @JsonProperty("prefs/background")
    private String prefsBackground;

    @JsonProperty("prefs/cardAging")
    private String prefsCardAging;

    @JsonProperty("prefs/calendarFeedEnabled")
    private boolean prefsCalendarFeedEnabled;

    @JsonProperty("labelNames/green")
    private String labelNamesGreen;

    @JsonProperty("labelNames/yellow")
    private String labelNamesYellow;

    @JsonProperty("labelNames/orange")
    private String labelNamesOrange;

    @JsonProperty("labelNames/red")
    private String labelNamesRed;

    @JsonProperty("labelNames/purple")
    private String labelNamesPurple;

    @JsonProperty("labelNames/blue")
    private String labelNamesBlue;


    public String getName() {
        return name;
    }

    public BoardPutRequestDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public BoardPutRequestDto setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getIdOrganization() {
        return idOrganization;
    }

    public BoardPutRequestDto setIdOrganization(String idOrganization) {
        this.idOrganization = idOrganization;
        return this;
    }

    public boolean isClosed() {
        return closed;
    }

    public BoardPutRequestDto setClosed(boolean closed) {
        this.closed = closed;
        return this;
    }

    public String getSubscribed() {
        return subscribed;
    }

    public BoardPutRequestDto setSubscribed(String subscribed) {
        this.subscribed = subscribed;
        return this;
    }

    public String getPrefsPermissionLevel() {
        return prefsPermissionLevel;
    }

    public BoardPutRequestDto setPrefsPermissionLevel(PrefsPermissionLevel prefsPermissionLevel) {
        this.prefsPermissionLevel = prefsPermissionLevel.toString();
        return this;
    }

    public boolean getPrefsSelfJoin() {
        return prefsSelfJoin;
    }

    public BoardPutRequestDto setPrefsSelfJoin(boolean prefsSelfJoin) {
        this.prefsSelfJoin = prefsSelfJoin;
        return this;
    }

    public boolean getPrefsCardCovers() {
        return prefsCardCovers;
    }

    public BoardPutRequestDto setPrefsCardCovers(boolean prefsCardCovers) {
        this.prefsCardCovers = prefsCardCovers;
        return this;
    }

    public boolean getPrefsHideVotes() {
        return prefsHideVotes;
    }

    public BoardPutRequestDto setPrefsHideVotes(boolean prefsHideVotes) {
        this.prefsHideVotes = prefsHideVotes;
        return this;
    }

    public String getPrefsInvitations() {
        return prefsInvitations;
    }

    public BoardPutRequestDto setPrefsInvitations(PrefsInvitations prefsInvitations) {
        this.prefsInvitations = prefsInvitations.toString();
        return this;
    }

    public String getPrefsVoting() {
        return prefsVoting;
    }

    public BoardPutRequestDto setPrefsVoting(PrefsVoting prefsVoting) {
        this.prefsVoting = prefsVoting.toString();
        return this;
    }

    public String getPrefsComments() {
        return prefsComments;
    }

    public BoardPutRequestDto setPrefsComments(PrefsComments prefsComments) {
        this.prefsComments = prefsComments.toString();
        return this;
    }

    public String getPrefsBackground() {
        return prefsBackground;
    }

    public BoardPutRequestDto setPrefsBackground(PrefsBackground prefsBackground) {
        this.prefsBackground = prefsBackground.toString();
        return this;
    }

    public String getPrefsCardAging() {
        return prefsCardAging;
    }

    public BoardPutRequestDto setPrefsCardAging(PrefsCardAging prefsCardAging) {
        this.prefsCardAging = prefsCardAging.toString();
        return this;
    }

    public boolean getPrefsCalendarFeedEnabled() {
        return prefsCalendarFeedEnabled;
    }

    public BoardPutRequestDto setPrefsCalendarFeedEnabled(boolean prefsCalendarFeedEnabled) {
        this.prefsCalendarFeedEnabled = prefsCalendarFeedEnabled;
        return this;
    }

    public String getLabelNamesGreen() {
        return labelNamesGreen;
    }

    public BoardPutRequestDto setLabelNamesGreen(String labelNamesGreen) {
        this.labelNamesGreen = labelNamesGreen;
        return this;
    }

    public String getLabelNamesYellow() {
        return labelNamesYellow;
    }

    public BoardPutRequestDto setLabelNamesYellow(String labelNamesYellow) {
        this.labelNamesYellow = labelNamesYellow;
        return this;
    }

    public String getLabelNamesOrange() {
        return labelNamesOrange;
    }

    public BoardPutRequestDto setLabelNamesOrange(String labelNamesOrange) {
        this.labelNamesOrange = labelNamesOrange;
        return this;
    }

    public String getLabelNamesRed() {
        return labelNamesRed;
    }

    public BoardPutRequestDto setLabelNamesRed(String labelNamesRed) {
        this.labelNamesRed = labelNamesRed;
        return this;
    }

    public String getLabelNamesPurple() {
        return labelNamesPurple;
    }

    public BoardPutRequestDto setLabelNamesPurple(String labelNamesPurple) {
        this.labelNamesPurple = labelNamesPurple;
        return this;
    }

    public String getLabelNamesBlue() {
        return labelNamesBlue;
    }

    public BoardPutRequestDto setLabelNamesBlue(String labelNamesBlue) {
        this.labelNamesBlue = labelNamesBlue;
        return this;
    }
}
