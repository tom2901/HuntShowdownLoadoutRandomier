import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
@JsonIgnoreProperties({"melee_damage_type", "stats", "image", "legendary_skin"})
public class Weapon {
    public String id;
    public String name;
    public String desc;
    public String category;
    public int cost;
    public Boolean canBeDualWield;
    static class unlock {
        public Integer rank;
        public String condition;
    }
    public unlock unlock = new unlock();
    public int ammo;
    public int[] specialAmmo;

    @JsonSetter("description")
    public void setDesc(String desc) { this.desc = desc; }

    @JsonSetter("can_be_dual")
    public void setDual(boolean canBeDualWield) { this.canBeDualWield = canBeDualWield; }

    @JsonSetter("special_ammo")
    public void setSpecialAmmo(int[] specialAmmo) { this.specialAmmo = specialAmmo; }

}
