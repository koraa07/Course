public class ProgrammingCourse extends AbstractCourse implements Online{
    @Override
    public void conductClass() {
        System.out.println("Проведение урока программирования");
    }

    @Override
    public void provideOnlineAccess() {
        System.out.println("Предоставление онлайн-доступа к курсу программирования");
    }
}
