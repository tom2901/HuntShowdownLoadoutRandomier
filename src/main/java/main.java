import java.util.List;

public class main {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser("src/main/resources/api/weaponinfo.json");
        List<Weapon> weapons = parser.parseWeapons();
    }
}
