import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {

        int correctCount = 0, wrongCount = 0;
        final int NUMBER_ANSWER_OPTIONS = 4;

        String[] questions = {
                "В файл с каким расширением компилируется java-файл",
                "С помощью какой команды git можно получить полную копию удаленного репозитория",
                "Какой применяется цикл, когда не известно количество итераций"
        };

        String[][] answerOptions = {
                {"1. cs", "2. java", "3. class", "4. exe"},
                {"1. commit", "2. push", "3. clone", "4. copy"},
                {"1. while", "2. for", "3. loop", "4. do"}
        };

        int[] correctAnswers = {3, 3, 1};
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);

            for (int j = 0; j < answerOptions[i].length; j++) {
                System.out.println(answerOptions[i][j]);
            }

            System.out.print("Ваш ответ: ");
            answer = scanner.nextInt();
            while (answer<1 || answer>NUMBER_ANSWER_OPTIONS) {
                System.out.println("Введено некорректное число. Попробуйте еще раз.");
                System.out.print("Ваш ответ: ");
                answer = scanner.nextInt();
            }

            if (answer == correctAnswers[i]) {
                System.out.println("Правильно");
                correctCount++;
            } else {
                System.out.println("Неправильно");
                wrongCount++;
            }
            answer = 0;
        }

        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }

}
