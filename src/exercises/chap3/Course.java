package exercises.chap3;

import java.security.PrivateKey;
import java.util.HashMap;

public class Course {
  private String topic;
  private Teacher instructor;
  private HashMap<String, Integer> syllabus = new HashMap<>();

  public Course(String topic, Teacher instructor, HashMap<String, Integer> syllabus ){
    this.topic = topic;
    this.instructor= instructor;
    this.syllabus=syllabus;

  }


}
