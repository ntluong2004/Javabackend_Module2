package module2_final_exam;

public class Experience extends Candidate {
    private int expInYear;
    private String proSkill;

    public Experience(String id, String fullName, int birthDay, String phone, String email, int expInYear, String proSkill) {
        super(id, fullName, birthDay, phone, email, 0);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    @Override
    public void showMe() {
        System.out.println("[Exp] ID: " + getId() + ", Name: " + getFullName() + ", Skill: " + proSkill);
    }
}
