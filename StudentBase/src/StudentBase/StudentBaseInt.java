package StudentBase;

public interface StudentBaseInt {

    // This is an interface that stores information about a single student. A student has a Family Name,
    // Other Names and a Rank, which is his year in college (Freshman, junior, sophomore, senior).
    // The interface has getters and setters for all 3 parameters.

    String getFamilyName();
    String getOtherNames();
    int getRank();

    int FRESHMAN = 1;
    int JUNIOR = 2;
    int SOPHOMORE = 3;
    int SENIOR = 4;

    void setFamilyName (String o);
    void setOtherName (String o);
    void setRank (int o);
}
