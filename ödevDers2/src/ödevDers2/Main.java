package ödevDers2;

public class Main {

	public static void main(String[] args) {
		

		Teacher engin = new Teacher (
				1,
				"Engin",
				"Demiroð",
				"engin_demirog.jpeg"
				);
		

		
		Course java = new Course (
				3,
				"java_react.jpeg", 
				"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA+REACT)", 
				0,
				engin
				);
		
		Course cSharp = new Course(
				2,
				"cSharp_angular.jpeg",
				"Yazýlým Geliþtirme Kampý (C#+ANGULAR)",
				0,
				engin);
		
		Course starter = new Course(
				1,
				"starter.jpeg",
				"Programlamaya Giriþ Ýçin Temel Kurs",
				0,
				engin);
		
		Course [] courses = {java,cSharp,starter};
		
		for (Course course : courses) {
			
			System.out.printf(
					"Kurs id: %s \n  Kurs Foto: %s \n  Kurs Ýsim: %s \n  Kurs Fiyat: %s \n  Kurs Öðretmen: %s %s \n ",
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
