package lesson10;

/**
 * Перечисление с текушими курсами валют.
 */
public enum CurrencyCourses {
    RUBTODOL((double) 1 / 73),
    DOLTORUB(73),
    RUBTOEUR((double) 1 / 80),
    EURTORUB(80),
    DOLTOEUR(0.88238),
    EURTODOL(1.13);


    public double course;

    CurrencyCourses(double course) {
        this.course = course;
    }

    public double getCourse() {
        return course;
    }

}
