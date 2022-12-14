package basic.ex03arraylist;

import java.util.ArrayList;

public class Exam0220 {

  public static void main(String[] args) {
    class Member {

      String name;
      int age;

      public Member(String name, int age) {
        this.name = name;
        this.age = age;
      }

      @Override
      public String toString() {
        return "Member [name=" + name + ", age=" + age + "]";
      }

      @Override
      public boolean equals(Object obj) {
        if (this == obj)
          return true;
        if (obj == null)
          return false;
        if (getClass() != obj.getClass())
          return false;
        Member other = (Member) obj;
        if (age != other.age)
          return false;
        if (name == null) {
          if (other.name != null)
            return false;
        } else if (!name.equals(other.name))
          return false;
        return true;
      }
    }
    Member m1 = new Member("홍길동", 20);
    Member m2 = new Member("임꺽정", 30);
    Member m3 = new Member("유관순", 17);

    ArrayList<Member> list = new ArrayList<>();
    list.add(m1);
    list.add(m2);
    list.add(m3);

//    Object[] arr = list.toArray();
//    for (Object obj : arr) {
//      Member m = (Member) obj;
//      System.out.printf("이름: %s, 나이: %d\n", m.name, m.age);
//    }

    Member[] arr = list.toArray(new Member[0]);
    System.out.println(arr.length);
    for (Member m : arr) {
      System.out.printf("이름: %s, 나이: %d\n", m.name, m.age);
    }


  }
}
