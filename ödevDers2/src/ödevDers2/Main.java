package �devDers2;

public class Main {

	public static void main(String[] args) {
		

		Teacher engin = new Teacher (
				1,
				"Engin",
				"Demiro�",
				"engin_demirog.jpeg"
				);
		

		
		Course java = new Course (
				3,
				"java_react.jpeg", 
				"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA+REACT)", 
				0,
				engin
				);
		
		Course cSharp = new Course(
				2,
				"cSharp_angular.jpeg",
				"Yaz�l�m Geli�tirme Kamp� (C#+ANGULAR)",
				0,
				engin);
		
		Course starter = new Course(
				1,
				"starter.jpeg",
				"Programlamaya Giri� ��in Temel Kurs",
				0,
				engin);
		
		Course [] courses = {java,cSharp,starter};
		
		for (Course course : courses) {
			
			System.out.printf(
					"Kurs id: %s \n  Kurs Foto: %s \n  Kurs �sim: %s \n  Kurs Fiyat: %s \n  Kurs ��retmen: %s %s \n ",
					course.id, 
					course.img, 
					course.name, 
					course.price, 
					course.teacher.firstName,
					course.teacher.lastName
					);
			
		}
		
		
		
		
		}
	

}
