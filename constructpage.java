
public class constructpage {
	
		String name;
		int age;
		
		public constructpage(String name2, int age2) {
			name = name2;
			age = age2;
			
			
		}
		
		public boolean isAdult(){
			if (age> 18) {
				return true;
				
			}else {
				return false;
			}
		}
		
	}


