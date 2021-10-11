package project;

import java.util.ArrayList;
import java.util.List;

public class Register {
    List<Nameable> names;
    List<String> studentsNameList = new ArrayList<>();
    private Student student;;

    Register(List<Nameable> names){
        this.names = names;
    }

    List<String> getRegister(){
        studentsNameList.add(student.getName());
        return studentsNameList;
    }
}
