package bomberman.controller;

import java.awt.RenderingHints.Key;
import java.util.Scanner;

public class GamePlay {

	public void startGame() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the matrix size");	
		int matrixSize=input.nextInt();
		
		if(matrixSize%2==0 && matrixSize<=26) {
			char[][] charArray=new char[matrixSize][matrixSize];
			char rowChar='A';
			char colChar='A';
			for(int i=0;i<matrixSize;i++) {
				
				for(int j=0;j<matrixSize;j++) {
					if(i==0 && j==0) {
						charArray[i][j]=' ';
					}
					else if(i==0 && j!=0){
						charArray[i][j]=rowChar++; 
					}
					else if(i!=0 && j==0) {
						charArray[i][j]=colChar++;
					}
					else if(i==1 || i==matrixSize-1 || j==1 || j==matrixSize-1) {
						charArray[i][j]='*';
					}
				}
			}
			System.out.println("Enter the Player position");
			String PlayerPosition=input.next();
			int playerrow= (int)(PlayerPosition.charAt(0)-65+1);
			int playerCol= (int)(PlayerPosition.charAt(1)-65+1);
			charArray[playerrow][playerCol]='P';
			System.out.println("Enter the Key position");
			String KeyPosition=input.next();
			int keyrow= (int)(KeyPosition.charAt(0)-65+1);
			int keycol= (int)(KeyPosition.charAt(1)-65+1);
			charArray[keyrow][keycol]='K';
			System.out.println("Enter the villain count");
			int villainCount=input.nextInt();
			System.out.println("Enter the villains");
			for(int i=0;i<villainCount;i++) {
				String Villain=input.next();
				int rowvalue= (int)(Villain.charAt(0)-65+1); 
				int colValue=(int)(Villain.charAt(1)-65+1);
				charArray[rowvalue][colValue]='V';
			}
			System.out.println("Enter the brick count");
			int brickCount=input.nextInt();
			for(int i=0;i<brickCount;i++) {
				String brick=input.next();
				int rowValue=(int) (brick.charAt(0)-65+1);
				int colValue=(int) (brick.charAt(1)-65+1);
				charArray[rowValue][colValue]='B';
			}
			for(int i=0;i<matrixSize;i++) {
				for(int j=0;j<matrixSize;j++) {
					System.out.print(charArray[i][j]+" ");
				}
				System.out.println();
			}
		}
			
		else {
			startGame();
		}
	}
	

}
