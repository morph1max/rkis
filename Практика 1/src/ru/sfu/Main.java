package ru.sfu;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final int ADD = 1;
    public static final int REMOVE = 2;
    public static final int SHOW = 3;
    public static final int COMPARE = 4;
    public static final int EXIT = 5;

    public static final int ADD_TRANSPORT = 1;
    public static final int ADD_CAR = 2;
    public static final int ADD_TRAIN = 3;
    public static final int ADD_EXPRESS = 4;

    public static final int MIN_WEIGHT_TON = 0;
    public static final int MIN_COST_DOLLAR = 3000;
    public static final int MIN_FLOOR = 1;
    public static final int MIN_WAGON = 1;

    // Метод для ввода целого числа
    public static int inputInt(String inputName) {
        System.out.println("Введите " + inputName + " = ");
        Scanner scan = new Scanner(System.in);
        int num;

        while (true) {
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                scan.nextLine();
                return num;
            }
            else {
                System.out.println("Вводится не число!");
                scan.nextLine();
            }
        }
    }

    // Метод для ввода строки
    public static String inputStr(String inputName) {
        System.out.println("Введите " + inputName + " = ");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static void main(String[] args) {
        ArrayList<Transport> list = new ArrayList<Transport>();

        exit:
        while (true) {
            System.out.println("\n1-добавить объект\n" +
                    "2-удалить объект\n" +
                    "3-вывести все объекты\n" +
                    "4-сравнить 2 объекта(по индексам)\n" +
                    "5-выход\n");

            int amountIndexObjects = list.size() - 1;

            int choice = inputInt("выбор");
            if (choice < 1 || choice > 5) System.out.println("Такого выбора нет!");
            switch (choice) {

                case ADD:
                    System.out.println("1-добавить Transport\n" +
                            "2-добавить Car\n" +
                            "3-добавить Train\n" +
                            "4-добавить Express\n");

                    choice = inputInt("выбор");
                    if (choice < 1 || choice > 4) System.out.println("Такого выбора нет!");

                    String color = null;
                    int weight = 0;

                    switch (choice) {

                        case ADD_TRANSPORT:
                            color = inputStr("цвет");
                            weight = inputInt("вес в тоннах");
                            if (weight < MIN_WEIGHT_TON) {
                                System.out.println("Не бывает таких лёгких транспортов!");
                                break;
                            }

                            Transport transport = new Transport(color, weight);
                            list.add(transport);
                            System.out.println("Добавлено!");
                            break;

                        case ADD_CAR:
                            color = inputStr("цвет");
                            weight = inputInt("вес в тоннах");
                            if (weight < MIN_WEIGHT_TON) {
                                System.out.println("Не бывает таких лёгких транспортов!");
                                break;
                            }

                            String brand = inputStr("бренд");
                            int cost = inputInt("цену в долларах");
                            if (cost < MIN_COST_DOLLAR) {
                                System.out.println("Не бывает таких дешёвых машин!");
                                break;
                            }

                            Car car = new Car(color, weight, brand, cost);
                            list.add(car);
                            System.out.println("Добавлено!");
                            break;

                        case ADD_TRAIN:
                            color = inputStr("цвет");
                            weight = inputInt("вес в тоннах");
                            if (weight < MIN_WEIGHT_TON) {
                                System.out.println("Не бывает таких лёгких транспортов!");
                                break;
                            }

                            String nameFactory = inputStr("название завода-изготовителя");
                            int amountWagons = inputInt("количество вагонов");
                            if (amountWagons < MIN_WAGON) {
                                System.out.println("Не бывает так мало вагонов!");
                                break;
                            }

                            Train train = new Train(color, weight, nameFactory, amountWagons);
                            list.add(train);
                            System.out.println("Добавлено!");
                            break;

                        case ADD_EXPRESS:
                            color = inputStr("цвет");
                            weight = inputInt("вес в тоннах");
                            if (weight < MIN_WEIGHT_TON) {
                                System.out.println("Не бывает таких лёгких транспортов!");
                                break;
                            }

                            nameFactory = inputStr("название завода-изготовителя");
                            amountWagons = inputInt("количество вагонов");
                            if (amountWagons < MIN_WAGON) {
                                System.out.println("Не бывает так мало вагонов!");
                                break;
                            }

                            String name = inputStr("название экспресса");
                            int amountFloor = inputInt("количество этажей");
                            if (amountFloor < MIN_FLOOR) {
                                System.out.println("Не бывает так мало этажей!");
                                break;
                            }

                            Express express = new Express(color, weight, nameFactory, amountWagons, name, amountFloor);
                            list.add(express);
                            System.out.println("Добавлено!");
                            break;
                    }
                    break;

                case REMOVE:
                    if (list.size() == 0) {
                        System.out.println("Список и так пуст.");
                        break;
                    }

                    System.out.println("Введите индекс элемента, который хотите удалить" +
                            "(от 0 до " + amountIndexObjects + ")");

                    int removeIndex = inputInt("выбор");
                    if (removeIndex < 0 || removeIndex > amountIndexObjects) {
                        System.out.println("Индекс выходит за границу.");
                    } else {
                        list.remove(removeIndex);
                        System.out.println("Элемент удалён!");
                    }
                    break;

                case SHOW:
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(i + ". " + list.get(i));
                    }
                    if (list.size() == 0) System.out.println("Список пуст.");
                    break;

                case COMPARE:
                    if (list.size() < 2) {
                        System.out.println("Недостаточно элементов в списке для сравнения.");
                        break;
                    }

                    System.out.println("Индекс должен быть от 0 до " + amountIndexObjects);

                    int compareNum1 = inputInt("индекс 1 объекта для сравнения");
                    if (compareNum1 < 0 || compareNum1 > amountIndexObjects) {
                        System.out.println("Индекс вышел за границу.");
                        break;
                    }

                    int compareNum2 = inputInt("индекс 2 объекта для сравнения");
                    if (compareNum2 < 0 || compareNum2 > amountIndexObjects) {
                        System.out.println("Индекс вышел за границу.");
                        break;
                    }

                    if (list.get(compareNum1).equals(list.get(compareNum2))) System.out.println("Элементы равны");
                    else System.out.println("Элементы не равны.");

                    break;

                case EXIT:
                    break exit;
            }
        }
    }
}
