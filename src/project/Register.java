package project;

import java.util.ArrayList;
import java.util.List;

public class Register {
    List<String> studentsNameList = new ArrayList<>();
    private Student student;

    Register(List<String> studentsNameList, Student student){
        this.student = student;
        studentsNameList.add(this.student.getName());
    }

    List<String> getRegister(){
        return studentsNameList;
    }

    public List<String> getRegisterByLevel() {
        studentsNameList.add(student.getName());

    }
}
