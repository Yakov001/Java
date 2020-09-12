package StudentBase;


// Student Base class represents a student. It implements StudentBaseInt interface.

public class StudentBase implements StudentBaseInt  {
    private String FamilyName;
    private String OtherName;
    private int Rank;


    public  StudentBase ( String a, String b, int c){
        FamilyName = a;
        OtherName = b;
        Rank = c;
    }



    @Override
    public String getFamilyName() {
        return FamilyName;
    }

    @Override
    public String getOtherNames() {
        return OtherName;
    }

    @Override
    public int getRank() {
        return Rank;
    }

    @Override
    public void setFamilyName(String o) {
        FamilyName = o;
    }

    @Override
    public void setOtherName(String o) {
        OtherName = o;
    }

    @Override
    public void setRank(int o) {
        Rank = o;
    }
}
