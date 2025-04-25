package day2.prac;

import java.util.Comparator;

class Moving implements Comparable<Moving>,Comparator{
    String name;
    String alias ;
    int power;
    
    public Moving() {
		// TODO Auto-generated constructor stub
	}
    
	public Moving(String name, String alias, int power) {
		super();
		this.name = name;
		this.alias = alias;
		this.power = power;
	}

	@Override
	public String toString() {
		return "Moving [name=" + name + ", alias=" + alias + ", power=" + power + "]";
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAlias() {
		return alias;
	}



	public void setAlias(String alias) {
		this.alias = alias;
	}



	public int getPower() {
		return power;
	}



	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public int compareTo(Moving o) {
		return this.power-o.power;
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
