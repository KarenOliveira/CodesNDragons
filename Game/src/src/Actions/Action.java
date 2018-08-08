package Actions;

public class Action {
	private int damage,id;
	private String name, debuff, buff;
	public static Action[] actionList = new Action[256];
	public static Action fireball = new Fireball();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDamage() {
		return damage;
	}
	public String getName() {
		return name;
	}
	public String getDebuff() {
		return debuff;
	}
	public String getBuff() {
		return buff;
	}
	
}
