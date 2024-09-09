package app;

import java.util.List;

public class Controller {

    private final StudentGroupService studentGroupService;
    private final StudentStreamService studentStreamService;

    public Controller() {
        studentGroupService = new StudentGroupService();
        studentStreamService = new StudentStreamService();
    }


    public void removeStudentByFIO(String firstName, String lastName, String middleName) {
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList() {
        return studentGroupService.getSortedStudentList();
    }

    public List<Student> getSortedStudentListByFIO() {
        return studentGroupService.getSortedStudentListByFIO();
    }

    public List<StudentStream> getSortedStudentStreamListBySize(List<StudentStream> studentStreamList) {
        return studentStreamService.getSortedStudentStreamListBySize(studentStreamList);
    }


}
