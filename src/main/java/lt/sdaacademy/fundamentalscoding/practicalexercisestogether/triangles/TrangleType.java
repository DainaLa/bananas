package lt.sdaacademy.fundamentalscoding.practicalexercisestogether.triangles;

public enum TrangleType {
    EQUILATER( "Lygiakrastis"),
    EQUAL_SIDE( "lygiasonis"),
        OBTUSE("bukas");
    private String tiangleDescription;

    TrangleType(String tiangleDescription) {
        this.tiangleDescription = tiangleDescription;
    }
}
