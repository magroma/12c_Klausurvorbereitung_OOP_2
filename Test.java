

public class Test {

	//Felder (fields) | Attribute, Eigenschaften
	// private --> Kapselung / encapsulation/ data hiding
	
	private String name;
	private int age;
	
	// Sichtbarkeit | access (access modifiers)
	// public --> alle dürfen sehen/schreiben (+)
	// private --> NUR die eigene Klasse / Objekt (-)
	// protected --> NUR die eigene Klasse / Objekt + Subklassen (#)
	
	public Test(String name, int age) {   // Konstruktor / Constructor!!!! MERK DIR'S ENDLICH!!!!!
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {   // Getter, um die privaten Variablen in die "App" weiterzuleiten.
		return name; 
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {    // Setter
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	
	
	
}
