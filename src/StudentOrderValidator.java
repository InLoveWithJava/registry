public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {

        StudentOrder so = new StudentOrder();

        AnswerCityRegister cityAnswer = checkCityRegister(so);
        AnswerWedding weddingAnswer = checkWedding(so);
        AnswerChildren childrenAnswer = checkChildren(so);
        AnswerStudent studentAnswer = checkStudent(so);

        checkCityRegister(so);
        checkWedding(so);
        checkChildren(so);
        checkStudent(so);

        sendMail(so);
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("CityRegister is running");
        return new AnswerCityRegister();
    }

    static AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Wedding is running");
        return new AnswerWedding();
    }

    static AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children is running");
        return new AnswerChildren();
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Student is running");
        return new AnswerStudent();
    }

    static void sendMail(StudentOrder so) {

    }
}
