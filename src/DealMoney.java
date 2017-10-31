import java.util.ArrayList;
import java.util.Scanner;

public class DealMoney {
	static int sumMoney = 0;
	static int inMoney = 0;
	static int numMoney = 0;

	static void input(){
		int con = 0;
		ArrayList<Integer> allMoney = new ArrayList<Integer>();

//		System.out.println("お金を入力してください。");

		do{
		System.out.println("お金を入力してください。");
		Scanner i1 = new Scanner(System.in);
		inMoney = Integer.parseInt(i1.nextLine());
		allMoney.add(checkInput(inMoney));
//		numMoney++;

		System.out.println("続けますか？\n1:はい\n2:いいえ");
		Scanner i2 = new Scanner(System.in);
		con = Integer.parseInt(i2.nextLine());
		}while(con == 1);

	    for (int i = 0 ; i < allMoney.size() ; i++){
	        sumMoney += allMoney.get(i);
	    }
	}

	static void output(){
	    System.out.println(sumMoney);
	}

	static int checkInput(int inMoney){
		switch(inMoney){
		case 1000:
		case 500:
		case 100:
		case 50:
		case 10:
			return inMoney;
		default:
			System.out.println(inMoney);
			return 0;
		}
	}
}
