import java.util.*;
public class TicTac{

	static char board[][] = new char[3][3];
	public static void main(String[] args){

		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				board[i][j] = 'Z';
		Scanner sc = new Scanner(System.in);
		int count = 1;
		do{
			if(count%2 == 1){
			       System.out.println("Enter the turn for A");
			       int x = sc.nextInt();
			       int y = sc.nextInt();
			       if(x < 3 && y < 3 && board[x][y] == 'Z'){
				       board[x][y] = 'X';
				       count++;
				}
			       else
				       System.out.println("Enter the proper input for square");
			}
			else{
			       System.out.println("Enter the turn for B");
                               int x = sc.nextInt();
                               int y = sc.nextInt();
                               if(x < 3 && y < 3 &&  board[x][y] == 'Z'){
                                       board[x][y] = 'O';
                                       count++;
                                }
                               else
                                       System.out.println("Enter the proper input for square");
                        }
			String winner = getWinner();
			//System.out.println("Winner is "+winner);
			if(winner.length() == 1){
				System.out.println("GAME OVER!! Winner is "+winner);
				break;
			}
		}while(count <= 9);

		if(count > 9)
			System.out.println("Match Drawn");
		sc.close();
	}

	public static String getWinner(){

		for(int i = 0; i < 3; i++){

			int a =0, b=0;
			for(int j=0;j<3;j++){
				
				if(board[i][j] == 'X')
					a++;
				if(board[i][j] == 'O')
					b++;
				//System.out.println("Board for i "+i+" and j "+j+" is "+board[i][j]+" boolean is "+(board[i][j] == 'O'));
			}
			//System.out.println("a is "+a+" b is "+b);
			if(a == 3)
				return "A";
			if(b == 3)
				return "B";
		}
		for(int j = 0; j < 3; j++){

                        int a =0, b=0;
                        for(int i=0;i<3;i++){

                                if(board[i][j] == 'X')
                                        a++;
                                if(board[i][j] == 'O')
                                        b++;
				//System.out.println("Board for i "+i+" and j "+j+" is "+board[i][j]);
                        }
                        if(a == 3)
                                return "A";
                        if(b == 3)
                                return "B";
                }
		if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') return "A";
		if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') return "B";
		

		if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') return "A";
		if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') return "B";

		return "DRAW";
	}
}