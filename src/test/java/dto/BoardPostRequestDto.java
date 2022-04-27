package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import enums.*;

public class BoardPostRequestDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("desc")
    private String desc;

    @JsonProperty("idOrganization")
    private String idOrganization;

    @JsonProperty("defaultLabels")
    private boolean defaultLabels;

    @JsonProperty("defaultLists")
    private boolean defaultLists;

    @JsonProperty("idBoardSource")
    private String idBoardSource;

    @JsonProperty("keepFromSource")
    private String keepFromSource;

    @JsonProperty("powerUps")
    private String powerUps;

    @JsonProperty("prefs_permissionLevel")
    private String prefsPermissionLevel;

    @JsonProperty("prefs_voting")
    private String prefsVoting;

    @JsonProperty("prefs_comments")
    private String prefsComments;

    @JsonProperty("prefs_invitations")
    private String prefsInvitations;

    @JsonProperty("prefs_selfJoin")
    private boolean prefsSelfJoin;

    @JsonProperty("prefs_cardCovers")
    private boolean prefsCardCovers;

    @JsonProperty("prefs_background")
    private String prefsBackground;

    @JsonProperty("prefs_cardAging")
    private String prefsCardAging;


    public String getId() {
        return id;
    }

    public BoardPostRequestDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BoardPostRequestDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public BoardPostRequestDto setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getIdOrganization() {
        return idOrganization;
    }

    public BoardPostRequestDto setIdOrganization(String idOrganization) {
        this.idOrganization = idOrganization;
        return this;
    }

    public String getPrefsPermissionLevel() {
        return prefsPermissionLevel;
    }

    public BoardPostRequestDto setPrefsPermissionLevel(PrefsPermissionLevel prefsPermissionLevel) {
        this.prefsPermissionLevel = prefsPermissionLevel.toString();
        return this;
    }

    public String getPrefsVoting() {
        return prefsVoting;
    }

    public BoardPostRequestDto setPrefsVoting(PrefsVoting prefsVoting) {
        this.prefsVoting = prefsVoting.toString();
        return this;
    }

    public String getPrefsComments() {
        return prefsComments;
    }

    public BoardPostRequestDto setPrefsComments(PrefsComments prefsComments) {
        this.prefsComments = prefsComments.toString();
        return this;
    }

    public String getPrefsInvitations() {
        return prefsInvitations;
    }

    public BoardPostRequestDto setPrefsInvitations(PrefsInvitations prefsInvitations) {
        this.prefsInvitations = prefsInvitations.toString();
        return this;
    }

    public boolean getPrefsSelfJoin() {
        return prefsSelfJoin;
    }

    public BoardPostRequestDto setPrefsSelfJoin(boolean prefsSelfJoin) {
        this.prefsSelfJoin = prefsSelfJoin;
        return this;
    }

    public boolean getPrefsCardCovers() {
        return prefsCardCovers;
    }

    public BoardPostRequestDto setPrefsCardCovers(boolean prefsCardCovers) {
        this.prefsCardCovers = prefsCardCovers;
        return this;
    }

    public String getPrefsBackground() {
        return prefsBackground;
    }

    public BoardPostRequestDto setPrefsBackground(PrefsBackground prefsBackground) {
        this.prefsBackground = prefsBackground.toString();
        return this;
    }

    public String getPrefsCardAging() {
        return prefsCardAging;
    }

    public BoardPostRequestDto setPrefsCardAging(PrefsCardAging prefsCardAging) {
        this.prefsCardAging = prefsCardAging.toString();
        return this;
    }

    public boolean isDefaultLabels() {
        return defaultLabels;
    }

    public BoardPostRequestDto setDefaultLabels(boolean defaultLabels) {
        this.defaultLabels = defaultLabels;
        return this;
    }

    public boolean isDefaultLists() {
        return defaultLists;
    }

    public BoardPostRequestDto setDefaultLists(boolean defaultLists) {
        this.defaultLists = defaultLists;
        return this;
    }

    public String getIdBoardSource() {
        return idBoardSource;
    }

    public BoardPostRequestDto setIdBoardSource(String idBoardSource) {
        this.idBoardSource = idBoardSource;
        return this;
    }

    public String getKeepFromSource() {
        return keepFromSource;
    }

    public BoardPostRequestDto setKeepFromSource(KeepFromSource keepFromSource) {
        this.keepFromSource = keepFromSource.toString();
        return this;
    }

    public String getPowerUps() {
        return powerUps;
    }

    public BoardPostRequestDto setPowerUps(PowerUps powerUps) {
        this.powerUps = powerUps.toString();
        return this;
    }
}
