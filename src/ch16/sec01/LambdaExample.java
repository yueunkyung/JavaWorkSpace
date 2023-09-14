package ch16.sec01;

class AA implements Calculable{

	@Override
	public void calculate(int x, int y) {
		System.out.println(x+y);
		
	}
	
}



public class LambdaExample {
	public static void main(String[] args) {
		
		action(new AA());
		
		action(new Calculable() {
			
			@Override
			public void calculate(int x, int y) {
				System.out.println(x-y);
				
			}
		});
		
		action((aa,bb)->{System.out.println(aa*bb);});
		
		Calculable d = (aa,bb)->{System.out.println(aa*bb);};		
		d.calculate(1,2);
		 
		action((x, y) -> {
			int result = x + y;
			System.out.println("result: " + result);
		});

		action((x, y) -> {
			int result = x - y;
			System.out.println("result: " + result);
		});
	}

	//동작을 사용한 쪽에서 정의하여 보내준다.
	public static void action(Calculable var) {
		//데이터
		int x = 10;
		int y = 4;
		//데이터 처리
		var.calculate(x, y);
	}
}