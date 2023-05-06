import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSONParser {
    public File input;
    public List<Weapon> weapons;

    public JSONParser(String inputStr) {
        this.input = new File(inputStr);
    }

    public List<Weapon> parseWeapons() {
        ObjectMapper mapper = new ObjectMapper();
        TypeFactory typeFactory =  mapper.getTypeFactory();
        try {
            this.weapons = mapper.readValue(this.input, typeFactory.constructCollectionType(List.class, Weapon.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return this.weapons;
    }
}
