package day1.builder;

public class Acorn {
	
	String id;
	String pw;
 
	 
	private Acorn( Builder builder) {
		
		this.id  = builder.id;
		this.pw  = builder.pw;
	}
	
	
	@Override
	public String toString() {
		return "Acorn [id=" + id + ", pw=" + pw + "]";
	}


	static class Builder{
		
		String id;
		String pw;
		
		
		
		
		Builder id( String id) {
			this.id  = id;
			 
			return this;
		}
		
		Builder pw (String pw) {
			this.pw  = pw;
			return this;
		}
		
		
		Acorn build() { 
		 
			return new Acorn( this);
		}
		
		
	}
	

}
