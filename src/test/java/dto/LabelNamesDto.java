package dto;

import java.util.Objects;

public class LabelNamesDto {

    private String orange;
    private String red;
    private String sky;
    private String pink;
    private String green;
    private String blue;
    private String lime;
    private String yellow;
    private String black;
    private String purple;

    public String getOrange() {
        return orange;
    }

    public LabelNamesDto setOrange(String orange) {
        this.orange = orange;
        return this;
    }

    public String getRed() {
        return red;
    }

    public LabelNamesDto setRed(String red) {
        this.red = red;
        return this;
    }

    public String getSky() {
        return sky;
    }

    public LabelNamesDto setSky(String sky) {
        this.sky = sky;
        return this;
    }

    public String getPink() {
        return pink;
    }

    public LabelNamesDto setPink(String pink) {
        this.pink = pink;
        return this;
    }

    public String getGreen() {
        return green;
    }

    public LabelNamesDto setGreen(String green) {
        this.green = green;
        return this;
    }

    public String getBlue() {
        return blue;
    }

    public LabelNamesDto setBlue(String blue) {
        this.blue = blue;
        return this;
    }

    public String getLime() {
        return lime;
    }

    public LabelNamesDto setLime(String lime) {
        this.lime = lime;
        return this;
    }

    public String getYellow() {
        return yellow;
    }

    public LabelNamesDto setYellow(String yellow) {
        this.yellow = yellow;
        return this;
    }

    public String getBlack() {
        return black;
    }

    public LabelNamesDto setBlack(String black) {
        this.black = black;
        return this;
    }

    public String getPurple() {
        return purple;
    }

    public LabelNamesDto setPurple(String purple) {
        this.purple = purple;
        return this;
    }

    @Override
    public String toString() {
        return "LabelNamesDto{" +
                "orange='" + orange + '\'' +
                ", red='" + red + '\'' +
                ", sky='" + sky + '\'' +
                ", pink='" + pink + '\'' +
                ", green='" + green + '\'' +
                ", blue='" + blue + '\'' +
                ", lime='" + lime + '\'' +
                ", yellow='" + yellow + '\'' +
                ", black='" + black + '\'' +
                ", purple='" + purple + '\'' +
                '}';
    }
}
