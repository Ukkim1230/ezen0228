package p2012;

import java.util.ArrayList;

public class ListTest {
	public static void main(String[]args) {
		ArrayList <Human> people = new ArrayList<>(); //Human
		for(int i=1;i<=10;i++) {
			// 0-0.99999... * => 0-99.999... => 0-99+1 => 1-100
			int age = (int)(Math.random()*1000)+1;
			int weight = (int)(Math.random()*50)+50;
			Human h = new Human();
			h.setName("이름"+1);
			h.setAddress("주소"+1);
			h.setAge(age);
			h.setWeight(weight);
			people.add(h);
		}
		System.out.print(people);
		for(int i =0;i<people.size();i++) {
			Human h = people.get(i);
			System.out.println(h);
		}
		for(Human h:people) {
			System.out.print(h);
		}
	}
}
