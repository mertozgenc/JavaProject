 import java.util.Random;
 import java.util.Scanner;
public class MayinTarlasi {
	int rowNumber,colNumber,size;
	int[][] map;
	int[][] board;
	boolean game=true;
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	
	MayinTarlasi(int rowNumber,int colNumber){
		this.colNumber=colNumber;
		this.rowNumber=rowNumber;
		this.map= new int[rowNumber][colNumber];
		this.board = new int[rowNumber][colNumber];
		this.size=rowNumber*colNumber;
	}
	public void run() {
		int row,col;
		  prepareGame();
		  print(map);
		  System.out.println("Oyun başladı :");
		  while(game) {
			  print(board);
			  System.out.println("Satır :");
			  row= scan.nextInt();
			  System.out.println("Sutun :");
			  col=scan.nextInt();
			  if(map[row][col]!=-1) {
				  check(row,col);
			  }else {
				  game=false;
				  System.out.println("Gamer over  ");
				  
			  }
			  
			  
		  }
	}
	public void check(int r,int c) {
		if(board[r][c]==0) {
			if((c < colNumber -1)&& map[r][c+1]==-1) {
				board[r][c+1]++;
			}
			if((r < rowNumber-3)&&map[r+1][c]==-1) {
				board[r][c]++;
			}
			if((r>0)&&map[r-1][c]==-1) {
				board[r][c]++;
			}
			if((c>0)&&(map[r][c-1]==-1)) {
				board[r][c]++;
			}
			if(board[r][c]==0) {
				board[r][c]=-2;
			}
			
		}
	}
	
	public void prepareGame() {
		int randRow,randCol,count=0;
		while(count != (size/4)) {
			randRow =rand.nextInt(rowNumber);
			randCol =rand.nextInt(colNumber);
			if(map[randRow][randCol] != -1) {
				map[randRow][randCol] = -1;
				count++;
			}
		}
	}

	public void print(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length;j++) {
				if(arr[i][j]>=0) 
					System.out.print( "        ");
				System.out.print(arr[i][j]+ "        ");
			}
			System.out.println();
			System.out.println();
			System.out.println();
		}
	}
	
	
	
	
	
}
