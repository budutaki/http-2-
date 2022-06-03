import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {

    String date;
    String explanation;
    String type;
    String version;
    String title;
    String url;


    public Data(
            @JsonProperty ("date") String date,
            @JsonProperty ("explanation") String explanation,
            @JsonProperty ("media_type") String type,
            @JsonProperty ("service_version") String version,
            @JsonProperty ("title") String title,
            @JsonProperty ("url") String url) {
        this.date = date;
        this.explanation = explanation;
        this.type = type;
        this.version = version;
        this.title = title;
        this.url = url;
    }

    public String getDate() {
        return date;
    }

    public String getExplanation() {
        return explanation;
    }

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Data{" +
                "date='" + date + '\'' +
                ", explanation='" + explanation + '\'' +
                ", media_type='" + type + '\'' +
                ", service_version='" + version + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
