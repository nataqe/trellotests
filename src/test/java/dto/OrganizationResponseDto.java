package dto;

public class OrganizationResponseDto {

    // private String emoji":
    private String id;
    private String name;
    private String displayName;
    private String desc;
    private Object descData;
    private String url;
    private String website;
    private String teamType;
    private String logoHash;
    private String logoUrl;
    private Object products;
    private Object powerUps;
    private String idMemberCreator;
    private Object limits;

    public Object getLimits() {
        return limits;
    }

    public OrganizationResponseDto setLimits(Object limits) {
        this.limits = limits;
        return this;
    }

    public String getIdMemberCreator() {
        return idMemberCreator;
    }

    public OrganizationResponseDto setIdMemberCreator(String idMemberCreator) {
        this.idMemberCreator = idMemberCreator;
        return this;
    }

    public String getId() {
        return id;
    }

    public OrganizationResponseDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public OrganizationResponseDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getDisplayName() {
        return displayName;
    }

    public OrganizationResponseDto setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public OrganizationResponseDto setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public Object getDescData() {
        return descData;
    }

    public OrganizationResponseDto setDescData(Object descData) {
        this.descData = descData;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public OrganizationResponseDto setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getWebsite() {
        return website;
    }

    public OrganizationResponseDto setWebsite(String website) {
        this.website = website;
        return this;
    }

    public String getTeamType() {
        return teamType;
    }

    public OrganizationResponseDto setTeamType(String teamType) {
        this.teamType = teamType;
        return this;
    }

    public String getLogoHash() {
        return logoHash;
    }

    public OrganizationResponseDto setLogoHash(String logoHash) {
        this.logoHash = logoHash;
        return this;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public OrganizationResponseDto setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }

    public Object getProducts() {
        return products;
    }

    public OrganizationResponseDto setProducts(Object products) {
        this.products = products;
        return this;
    }

    public Object getPowerUps() {
        return powerUps;
    }

    public OrganizationResponseDto setPowerUps(Object powerUps) {
        this.powerUps = powerUps;
        return this;
    }


}
