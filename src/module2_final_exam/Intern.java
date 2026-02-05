package module2_final_exam;

public class Intern extends Candidate {
    private String major, semester, universityName;

    public Intern(String id, String fullName, int birthDay, String phone, String email, String major, String sem, String uni) {
        super(id, fullName, birthDay, phone, email, 2);
        this.major = major; this.semester = sem; this.universityName = uni;
    }

    @Override
    public void showMe() {
        System.out.println("[Intern] ID: " + getId() + ", Name: " + getFullName() + ", Uni: " + universityName);
    }
}
