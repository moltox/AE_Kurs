
public class Person {

	protected String name;
	protected String vorname;
	protected String geburtsdatum;
	
	public Person(){
		this("some Name", null,null);
	}
	
	public Person(String name, String vorname, String geburtsdatum ){
		// Name ist Suchkriterium der ArrayList
		// deshalb ein Muss !
		if( null == name || name.isEmpty()){
			throw new IllegalArgumentException("Name ist Pflicht");
		}
		this.name = name;
		this.vorname = vorname;
		this.geburtsdatum = geburtsdatum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(String geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}
	@Override
	public String toString(){
		String str = "";
		str += "\nName         : " + getName();
		str += "\nVorname      : " + ((null == getVorname()) ? "" : getVorname());
		str += "\nGeburtsdatum : " + ((null==getGeburtsdatum()) ? "" : getGeburtsdatum());
		char line = '-';
		str += "\n";
		for(int c = 0; c < 65; c++)
			str += line;
		return str;
	}

}
