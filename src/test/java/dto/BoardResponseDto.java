package dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

public class BoardResponseDto {

    private String id;
    private String name;
    private String desc;
    private String idOrganization;
    private Object descData;
    private boolean closed;
    private String idEnterprise;
    private boolean pinned;
    private String url;
    private String shortUrl;
    private PrefsDto prefs;
    private Object limits;

    @JsonIgnoreProperties(ignoreUnknown = true)
    private LabelNamesDto labelNames;

    @JsonIgnoreProperties(ignoreUnknown = true)
    private Object organization;

    public Object getOrganization() {
        return organization;
    }

    public BoardResponseDto setOrganization(Object organization) {
        this.organization = organization;
        return this;
    }

    public String getId() {
        return id;
    }

    public BoardResponseDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BoardResponseDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public BoardResponseDto setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getIdOrganization() {
        return idOrganization;
    }

    public BoardResponseDto setIdOrganization(String idOrganization) {
        this.idOrganization = idOrganization;
        return this;
    }

    public Object getLimits() {
        return limits;
    }

    public BoardResponseDto setLimits(Object limits) {
        this.limits = limits;
        return this;
    }

    public Object getDescData() {
        return descData;
    }

    public BoardResponseDto setDescData(Object descData) {
        this.descData = descData;
        return this;
    }

    public boolean isClosed() {
        return closed;
    }

    public BoardResponseDto setClosed(boolean closed) {
        this.closed = closed;
        return this;
    }

    public String getIdEnterprise() {
        return idEnterprise;
    }

    public BoardResponseDto setIdEnterprise(String idEnterprise) {
        this.idEnterprise = idEnterprise;
        return this;
    }

    public boolean getPinned() {
        return pinned;
    }

    public BoardResponseDto setPinned(boolean pinned) {
        this.pinned = pinned;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public BoardResponseDto setUrl(String url) {
        this.url = url;
        return this;
    }

    public PrefsDto getPrefs() {
        return prefs;
    }

    public BoardResponseDto setPrefs(PrefsDto prefs) {
        this.prefs = prefs;
        return this;
    }

    public LabelNamesDto getLabelNames() {
        return labelNames;
    }

    public BoardResponseDto setLabelNames(LabelNamesDto labelNames) {
        this.labelNames = labelNames;
        return this;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public BoardResponseDto setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
        return this;
    }

    @Override
    public String toString() {
        return "BoardResponseDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", idOrganization='" + idOrganization + '\'' +
                ", descData=" + descData +
                ", closed=" + closed +
                ", idEnterprise='" + idEnterprise + '\'' +
                ", pinned=" + pinned +
                ", url='" + url + '\'' +
                ", shortUrl='" + shortUrl + '\'' +
                ", prefs=" + prefs +
                ", limits=" + limits +
                ", labelNames=" + labelNames +
                ", organization=" + organization +
                '}';
    }
}
