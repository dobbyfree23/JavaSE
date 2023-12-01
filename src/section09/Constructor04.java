package section09;

class Movie {
	public String title;	// 제목
	public String genre;	// 장르
	public int runningTime;	// 러닝타임
	
	// 생성자
	public Movie() {
		this.title = "서울의봄";
		this.genre = "드라마";
		this.runningTime = 141;
	}
	
	// 오버로딩
	public Movie(String title) {
		this.title = title;
		this.genre = "드라마";
		this.runningTime = 141;
	}
	
	public void printInfo() {
		System.out.println("title: " + title);
		System.out.println("genre: " + genre);
		System.out.println("runningTime: " + runningTime);
	}
}

public class Constructor04 {
	
	public static void main(String[] args) {
		
		Movie movie1 = new Movie();
		movie1.printInfo();
		
		System.out.println("====================");
		
		Movie movie2 = new Movie("괴물");
		movie2.genre = "스릴러/드라마";
		movie2.runningTime = 126;
		
		movie2.printInfo();
		
	}

}



