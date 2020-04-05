package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@Data

public class Minifig {
    @XmlValue
    private String minifig;

    @XmlAttribute
    private int count;

    public Minifig() {}

    public Minifig(int count, String minifig) {
        this.count = count;
        this.minifig = minifig;
    }
}
