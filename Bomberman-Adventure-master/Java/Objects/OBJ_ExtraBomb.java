package Objects;

import Variables.Constant;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;

public class OBJ_ExtraBomb extends SuperObject {
    public OBJ_ExtraBomb(int x, int y) {
        this.x = x* Constant.TILE_SIZE;
        this.y = y* Constant.TILE_SIZE;
        name = "ExtraBomb";
        try {
            image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Items/ItemExtraBomb.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        collision = true;
    }
}
