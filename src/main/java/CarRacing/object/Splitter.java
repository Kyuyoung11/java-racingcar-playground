package CarRacing.object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Splitter {
    private String delimiter;

    public Splitter() {}
    public Splitter(String delimiter) {
        this.delimiter = delimiter;
    }

    public String[] doSplit(String str) {
        return str.split(this.delimiter);
    }
}
