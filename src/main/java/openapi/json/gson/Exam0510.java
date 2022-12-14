package openapi.json.gson;

import com.google.gson.Gson;
import java.sql.Date;
import java.util.ArrayList;

public class Exam0510 {

  public static void main(String[] args) {
    Member m1 = new Member();
    m1.setNo(101);
    m1.setName("홍길동");
    m1.setEmail("hong@test.com");
    m1.setRegisteredDate(new Date(System.currentTimeMillis()));

    Member m2 = new Member();
    m2.setNo(102);
    m2.setName("임꺽정");
    m2.setEmail("leem@test.com");
    m2.setRegisteredDate(new Date(System.currentTimeMillis()));

    Member m3 = new Member();
    m3.setNo(103);
    m3.setName("안창호");
    m3.setEmail("ahn@test.com");
    m3.setRegisteredDate(new Date(System.currentTimeMillis()));

    ArrayList<Member> members = new ArrayList<>();
    members.add(m1);
    members.add(m2);
    members.add(m3);

    Project p = new Project();
    p.setNo(11);
    p.setTitle("제목");
    p.setContent("내용");
    p.setStartDate(Date.valueOf("2021-1-1"));
    p.setEndDate(Date.valueOf("2021-2-2"));
    p.setOwner(m2);
    p.setMembers(members);

    String jsonStr = new Gson().toJson(p);
    System.out.println(jsonStr);

    Project p2 = new Gson().fromJson(jsonStr, Project.class);
    System.out.println(p2);
  }
}
