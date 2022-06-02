import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class JavaReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Class student = Class.forName(Student.class.getName());
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method m:methods){
            methodList.add(m.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

    class Student implements Comparable<Student>{
        private String name;
        private String id;
        private String email;

        public String getName() {
            return name;
        }
        public void setId(String id) {
            this.id = id;
        }
        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public int compareTo(Student o) {
            return 0;
        }
    }
}


