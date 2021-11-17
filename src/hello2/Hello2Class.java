package hello2;
import java.util.Scanner;

public class Hello2Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int st;
		int a;
//		int classa;
		
		/*안녕하세요
		저는 누구 입니다
		잘부탁합니다*/
		
		// 문자열 변수 선언
		String b = "쿠로미";
		String c = "마이멜로디";
		a = 10;
		
		System.out.println("안녕하세요");
		System.out.println("저는"+b+"입니다");
		System.out.println("잘 부탁합니다");
		System.out.println(b+"의 친구는"+c+"입니다");
		System.out.print(c+"와 저는");System.out.print(a);System.out.print("살 입니다");

		/*
		// 문자열 변수 선언
		int tr = 0;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		//시도 횟수
		System.out.print("시도횟수를 입력하시오");
		tr = sc.nextInt();
		
		
		System.out.println(b+"에게"+c+"는 고백을"+tr+"번 시도하였습니다");
		System.out.println("---------------------------------------");
		
		System.out.println("1번 시도에 "+1+"회 차였습니다");
		System.out.println("슬퍼졌습니다");
		System.out.print("남은 시도 횟수는?");
		tr -= 1;
		System.out.println(tr);
		System.out.println();
				
		System.out.println("2번 시도에 "+1+"회 차였습니다");
		System.out.println("슬퍼졌습니다");
		System.out.print("남은 시도 횟수는?");
		tr -= 1;
		System.out.println(tr);
		System.out.println();
		
		int try_count = 10;
				
		for(int i = 0; i<try_count;i++) {
			System.out.println(i+"번 시도에"+(i+1)+"회 차였습니다");
			// 만약에 10번 차였으면
			if(i==9) {
				System.out.println("그녀와 끝났습니다");}
			// 만약에  10번이 아니면
			else {
				System.out.println("기회가"+(try_count-(i+1)+"번 남았습니다"));
			}
		} */
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		// 사귈 수 있는 확률높은 고백 횟수
		//1번 후보는 2번
		//2번 후보는 3번
		//3번 후보는 1번
		//4번 후보는 5번
		//5번 후보는 10번
		
		// 시도 횟수
		int tr;
		System.out.println();
		System.out.println("================================");
		System.out.print("시도횟수를 입력해주세요(0이상의 수): ");
		tr = sc.nextInt();
		
		int [] odds = {2,3,1,5,10};
		
		int man_num = 0;
		
		while(true) {
			for(int i=1;i<=odds[man_num];i++) {
				System.out.println(man_num+1+"번 후보는"+i+"회 고백을 시도했다");
				//if 고백 확률이 높을 때 고백하면
				if(i==odds[man_num]) {
					System.out.println("모솔 탈출");
					tr = tr-1;
				}else {
					System.out.println("솔로입니다");
				}
			}
			man_num++; //다음 솔로~
			System.out.print("남은 횟수는?");
			System.out.println(tr);
			
			if(tr==0) break;
		}
		System.out.println("고백성공");
	}

}