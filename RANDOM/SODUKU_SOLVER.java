//incomplete

public class SODUKU_SOLVER {
	
	static void solve()
public static boolean helper(char[][]board,int row,int col) {
	if(row==board.length) {
		return true;
	}
	int nr=0;int nc=0;
	if(col!=board.length) {
		nr=row;
	nc=col+1;}
	else {
		nr=row+1;
		nc=col;
	}
	if(board[row][col]!='.') {
		if(helper(board,nr,nc)) {
			return true;
		}
		else {
			for(int i=1;i<=9;i++) {
				if(isSafe(board,col,row,i)){
					board[row][col]=(char)(i+'0');
				}if(helper(board,nr,nc)) {
					return true;
				}
				else {
					board[row][col]='.';
				}
			}
		}
	}
	
	return false;
}
	 static boolean isSafe(char[][] board, int col, int row, int i) {
	
	return true;
}
	public static void main(String[] args) {
		
	}

}
