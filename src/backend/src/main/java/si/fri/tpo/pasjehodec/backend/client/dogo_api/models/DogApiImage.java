package si.fri.tpo.pasjehodec.backend.client.dogo_api.models;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class DogApiImage implements Serializable {
    @Serial
    private static final long serialVersionUID = 7156526077883281623L;

    public String id;
    public int width;
    public int height;
    public String url;
}
