public class MathCourse extends AbstractCourse implements Onsite{
    @Override
    public void conductClass() {
        System.out.println("Проведение урока математики");
    }

    @Override
    public void arrangeClassroom() {
        System.out.println("Организация класса для урока математики");
    }

}
