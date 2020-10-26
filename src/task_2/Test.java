package task_2;

public class Test
{
    public static void main(String[] args)
    {
        UserInterface []students = new Student[4];
        students[0] = new Student ("Федякова Анна Геннадьевна", 4);
        students[1] = new Student ("Литвин Александр Сергеевич", 2);
        students[2] = new Student ("Картышов Сергей Андреевич", 5);
        students[3] = new Student ("Козлова Анастасия Викторовна", 1);
        Sort.quickSort ((Student []) students, 0, students.length - 1);
        Find.findName ((Student [])students, "Козлова Анастасия Викторовна");
        Find.findName ((Student [])students, "Федякова Анна Геннадьевна");
        Find.findName ((Student [])students, "Кантеров Николай Валерьевич");
    }
}