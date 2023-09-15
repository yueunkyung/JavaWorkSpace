package ch16.sec05.exam03;

public class ConstructorReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		/*
		Member member1 = person.getMember1(new Creatable1() {			
			@Override
			public Member create(String id) {				
				return new Member(id);
			}
		},"아이디1");
		System.out.println(member1);
		 */
		Member member1 = person.getMember1((id)->new Member(id),"아이디1");
		System.out.println(member1);
		Member member2 = person.getMember1(Member::new,"아이디1");
		System.out.println(member2);
		
		Member member3 = person.getMember2((a,b)->new Member(a,b),"kin","킨");
		Member member4 = person.getMember2(Member::new,"kin","킨");
		/*
		Member member1 = person.getMember1(new Creatable1() {
			@Override
			public Member create(String id) {				
				return new Member(id);
			}
		},"아이디1");
		System.out.println(member1);
		
		Member m1 = person.getMember1( Member :: new, "");
		System.out.println(m1);
		System.out.println();

		Member m2 = person.getMember2( Member :: new, "", "");
		System.out.println(m2);
		*/
	}
}