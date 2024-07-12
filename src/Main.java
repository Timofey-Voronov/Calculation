public class Main {
    public static void main(String[] args) {

        //Задача 1 - переменные dog, cat, paper

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 2

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 3

        var resultDog = dog - 3.5;
        var resultCat = cat - 1.6;
        var resultPaper = paper - 7639;

        System.out.println(resultDog);
        System.out.println(resultCat);
        System.out.println(resultPaper);


        // Задача 4 - переменная friend

        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);


        // Задача 5 - переменная frog

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);


        // Задача 6 - переменные Boxers

        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;

        var totalWeight = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общая масса двух бойцов " + totalWeight + " кг");

        var weightDifference = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница между массами бойцов " + weightDifference + " кг");

        // Задача 7

        var Difference1 = totalWeight % weightDifference;
        System.out.println("Остаток от деления между общим весом и разностью в весе бойцов " + Difference1);

        var Difference2 = weightSecondBoxer % weightFirstBoxer;
        System.out.println("Остаток от деления между весами бойцов " + Difference2);


        // Задача 8: решение задачи с помощью арифметических функций

        var totalTime = 640;
        var everyWorker = 8;

        var totalWorker = totalTime / everyWorker;
        System.out.println("Всего работников в компании — " + totalWorker + " человек");

        var moreWorker = totalWorker + 94;
        var totalTime2 = moreWorker * everyWorker;

        System.out.println("Если в компании работает " + moreWorker + " человек, то всего " + totalTime2 + " часа работы может быть поделено между сотрудниками");




    }
}