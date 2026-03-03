package module2_final_exam;

import java.util.*;

public abstract class Candidate {
    public static int candidateCount = 0; // Static field
    private String id, fullName, phone, email;
    private int birthDay, candidateType;
    private List<Certificate> certificates = new ArrayList<>();

    public Candidate(String id, String fullName, int birthDay, String phone, String email, int type) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.candidateType = type;
        candidateCount++;
    }

    public abstract void showMe(); // Abstract method

    // Getters
    public String getId() { return id; }
    public String getFullName() { return fullName; }
    public int getBirthDay() { return birthDay; }
    public int getCandidateType() { return candidateType; }
}

