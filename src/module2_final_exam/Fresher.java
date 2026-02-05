package module2_final_exam;

import java.util.Date;

public class Fresher extends Candidate {
    private String graduationDate, graduationRank, education;

    public Fresher(String id, String fullName, int birthDay, String phone, String email, String date, String rank, String edu) {
        super(id, fullName, birthDay, phone, email, 1);
        this.graduationDate = date; this.graduationRank = rank; this.education = edu;
    }

    @Override
    public void showMe() {
        System.out.println("[Fresher] ID: " + getId() + ", Name: " + getFullName() + ", Edu: " + education);
    }
}
