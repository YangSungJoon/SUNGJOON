package board1;

public class BoardMain {
	public static void main(String[] args) {
		
	
	Board[] boardArr = new Board[5];
	
			boardArr[0] = new Board("게시글1", "홍길동");
			boardArr[1] = new Board("게시글2", "홍길동");
			boardArr[2] = new Board("게시글3", "홍길동");
			boardArr[3] = new Board("게시글4", "홍길동");
			boardArr[4] = new Board("게시글5", "홍길동");
			
			for(Board board : boardArr) {
				System.out.println("================");
				System.out.println(board.title);
				System.out.println(board.content);
				System.out.println(board.hitcount);
				System.out.println(board.date);
				System.out.println(board.writer);
				System.out.println("================");
				
				
			}
			
			
			
			
	}		
}
